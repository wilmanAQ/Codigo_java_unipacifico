
package algosumaelementosarray;
import java.util.Scanner;

public class AlgoSumaElementosArray {

    public static void main(String[] args) {
        
        // Crear un array de 5 posiciones
        int[] numeros = new int[5];
        Scanner scanner = new Scanner(System.in);
        int suma = 0; // Variable para almacenar la suma
        
        // Pedir al usuario que ingrese los 5 números
        System.out.println("Ingresa 5 números:");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();  // Capturar el número por teclado
            suma += numeros[i];  // Sumar el número al total
        }
        
        // Mostrar la suma total
        System.out.println("La suma de los elementos del array es: " + suma);
        
        
    }
    
}
