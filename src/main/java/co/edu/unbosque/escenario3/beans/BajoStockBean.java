package co.edu.unbosque.escenario3.beans;

import co.edu.unbosque.escenario3.service.ElementoService;
import co.edu.unbosque.escenario3.model.Elemento;
import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Inject;
import jakarta.inject.Named;

import java.io.Serializable;
import java.util.List;

@Named("bajoStockBean")
@RequestScoped
public class BajoStockBean implements Serializable {

    @Inject
    private ElementoService elementoService;

    private List<Elemento> productos;

    public void cargar() {
        productos = elementoService.productosBajoStock();
    }

    public List<Elemento> getProductos() { return productos; }
}
