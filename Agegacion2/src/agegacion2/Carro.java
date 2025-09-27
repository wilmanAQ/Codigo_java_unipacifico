
package agegacion2;

import java.util.List;

public class Carro {
    
    private String modelo;       // El modelo del carro
    private List<Rueda> ruedas;  // Agregación: El carro tiene varias ruedas que pueden existir por sí solas
    private Motor motor;         // Composición: El carro contiene un motor que no puede existir sin él

    // Constructor que inicializa el carro y crea el motor internamente
    public Carro(String modelo, List<Rueda> ruedas, int potenciaMotor, String tipoMotor) {
        this.modelo = modelo;
        this.ruedas = ruedas;
        // Aquí es donde el Carro crea su propio Motor, mostrando composición
        this.motor = new Motor(potenciaMotor, tipoMotor);
    }

    // Método que muestra los detalles del carro, motor y ruedas
    public void mostrarDetalles() {
        System.out.println("Modelo de carro: " + modelo);
        // Mostrar detalles del motor
        System.out.println("Detalles del motor: " + motor.toString());
        // Mostrar detalles de cada rueda
        for (Rueda rueda : ruedas) {
            System.out.println(rueda.toString());
        }
    }

    // Método que enciende el carro llamando al método encender() del motor
    public void encenderCarro() {
        motor.encender();
        System.out.println("El carro está encendido.");
    }
    
}
