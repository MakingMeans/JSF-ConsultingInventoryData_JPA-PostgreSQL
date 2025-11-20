package co.edu.unbosque.escenario3.dao;

import co.edu.unbosque.escenario3.model.ProductosMasVendidos;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.persistence.EntityManager;

import java.util.List;

@ApplicationScoped
public class ReporteDAO {

    @Inject
    private EntityManager em;

    public List<ProductosMasVendidos> productosMasVendidos(int mes, int limite) {

        return em.createQuery("""
            SELECT new co.edu.unbosque.escenario3.model.ProductosMasVendidos(
                e.id, e.nmbreElemnto, SUM(fd.cntdadElemnto)
            )
            FROM FacturaDetalle fd
            JOIN fd.factura f
            JOIN fd.elemento e
            WHERE EXTRACT(MONTH FROM f.fchaFctura) = :mes
            GROUP BY e.id, e.nmbreElemnto
            ORDER BY SUM(fd.cntdadElemnto) DESC
        """, ProductosMasVendidos.class)
        .setParameter("mes", mes)
        .setMaxResults(limite)
        .getResultList();
    }
}
