/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller1algoritmia;

import java.util.Scanner;

public class PromedioNotas {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        // Pedir las tres notas
        System.out.print("Introduce la primera nota: ");
        double nota1 = teclado.nextDouble();
        
        System.out.print("Introduce la segunda nota: ");
        double nota2 = teclado.nextDouble();
        
        System.out.print("Introduce la tercera nota: ");
        double nota3 = teclado.nextDouble();
        
        // Calcular el promedio
        double promedio = (nota1 + nota2 + nota3) / 3;
        
        // Mostrar el promedio
        System.out.println("El promedio es: " + promedio);
        
        // Determinar si aprobó o no
        if (promedio >= 60) {
            System.out.println("El estudiante ha aprobado.");
        } else {
            System.out.println("El estudiante ha reprobado.");
        }
        
        teclado.close(); // Cerrar el scanner
    }
}

