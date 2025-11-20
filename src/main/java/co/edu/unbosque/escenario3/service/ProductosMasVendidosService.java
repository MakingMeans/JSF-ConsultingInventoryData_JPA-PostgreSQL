package co.edu.unbosque.escenario3.service;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.persistence.EntityManager;
import java.util.List;

@ApplicationScoped
public class ProductosMasVendidosService {

    @Inject
    private EntityManager em;

    public List<Object[]> consultar() {
        String sql = """
            SELECT p.nombre, SUM(fd.cantidad) AS total
            FROM factura_detalle fd
            JOIN producto p ON p.id = fd.producto_id
            GROUP BY p.nombre
            ORDER BY total DESC
            LIMIT 10
        """;

        return em.createNativeQuery(sql)
                 .getResultList();
    }
}
