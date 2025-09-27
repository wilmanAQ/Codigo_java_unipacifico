
package gestionlibros;

public class Autor {
    // Atributos privados para encapsulamiento
    private String nombre;
    private String nacionalidad;

    // Constructor
    public Autor(String nombre, String nacionalidad) {
        this.nombre = nombre;
        this.nacionalidad = nacionalidad;
    }

    // Métodos Getter y Setter
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    // Método para mostrar información del autor
    public void mostrarInfo() {
        System.out.println("Autor: " + nombre + ", Nacionalidad: " + nacionalidad);
    }
}