
package agregacioncarromotorconductor;


public class Carro {
    private String marca;
    private Motor motor; // Agregación: un carro "tiene un" motor
    private Conductor conductor; // Agregación: un carro "tiene un" conductor

    public Carro(String marca, Motor motor, Conductor conductor) {
        this.marca = marca;
        this.motor = motor;
        this.conductor = conductor;
    }

    public void encenderCarro() {
        System.out.println("Encendiendo el carro " + marca + "...");
        motor.encender();
    }

    public void conducirCarro() {
        System.out.println("El carro " + marca + " está en movimiento.");
        conductor.conducir();
    }
    
}
