
package pooparcialcorte2d4;


public class Moto extends Vehiculo{
    
    private boolean tieneCasco;

    public Moto(String marca, String modelo, boolean tieneCasco, Propietario propietario) {
        super(marca, modelo, propietario);
        this.tieneCasco = tieneCasco;
    }

    @Override
    public void mostrarInfoVehiculo() {
        super.mostrarInfoVehiculo();
        System.out.println("Incluye casco: " + (tieneCasco ? "Sí" : "No"));
    }
    
}
