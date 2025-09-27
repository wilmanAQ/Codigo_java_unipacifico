
package algotallervector;

import java.util.Scanner;
import java.util.Vector;

public class AlgoTallerVector {

    // Ejercicio # 4
    public static void main(String[] args) {
        Vector<Integer> numeros = new Vector<>(6);
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Ingrese 6 números:");
        for (int i = 0; i < 6; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros.add(scanner.nextInt());
        }

        System.out.println("Números pares ingresados:");
        for (int numero : numeros) {
            if (numero % 2 == 0) {
                System.out.println(numero);
            }
        }
        
    /*
        // Ejercicio # 3
       Vector<Double> numeros = new Vector<>(5);
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Ingrese 5 números:");
        for (int i = 0; i < 5; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros.add(scanner.nextDouble());
        }
        
        double suma = 0;
        for (double numero : numeros) {
            suma += numero;
        }

        System.out.printf("La suma de los números es: %.2f\n", suma); 
        
    */
    
    
    
    
    
    }
    
}
