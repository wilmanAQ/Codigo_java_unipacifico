/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agregacion1;

import java.util.Arrays;
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
               // Crear instancias de Ruedas
        Rueda rueda1 = new Rueda("Todo terreno");
        Rueda rueda2 = new Rueda("Deportiva");
        Rueda rueda3 = new Rueda("Nieve");
        Rueda rueda4 = new Rueda("Ciudad");

        // Crear instancia de Carro con las ruedas
        Carro carro = new Carro("Toyota", Arrays.asList(rueda1, rueda2, rueda3, rueda4));

        // Mostrar detalles del carro y sus ruedas
        carro.mostrarDetalles();

    }
    
}
