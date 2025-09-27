/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller1algoritmia;

import java.util.Scanner;

public class EdadFutura {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        // Pedir el año de nacimiento
        System.out.print("Introduce tu año de nacimiento: ");
        int anioNacimiento = teclado.nextInt();
        
        // Calcular la edad en años futuros
        int edad2030 = 2030 - anioNacimiento;
        int edad2040 = 2040 - anioNacimiento;
        int edad2050 = 2050 - anioNacimiento;
        
        // Mostrar los resultados
        System.out.println("Tu edad en el año 2030 será: " + edad2030);
        System.out.println("Tu edad en el año 2040 será: " + edad2040);
        System.out.println("Tu edad en el año 2050 será: " + edad2050);
        
        teclado.close(); // Cerrar el scanner
    }
}

