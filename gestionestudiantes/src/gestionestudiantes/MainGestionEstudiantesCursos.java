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
public class MainGestionEstudiantesCursos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Creación de instancias de Estudiante
        Estudiante estudiante1 = new Estudiante("Ana Pérez", "2023001");
        Estudiante estudiante2 = new Estudiante("Luis García", "2023002");

        // Creación de instancias de Curso
        Curso curso1 = new Curso("Matemáticas", "MAT101");
        Curso curso2 = new Curso("Programación", "PROG201");

        // Creación de instancias de Inscripcion
        Inscripcion inscripcion1 = new Inscripcion(estudiante1, curso1, "01/09/2023");
        Inscripcion inscripcion2 = new Inscripcion(estudiante1, curso2, "02/09/2023");
        Inscripcion inscripcion3 = new Inscripcion(estudiante2, curso2, "03/09/2023");

        // Mostrar información de las inscripciones
        System.out.println("----- Inscripciones -----");
        inscripcion1.mostrarInfo();
        System.out.println("--------------------------");
        inscripcion2.mostrarInfo();
        System.out.println("--------------------------");
        inscripcion3.mostrarInfo();
    }
    
}
