
package gestiondeinventario;



    
    
// Clase Bebida que hereda de Producto
public class Bebida extends Producto {
    private double volumen; // Atributo específico para bebidas

    public Bebida(String codigo, String nombre, double precio, double volumen) {
        super(codigo, nombre, precio);
        this.volumen = volumen;
    }

    public double getVolumen() {
        return volumen;
    }

    @Override
    public String mostrarInformacion() {
        return "Bebida - Código: " + getCodigo() + ", Nombre: " + getNombre() + 
               ", Precio: $" + getPrecio() + ", Volumen: " + volumen + "L";
    }
}

