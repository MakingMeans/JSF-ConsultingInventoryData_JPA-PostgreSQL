package co.edu.unbosque.escenario3.service;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.persistence.EntityManager;
import java.util.List;
import co.edu.unbosque.escenario3.model.FacturaDetalle;

@ApplicationScoped
public class FacturaDetalleService {

    @Inject
    private EntityManager em;

    public List<FacturaDetalle> listarPorFactura(Long idFactura) {
        return em.createQuery("SELECT d FROM FacturaDetalle d WHERE d.factura.id = :id", FacturaDetalle.class)
                 .setParameter("id", idFactura)
                 .getResultList();
    }

    public void guardar(FacturaDetalle detalle) {
        em.getTransaction().begin();
        em.persist(detalle);
        em.getTransaction().commit();
    }
}
