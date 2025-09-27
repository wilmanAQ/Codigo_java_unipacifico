
package pooparcialcorte2d4;


public class Auto extends Vehiculo {
    
    private int numPuertas;

    public Auto(String marca, String modelo, int numPuertas, Propietario propietario) {
        super(marca, modelo, propietario);
        this.numPuertas = numPuertas;
    }

    @Override
    public void mostrarInfoVehiculo() {
        super.mostrarInfoVehiculo();
        System.out.println("Número de puertas: " + numPuertas);
    }
    
    
    
}
