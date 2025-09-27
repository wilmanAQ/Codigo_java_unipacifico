
package tallerherenvehiculo;


public class TallerHerenVehiculo {

    
    public static void main(String[] args) {
        Vehiculo miCoche = new Coche();
        Vehiculo miMoto = new Moto();
        
        miCoche.describir(); // Este es un coche
        miMoto.describir();  // Esta es una moto
    }
    
}
