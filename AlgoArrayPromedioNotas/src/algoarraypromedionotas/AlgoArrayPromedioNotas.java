
package algoarraypromedionotas;

import java.util.Scanner;
public class AlgoArrayPromedioNotas {

    
    public static void main(String[] args) {
        // Crear un array de 4 posiciones para almacenar las notas
        double[] notas = new double[4];
        Scanner scanner = new Scanner(System.in);
        
        // Pedir al usuario que ingrese las 4 notas
        System.out.println("Ingresa 4 notas:");
        for (int i = 0; i < notas.length; i++) {
            System.out.print("Nota " + (i + 1) + ": ");
            notas[i] = scanner.nextDouble();  // Capturar la nota por teclado
        }
        
        // Calcular el promedio ponderado
        double promedio = (notas[0] * 0.30) + (notas[1] * 0.20) + (notas[2] * 0.10)+(notas[3] * 0.40);
        
        // Mostrar las notas ingresadas
        System.out.println("Notas ingresadas:");
        for (double nota : notas) {
            System.out.println(nota);  // Imprimir cada nota ingresada
        }
        
        // Mostrar el promedio
        System.out.printf("El promedio ponderado de las notas es: %.2f\n", promedio);
        
        // Determinar la nota final
        if (promedio >= 60) {
            System.out.println("La nota final es: Aprobado");
        } else {
            System.out.println("La nota final es: Reprobado");
        }
        
    }
    
}
