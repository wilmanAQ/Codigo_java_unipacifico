
package gestionvehiculos;

public class MainGestionVehiculos {

    
    public static void main(String[] args) {
       // Creación de instancias de Motor
        Motor motor1 = new Motor("V8", 450);
        Motor motor2 = new Motor("Eléctrico", 300);

        // Creación de instancias de Vehiculo
        Vehiculo vehiculo1 = new Vehiculo("Ferrari", "F8 Tributo", motor1);
        Vehiculo vehiculo2 = new Vehiculo("Tesla", "Model S", motor2);

        // Mostrar información de los vehículos
        vehiculo1.mostrarInfo();
        System.out.println("-------------------------");
        vehiculo2.mostrarInfo();
    }
    
}
