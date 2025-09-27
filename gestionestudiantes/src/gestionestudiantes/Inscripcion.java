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
public class Inscripcion {
    
    // Atributos privados para encapsulamiento
    private Estudiante estudiante;
    private Curso curso;
    private String fechaInscripcion;

    // Constructor
    public Inscripcion(Estudiante estudiante, Curso curso, String fechaInscripcion) {
        this.estudiante = estudiante;
        this.curso = curso;
        this.fechaInscripcion = fechaInscripcion;
    }

    // Métodos Getter y Setter
    public Estudiante getEstudiante() {
        return estudiante;
    }

    public void setEstudiante(Estudiante estudiante) {
        this.estudiante = estudiante;
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    public String getFechaInscripcion() {
        return fechaInscripcion;
    }

    public void setFechaInscripcion(String fechaInscripcion) {
        this.fechaInscripcion = fechaInscripcion;
    }

    // Método para mostrar información de la inscripción
    public void mostrarInfo() {
        System.out.println("Fecha de Inscripción: " + fechaInscripcion);
        estudiante.mostrarInfo();
        curso.mostrarInfo();
    }
    
}
