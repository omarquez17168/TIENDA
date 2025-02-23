import java.util.ArrayList;
import java.util.List;

public class Tienda {
    private String nombre;
    private String direccion;
    private String telefono;
    private List<Producto> productos;

    public Tienda(String nombre, String direccion, String telefono) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.productos = new ArrayList<>();
    }

    public String getNombre() {return nombre;}
    public String getDireccion() {return direccion;}
    public String getTelefono() {return telefono;}

    public void agregarProducto(Producto producto) {
        productos.add(producto);
        System.out.println("Producto agregado: " + producto.getNombre());
    }

    public void listarProductos() {
        System.out.println("\n--- Inventario de la Tienda ---");
        for (Producto p : productos) {
            System.out.println(p);
        }
    }

    public Producto buscarProducto(int codigo) {
        for (Producto p : productos) {
            if (p.getCodigo() == codigo) {
                return p;
            }
        }
        return null;
    }
}