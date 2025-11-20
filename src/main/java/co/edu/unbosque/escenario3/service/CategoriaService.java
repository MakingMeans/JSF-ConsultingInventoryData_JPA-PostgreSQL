package co.edu.unbosque.escenario3.service;

import java.util.List;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

import co.edu.unbosque.escenario3.dao.CategoriaDAO;
import co.edu.unbosque.escenario3.model.Categoria;

@ApplicationScoped
public class CategoriaService {

    @Inject
    private CategoriaDAO categoriaDAO;

    public List<Categoria> listar() {
        return categoriaDAO.listar();
    }

    public Categoria obtenerPorId(int id) {
        return categoriaDAO.obtenerPorId(id);
    }
}
