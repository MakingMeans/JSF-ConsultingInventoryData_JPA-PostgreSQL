package co.edu.unbosque.escenario3.model;

public class ProductosMasVendidos {
    private Integer id;
    private String nombre;
    private Long totalVendido;

    public ProductosMasVendidos() {}

    public ProductosMasVendidos(Integer id, String nombre, Long totalVendido) {
        this.id = id;
        this.nombre = nombre;
        this.totalVendido = totalVendido;
    }

    // getters/setters
    public Integer getId() { return id; }
    public void setId(Integer id) { this.id = id; }
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }
    public Long getTotalVendido() { return totalVendido; }
    public void setTotalVendido(Long totalVendido) { this.totalVendido = totalVendido; }
}
