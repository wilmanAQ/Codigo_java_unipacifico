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
public class Paciente {
    
    // Atributos privados para encapsulamiento
    private String nombre;
    private String numHistoriaClinica;

    // Constructor
    public Paciente(String nombre, String numHistoriaClinica) {
        this.nombre = nombre;
        this.numHistoriaClinica = numHistoriaClinica;
    }

    // Métodos Getter y Setter
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNumHistoriaClinica() {
        return numHistoriaClinica;
    }

    public void setNumHistoriaClinica(String numHistoriaClinica) {
        this.numHistoriaClinica = numHistoriaClinica;
    }

    // Método para mostrar información del paciente
    public void mostrarInfo() {
        System.out.println("Paciente: " + nombre + ", Historia Clínica: " + numHistoriaClinica);
    }
    
}
