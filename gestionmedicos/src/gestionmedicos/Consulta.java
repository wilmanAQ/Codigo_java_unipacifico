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
public class Consulta {
    
    // Atributos privados para encapsulamiento
    private Medico medico;
    private Paciente paciente;
    private String fechaConsulta;

    // Constructor
    public Consulta(Medico medico, Paciente paciente, String fechaConsulta) {
        this.medico = medico;
        this.paciente = paciente;
        this.fechaConsulta = fechaConsulta;
    }

    // Métodos Getter y Setter
    public Medico getMedico() {
        return medico;
    }

    public void setMedico(Medico medico) {
        this.medico = medico;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public String getFechaConsulta() {
        return fechaConsulta;
    }

    public void setFechaConsulta(String fechaConsulta) {
        this.fechaConsulta = fechaConsulta;
    }

    // Método para mostrar información de la consulta
    public void mostrarInfo() {
        System.out.println("Fecha de Consulta: " + fechaConsulta);
        medico.mostrarInfo();
        paciente.mostrarInfo();
    }
}
