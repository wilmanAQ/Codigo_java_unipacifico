/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestionestudiantes;

/**
 *
 * @author Wilmar
 */
public class Curso {
    
    // Atributos privados para encapsulamiento
    private String nombre;
    private String codigo;

    // Constructor
    public Curso(String nombre, String codigo) {
        this.nombre = nombre;
        this.codigo = codigo;
    }

    // Métodos Getter y Setter
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    // Método para mostrar información del curso
    public void mostrarInfo() {
        System.out.println("Curso: " + nombre + ", Código: " + codigo);
    }
    
}
