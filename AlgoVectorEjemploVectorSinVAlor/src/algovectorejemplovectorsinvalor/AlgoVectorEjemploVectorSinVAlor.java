
package algovectorejemplovectorsinvalor;
import java.util.Scanner;
import java.util.Vector;

public class AlgoVectorEjemploVectorSinVAlor {

    
    public static void main(String[] args) {
        // Crear un vector sin un tamaño específico
        Vector<Double> parqueo = new Vector<>();
        Scanner scanner = new Scanner(System.in);
        
        // Solicitar el valor del parqueo hasta que el usuario decida parar
        while (true) {
            System.out.print("Ingrese el valor del parqueo, (-1 para terminar),(0- para Volver el mensaje) : ");
            double valor = scanner.nextDouble();
            if (valor == -1) {
                break; // Salir del bucle si se ingresa -1
            }
            parqueo.add(valor); // Agregar valor al vector
        }
        
        // Mostrar todos los valores ingresados
        System.out.println("Valores ingresados:");
        for (Double valor : parqueo) {
            System.out.println(valor);
        }
        
        // Calcular y mostrar el total de ventas
        double totalVentas = 0;
        for (Double valor : parqueo) {
            totalVentas += valor;
        }
        System.out.printf("El total de las ventas es: %.2f\n", totalVentas);
        
    }
    
}
