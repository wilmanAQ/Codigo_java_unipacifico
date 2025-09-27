
package tallerherenpersona1;


public class TallerHerenPersona1 {

    
    public static void main(String[] args) {
         Estudiante estudiante = new Estudiante();
        estudiante.nombre = "Ana López";
        estudiante.edad = 21;
        estudiante.direccion = "Calle Falsa 123";
        estudiante.numeroEstudiante = "E12345";

        estudiante.mostrarDetallesEstudiante(); // Mostrar detalles del estudiante
    }
    
}
