
package pooparcialcorte2d4;
import java.util.ArrayList;

public class Propietario extends Persona {
    
    private ArrayList<Vehiculo> vehiculos;  // Agregación
    
    public Propietario(String nombre, String direccion) {
        super(nombre, direccion);
        vehiculos = new ArrayList<>();
    }

    public void agregarVehiculo(Vehiculo vehiculo) {
        vehiculos.add(vehiculo);
    }

    public void mostrarVehiculos() {
        System.out.println("Vehículos de " + getNombre() + ":");
        for (Vehiculo vehiculo : vehiculos) {
            vehiculo.mostrarInfoVehiculo();
        }
    }
    
}
