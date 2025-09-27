
package algovectoreparqueocarros;
import java.util.Scanner;
import java.util.Vector;

public class AlgoVectoreParqueoCarros {

    
    public static void main(String[] args) {
        // Crear // Crear un vector para almacenar el valor del parqueo de 5 carros
        Vector<Double> parqueo = new Vector<>(5);
        Scanner scanner = new Scanner(System.in);
        double totalVentas = 0; // Variable para almacenar el total de ventas
        
        // Solicitar el valor del parqueo para 5 carros
        System.out.println("Ingrese el valor del parqueo de 5 carros:");
        for (int i = 0; i < 5; i++) {
            System.out.print("Valor del parqueo del carro " + (i + 1) + ": ");
            double valor = scanner.nextDouble();  // Capturar el valor del parqueo
            parqueo.add(valor);  // Agregar el valor al vector
            totalVentas += valor;  // Sumar al total de ventas
        }
        
        // Mostrar el total de las ventas
        System.out.printf("\nEl total de las ventas es: %.2f\n", totalVentas);
    
    }
    
}
