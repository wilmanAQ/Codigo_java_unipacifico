
package gestiondeinventario;



// Clase que representa el supermercado y maneja el inventario
public class Supermercado {
    private String nombre;
    private Inventario inventario;

    public Supermercado(String nombre) {
        this.nombre = nombre;
        this.inventario = new Inventario();
    }

    public String getNombre() {
        return nombre;
    }

    public Inventario getInventario() {
        return inventario;
    }

    public void agregarProducto(Producto producto) {
        inventario.agregarProducto(producto);
    }

    public void eliminarProducto(Producto producto) {
        inventario.eliminarProducto(producto);
    }
}


