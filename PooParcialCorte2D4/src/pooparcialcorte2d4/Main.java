
package pooparcialcorte2d4;


public class Main {

    
    public static void main(String[] args) {
    
        Propietario propietario1 = new Propietario("Carlos Gomez", "Calle 123");
        Auto auto1 = new Auto("Toyota", "Corolla", 4, propietario1);
        Moto moto1 = new Moto("Honda", "CBR", true, propietario1);

        propietario1.agregarVehiculo(auto1);
        propietario1.agregarVehiculo(moto1);

        propietario1.mostrarInfoPersona();
        propietario1.mostrarVehiculos();
    
    }
    
}
