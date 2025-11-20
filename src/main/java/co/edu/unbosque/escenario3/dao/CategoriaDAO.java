package co.edu.unbosque.escenario3.dao;

import java.util.List;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;

import co.edu.unbosque.escenario3.model.Categoria;

@ApplicationScoped
public class CategoriaDAO {

    @Inject
    private EntityManager em;

    public List<Categoria> listar() {
        return em.createQuery("SELECT c FROM Categoria c", Categoria.class)
                 .getResultList();
    }

    public Categoria obtenerPorId(int id) {
        return em.find(Categoria.class, id);
    }

    @Transactional
    public void guardar(Categoria categoria) {
        em.persist(categoria);
    }
}
