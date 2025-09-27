
package agegacion2;

import java.util.Arrays;
public class Main {

    
    public static void main(String[] args) {
        
        // Creación de las ruedas (agregación)
        Rueda rueda1 = new Rueda("Michelin", 17);
        Rueda rueda2 = new Rueda("Pirelli", 17);
        Rueda rueda3 = new Rueda("Bridgestone", 17);
        Rueda rueda4 = new Rueda("Goodyear", 17);

        // Creación del carro con modelo, lista de ruedas, y los atributos del motor (composición)
        // El motor se crea dentro del constructor del carro, lo que refleja la relación de composición
        Carro carro = new Carro("Toyota Corolla", Arrays.asList(rueda1, rueda2, rueda3, rueda4), 150, "Gasolina"); //convierte el Arrays en una lista

        // Mostrar los detalles del carro, motor y ruedas
        carro.mostrarDetalles();

        // Encender el carro (lo que encenderá el motor también)
        carro.encenderCarro();
    }
    
}
