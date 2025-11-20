package co.edu.unbosque.escenario3.beans;

import co.edu.unbosque.escenario3.model.ProductosMasVendidos;
import co.edu.unbosque.escenario3.service.ReporteService;
import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Inject;
import jakarta.inject.Named;

import java.io.Serializable;
import java.util.List;

@Named("reporteBean")
@RequestScoped
public class ReporteBean implements Serializable {

    @Inject
    private ReporteService reporteService;

    private int mes = 1;
    private List<ProductosMasVendidos> resultados;

    public void generar() {
        resultados = reporteService.productosMasVendidos(mes, 50);
    }

    // getters/setters
    public int getMes(){ return mes; }
    public void setMes(int mes){ this.mes = mes; }
    public List<ProductosMasVendidos> getResultados(){ return resultados; }
}
