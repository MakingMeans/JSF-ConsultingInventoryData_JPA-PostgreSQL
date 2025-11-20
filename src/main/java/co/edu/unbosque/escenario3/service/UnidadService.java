package co.edu.unbosque.escenario3.service;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

import java.util.List;

import co.edu.unbosque.escenario3.dao.UnidadDAO;
import co.edu.unbosque.escenario3.model.Unidad;

@ApplicationScoped
public class UnidadService {

    @Inject
    private UnidadDAO unidadDAO;

    public List<Unidad> listar() {
        return unidadDAO.listar();
    }
}
