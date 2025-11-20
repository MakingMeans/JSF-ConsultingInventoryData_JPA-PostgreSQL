package co.edu.unbosque.escenario3.beans;

import co.edu.unbosque.escenario3.model.Elemento;
import co.edu.unbosque.escenario3.service.ElementoService;
import jakarta.faces.context.FacesContext;
import jakarta.faces.view.ViewScoped;
import jakarta.inject.Inject;
import jakarta.inject.Named;

import java.io.Serializable;
import java.util.Map;

@Named("detalleBean")
@ViewScoped
public class DetalleBean implements Serializable {

    @Inject
    private ElementoService elementoService;

    private int id;
    private Elemento elemento;

    public void cargar() {
        if (elemento != null) return;
        if (id == 0) {
            Map<String,String> params = FacesContext.getCurrentInstance().getExternalContext().getRequestParameterMap();
            if (params.containsKey("id")) {
                try { id = Integer.parseInt(params.get("id")); } catch (NumberFormatException ignored) {}
            }
        }
        if (id > 0) {
            elemento = elementoService.obtenerPorId(id);
        }
    }

    public int getId(){ return id; }
    public void setId(int id){ this.id = id; }
    public Elemento getElemento(){ return elemento; }
}
