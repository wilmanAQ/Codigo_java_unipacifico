
package algoarraynumerospares;

import java.util.Scanner;
public class AlgoArrayNumerosPares {

    
    public static void main(String[] args) {
        
        // Crear un array de 6 posiciones
        int[] numeros = new int[6];
        Scanner scanner = new Scanner(System.in);
        
        // Pedir al usuario que ingrese los 6 números
        System.out.println("Ingresa 6 números:");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt(); // Capturar el número por teclado
        }
        
        // Mostrar los números pares
        System.out.println("Números pares:");
        for (int numero : numeros) {
            if (numero % 2 == 0) {  // Verificar si el número es par
                System.out.println(numero);
            }
        }
        
    }
    
}
