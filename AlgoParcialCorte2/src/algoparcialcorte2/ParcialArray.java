
package algoparcialcorte2;

import java.util.Scanner;
public class ParcialArray {

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Crear un arreglo y solicitar los 10 números
        int[] numeros = new int[10];
        System.out.println("Ingrese 10 números enteros:");
        for (int i = 0; i < 10; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = sc.nextInt();
        }
        
        // Sumar los números pares del arreglo
        int sumaPares = 0;
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] % 2 == 0) {
                sumaPares += numeros[i];
            }
        }
        
        // Imprimir el resultado de la suma de los números pares
        System.out.println("La suma de los números pares es: " + sumaPares);
        
        // Cerrar el scanner
        sc.close();
    }
    
}
