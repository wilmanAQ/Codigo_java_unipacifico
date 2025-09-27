
package algotallerarray;

import java.util.Scanner;
public class AlgoTallerArray {

   //Ejercicio # 1 Array
    public static void main(String[] args) {
       double[] notas = new double[4];
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Ingrese 4 notas:");
        for (int i = 0; i < 4; i++) {
            System.out.print("Nota " + (i + 1) + ": ");
            notas[i] = scanner.nextDouble();
        }

        double suma = 0;
        for (double nota : notas) {
            suma += nota;
        }
        double promedio = suma / notas.length;

        System.out.printf("El promedio de las notas es: %.2f\n", promedio);
    
    /*
        // Ejercicio # 2
        double[] numeros = new double[5];
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Ingrese 5 números:");
        for (int i = 0; i < 5; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = scanner.nextDouble();
        }

        double producto = 1;
        for (double numero : numeros) {
            producto *= numero;
        }

        System.out.printf("El producto de los números es: %.2f\n", producto);
        
        
     */
    
    
    
    }
    
}
