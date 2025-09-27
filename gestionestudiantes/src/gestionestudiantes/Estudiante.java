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
public class Estudiante {
    
    // Atributos privados para encapsulamiento
    private String nombre;
    private String matricula;

    // Constructor
    public Estudiante(String nombre, String matricula) {
        this.nombre = nombre;
        this.matricula = matricula;
    }

    // Métodos Getter y Setter
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    // Método para mostrar información del estudiante
    public void mostrarInfo() {
        System.out.println("Estudiante: " + nombre + ", Matrícula: " + matricula);
    }
    
}
