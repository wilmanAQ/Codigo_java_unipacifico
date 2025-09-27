
package gestiondeinventario;

  // Clase Alimento que hereda de Producto
public class Alimento extends Producto {
    private String fechaExpiracion; // Atributo específico para alimentos

    public Alimento(String codigo, String nombre, double precio, String fechaExpiracion) {
        super(codigo, nombre, precio);
        this.fechaExpiracion = fechaExpiracion;
    }

    public String getFechaExpiracion() {
        return fechaExpiracion;
    }

    @Override
    public String mostrarInformacion() {
        return "Alimento - Código: " + getCodigo() + ", Nombre: " + getNombre() + 
               ", Precio: $" + getPrecio() + ", Fecha Expiración: " + fechaExpiracion;
    }
}
