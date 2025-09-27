/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestionmedicos;

/**
 *
 * @author Wilmar
 */
public class Medico {
    // Atributos privados para encapsulamiento
    private String nombre;
    private String especialidad;

    // Constructor
    public Medico(String nombre, String especialidad) {
        this.nombre = nombre;
        this.especialidad = especialidad;
    }

    // Métodos Getter y Setter
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    // Método para mostrar información del médico
    public void mostrarInfo() {
        System.out.println("Médico: " + nombre + ", Especialidad: " + especialidad);
    }
    
}
