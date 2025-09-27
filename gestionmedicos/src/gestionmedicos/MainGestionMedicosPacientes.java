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
public class MainGestionMedicosPacientes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // Creación de instancias de Medico
        Medico medico1 = new Medico("Dr. Juan Martínez", "Cardiología");
        Medico medico2 = new Medico("Dra. María López", "Pediatría");

        // Creación de instancias de Paciente
        Paciente paciente1 = new Paciente("Carlos Gómez", "HC1001");
        Paciente paciente2 = new Paciente("Lucía Fernández", "HC1002");

        // Creación de instancias de Consulta
        Consulta consulta1 = new Consulta(medico1, paciente1, "05/10/2023");
        Consulta consulta2 = new Consulta(medico2, paciente1, "06/10/2023");
        Consulta consulta3 = new Consulta(medico1, paciente2, "07/10/2023");

        // Mostrar información de las consultas
        System.out.println("----- Consultas -----");
        consulta1.mostrarInfo();
        System.out.println("----------------------");
        consulta2.mostrarInfo();
        System.out.println("----------------------");
        consulta3.mostrarInfo();
    }
    
}
