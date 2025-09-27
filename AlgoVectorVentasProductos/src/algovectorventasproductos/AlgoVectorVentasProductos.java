
package algovectorventasproductos;

import java.util.Scanner;
import java.util.Vector;
public class AlgoVectorVentasProductos {

    
    public static void main(String[] args) {
        // Crear un vector para almacenar los precios de los productos
        Vector<Double> precios = new Vector<>();
        Scanner scanner = new Scanner(System.in);
        
        // Solicitar el precio de los productos hasta que el usuario decida parar
        System.out.println("Ingrese los precios de los productos (ingrese -1 para terminar):");
        while (true) {
            System.out.print("Precio del producto: ");
            double precio = scanner.nextDouble();
            if (precio == -1) {
                break; // Salir del bucle si se ingresa -1
            }
            precios.add(precio); // Agregar el precio al vector
        }
        
        // Mostrar todos los precios ingresados
        System.out.println("\nPrecios de los productos ingresados:");
        for (Double precio : precios) {
            System.out.println(precio);
        }
        
        // Calcular y mostrar el total de ventas
        double totalVentas = 0;
        for (Double precio : precios) {
            totalVentas += precio; // Sumar los precios para el total
        }
        System.out.printf("El total de las ventas es: %.2f\n", totalVentas);
        
        // Mostrar el número de productos ingresados
        System.out.println("Número total de productos ingresados: " + precios.size());
        
    }
    
}
