
package composicioncarromotorconductor;


public class Carro {
    
    private String marca;
    private Motor motor; // Composición: Motor no puede existir sin Carro
    private Conductor conductor; // Composición: Conductor no puede existir sin Carro

    public Carro(String marca, String tipoMotor, String nombreConductor) {
        this.marca = marca;
        this.motor = new Motor(tipoMotor); // El motor se crea dentro del carro
        this.conductor = new Conductor(nombreConductor); // El conductor también
    }

    public void encenderCarro() {
        System.out.println("Encendiendo el carro " + marca + "...");
        motor.encender();
        motor.apagar();
    }

    public void conducirCarro() {
        System.out.println("El carro " + marca + " está en movimiento.");
        conductor.conducir();
    }
    
}
