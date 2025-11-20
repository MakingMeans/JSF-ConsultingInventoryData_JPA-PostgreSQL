package co.edu.unbosque.escenario3.service;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

import java.util.List;

import co.edu.unbosque.escenario3.dao.ReporteDAO;
import co.edu.unbosque.escenario3.model.ProductosMasVendidos;

@ApplicationScoped
public class ReporteService {

    @Inject
    private ReporteDAO reporteDAO;

    public List<ProductosMasVendidos> productosMasVendidos(int mes, int limite) {
        return reporteDAO.productosMasVendidos(mes, limite);
    }
}
