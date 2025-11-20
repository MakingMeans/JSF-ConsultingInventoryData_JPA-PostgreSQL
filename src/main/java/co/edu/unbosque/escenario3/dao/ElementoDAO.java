package co.edu.unbosque.escenario3.dao;

import co.edu.unbosque.escenario3.model.Elemento;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.persistence.EntityManager;
import jakarta.persistence.criteria.*;

import java.util.ArrayList;
import java.util.List;

@ApplicationScoped
public class ElementoDAO {

    @Inject
    private EntityManager em;

    public List<Elemento> buscar(String query, String categoria, Double minPrice, int limit, int offset) {

        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Elemento> cq = cb.createQuery(Elemento.class);
        Root<Elemento> e = cq.from(Elemento.class);

        List<Predicate> preds = new ArrayList<>();

        if (query != null && !query.isBlank()) {
            preds.add(cb.like(cb.lower(e.get("nmbreElemnto")), "%" + query.toLowerCase() + "%"));
        }

        if (categoria != null && !categoria.isBlank()) {
            preds.add(cb.like(cb.lower(e.get("ctgriaElemnto").get("nmbreCtgria")), "%" + categoria.toLowerCase() + "%"));
        }

        if (minPrice != null) {
            preds.add(cb.greaterThanOrEqualTo(e.get("precioVentaAc"), minPrice));
        }

        cq.where(preds.toArray(Predicate[]::new));
        cq.orderBy(cb.asc(e.get("id")));

        return em.createQuery(cq)
                 .setFirstResult(offset)
                 .setMaxResults(limit)
                 .getResultList();
    }

    public Elemento obtenerPorId(int id) {
        return em.find(Elemento.class, id);
    }

    public List<Elemento> productosBajoStock() {
        return em.createQuery("""
            SELECT e FROM Elemento e
            WHERE e.exstnciaElemnto < e.stockMinimo
            ORDER BY e.exstnciaElemnto ASC
        """, Elemento.class).getResultList();
    }
}
