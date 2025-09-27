package tallerherenpersona1;

public class Estudiante extends Persona {
    String numeroEstudiante;

    void mostrarDetallesEstudiante() {
        mostrarDetalles(); // Llamar al método de la clase base
        System.out.println("Número de Estudiante: " + numeroEstudiante);
    }
    
}
