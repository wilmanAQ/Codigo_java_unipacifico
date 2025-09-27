
package algovectoroperacionesvector;

import java.util.Scanner;
import java.util.Vector;

public class AlgoVectorOperacionesVector {

    
    public static void main(String[] args) {
       // Crear un vector para almacenar 5 números
        Vector<Double> numeros = new Vector<>(5);
        Scanner scanner = new Scanner(System.in);
        
        // Solicitar al usuario que ingrese 5 números
        System.out.println("Ingrese 5 números:");
        for (int i = 0; i < 5; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros.add(scanner.nextDouble()); // Capturar el número
        }
        
        // Inicializar variables para las operaciones
        double suma = 0;
        double resta = numeros.get(0); // Iniciar con el primer número para la resta
        double multiplicacion = 1; // Iniciar con 1 para la multiplicación
        double division = numeros.get(0); // Iniciar con el primer número para la división

        // Realizar operaciones
        for (int i = 0; i < numeros.size(); i++) {
            suma += numeros.get(i); // Sumar los números
            multiplicacion *= numeros.get(i); // Multiplicar los números
            if (i > 0) { // Evitar restar el primer número a sí mismo
                resta -= numeros.get(i); // Restar los números
                division /= numeros.get(i); // Dividir los números
            }
        }

        // Mostrar resultados
        System.out.printf("Suma: %.2f\n", suma);
        System.out.printf("Resta: %.2f\n", resta);
        System.out.printf("Multiplicación: %.2f\n", multiplicacion);
        System.out.printf("División: %.2f\n", division);
    }
    
}
