
package gestiondeinventario;


    

// Clase base para representar un producto
public abstract class Producto {
    private String codigo;
    private String nombre;
    private double precio;
    private int cantidadVendida; // Para contar cuántas veces se ha vendido

    public Producto(String codigo, String nombre, double precio) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.precio = precio;
        this.cantidadVendida = 0;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public int getCantidadVendida() {
        return cantidadVendida;
    }

    // Incrementa la cantidad vendida de un producto
    public void incrementarVentas() {
        this.cantidadVendida++;
    }

    // Método abstracto para mostrar la información específica de cada tipo de producto
    public abstract String mostrarInformacion();
}
