import java.time.LocalDate;

public class Producto {
    private int codigo;
    private String nombre;
    private TipoProducto tipo;
    private LocalDate fechaExp;
    private String fabricante;
    private int cantidad;
    private double precio;

    public Producto(int codigo, String nombre, TipoProducto tipo, LocalDate fechaExp, String fabricante, int cantidad, double precio) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.tipo = tipo;
        this.fechaExp = fechaExp;
        this.fabricante = fabricante;
        this.cantidad = cantidad;
        this.precio = precio;
    }

    public int getCodigo() { return codigo; }
    public String getNombre() { return nombre; }
    public TipoProducto getTipo() { return tipo; }
    public LocalDate getFechaExp() { return fechaExp; }
    public String getFabricante() { return fabricante; }
    public int getCantidad() { return cantidad; }
    public double getPrecio() { return precio; }

    public void setCantidad(int cantidad) { this.cantidad = cantidad; }
    public void setPrecio(double precio) { this.precio = precio; }

    @Override
    public String toString() {
        return "Producto{" +
                "codigo=" + codigo +
                ", nombre='" + nombre + '\'' +
                ", tipo=" + tipo +
                ", fechaExp=" + fechaExp +
                ", fabricante='" + fabricante + '\'' +
                ", cantidad=" + cantidad +
                ", precio=" + precio +
                '}';
    }
}
