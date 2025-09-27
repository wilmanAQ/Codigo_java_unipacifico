/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller1algoritmia;

import java.util.Scanner;

public class AreaRectangulo {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        // Pedir los datos
        System.out.print("Introduce la base del rectángulo: ");
        double base = teclado.nextDouble();
        
        System.out.print("Introduce la altura del rectángulo: ");
        double altura = teclado.nextDouble();
        
        // Calcular el área
        double area = base * altura;
        
        // Mostrar el resultado
        System.out.println("El área del rectángulo es: " + area);
        
        teclado.close(); // Cerrar el scanner
    }
}
