package co.edu.unbosque.escenario3.service;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.persistence.EntityManager;
import java.util.List;
import co.edu.unbosque.escenario3.model.Factura;

@ApplicationScoped
public class FacturaService {

    @Inject
    private EntityManager em;

    public List<Factura> listarTodas() {
        return em.createQuery("SELECT f FROM Factura f", Factura.class)
                 .getResultList();
    }

    public Factura buscarPorId(Long id) {
        return em.find(Factura.class, id);
    }

    public void guardar(Factura factura) {
        em.getTransaction().begin();
        em.persist(factura);
        em.getTransaction().commit();
    }

    public void actualizar(Factura factura) {
        em.getTransaction().begin();
        em.merge(factura);
        em.getTransaction().commit();
    }

    public void eliminar(Long id) {
        Factura f = em.find(Factura.class, id);
        if (f != null) {
            em.getTransaction().begin();
            em.remove(f);
            em.getTransaction().commit();
        }
    }
}
