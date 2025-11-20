package co.edu.unbosque.escenario3.dao;

import co.edu.unbosque.escenario3.model.Unidad;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.persistence.EntityManager;

import java.util.List;

@ApplicationScoped
public class UnidadDAO {

    @Inject
    private EntityManager em;

    public List<Unidad> listar() {
        return em.createQuery("SELECT u FROM Unidad u ORDER BY u.nmbreUndad", Unidad.class)
                 .getResultList();
    }
}
