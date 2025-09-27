
package tallerherenempleado;


public class TallerHerenEmpleado {

    
    public static void main(String[] args) {
        Empleado gerente = new Gerente();
        Empleado desarrollador = new Desarrollador();
        
        gerente.mostrarInformacion();     // Información del gerente
        desarrollador.mostrarInformacion(); // Información del desarrollador
    }
    
}
