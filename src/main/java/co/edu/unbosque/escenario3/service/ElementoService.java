package co.edu.unbosque.escenario3.service;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

import java.util.List;

import co.edu.unbosque.escenario3.dao.ElementoDAO;
import co.edu.unbosque.escenario3.model.Elemento;

@ApplicationScoped
public class ElementoService {

    @Inject
    private ElementoDAO elementoDAO;

    public List<Elemento> buscar(String query, String categoria, Double minPrice, int limit, int offset) {
        return elementoDAO.buscar(query, categoria, minPrice, limit, offset);
    }

    public Elemento obtenerPorId(int id) {
        return elementoDAO.obtenerPorId(id);
    }

    public List<Elemento> productosBajoStock() {
        return elementoDAO.productosBajoStock();
    }
}
