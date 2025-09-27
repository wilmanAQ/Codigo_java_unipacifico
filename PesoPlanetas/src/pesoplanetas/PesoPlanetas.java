
package pesoplanetas;

import java.util.Scanner;
public class PesoPlanetas {

    public static void main(String[] args) {
      
        Scanner teclado = new Scanner(System.in); // Crear objeto Scanner para leer datos
        
        System.out.print("Introduce tu peso en la Tierra (kg): ");
        double pesoTierra = teclado.nextDouble(); // Leer peso en la Tierra
        
        // Calcular el peso en diferentes planetas
        double pesoLuna = pesoTierra * 0.165; // La gravedad en la Luna es el 16.5% de la Tierra
        double pesoMarte = pesoTierra * 0.38; // La gravedad en Marte es el 38% de la Tierra
        double pesoJupiter = pesoTierra * 2.34; // La gravedad en Júpiter es 2.34 veces la de la Tierra
        
        // Mostrar los resultados
        System.out.println("Tu peso en la Luna sería: " + pesoLuna + " kg");
        System.out.println("Tu peso en Marte sería: " + pesoMarte + " kg");
        System.out.println("Tu peso en Júpiter sería: " + pesoJupiter + " kg");
        
        teclado.close(); // Cerrar el Scanner
    }
    
}
