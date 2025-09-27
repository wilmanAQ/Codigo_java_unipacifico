
package gestiondeinventario;


import java.util.ArrayList;
import java.util.List;

// Clase que maneja el inventario de productos
public class Inventario {
    private List<Producto> productos;

    public Inventario() {
        productos = new ArrayList<>();
    }

    // Agregar un producto al inventario
    public void agregarProducto(Producto producto) {
        productos.add(producto);
    }

    // Eliminar un producto del inventario
    public void eliminarProducto(Producto producto) {
        productos.remove(producto);
    }

    // Obtener todos los productos del inventario
    public List<Producto> getProductos() {
        return productos;
    }

    // Funciones para obtener el producto más caro, más barato, más vendido y menos vendido
    public Producto obtenerProductoMasCaro() {
        Producto productoMasCaro = null;
        for (Producto producto : productos) {
            if (productoMasCaro == null || producto.getPrecio() > productoMasCaro.getPrecio()) {
                productoMasCaro = producto;
            }
        }
        return productoMasCaro;
    }

    public Producto obtenerProductoMasBarato() {
        Producto productoMasBarato = null;
        for (Producto producto : productos) {
            if (productoMasBarato == null || producto.getPrecio() < productoMasBarato.getPrecio()) {
                productoMasBarato = producto;
            }
        }
        return productoMasBarato;
    }

    public Producto obtenerProductoMasVendido() {
        Producto productoMasVendido = null;
        for (Producto producto : productos) {
            if (productoMasVendido == null || producto.getCantidadVendida() > productoMasVendido.getCantidadVendida()) {
                productoMasVendido = producto;
            }
        }
        return productoMasVendido;
    }

    public Producto obtenerProductoMenosVendido() {
        Producto productoMenosVendido = null;
        for (Producto producto : productos) {
            if (productoMenosVendido == null || producto.getCantidadVendida() < productoMenosVendido.getCantidadVendida()) {
                productoMenosVendido = producto;
            }
        }
        return productoMenosVendido;
    }
}
