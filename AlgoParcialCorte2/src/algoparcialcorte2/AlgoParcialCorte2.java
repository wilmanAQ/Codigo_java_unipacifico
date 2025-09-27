
package algoparcialcorte2;

import java.util.Scanner;

public class AlgoParcialCorte2 {

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Solicitar dos números al usuario
        System.out.print("Ingrese el primer número: ");
        int numero1 = sc.nextInt();
        
        System.out.print("Ingrese el segundo número: ");
        int numero2 = sc.nextInt();
        
        // Realizar la división y manejar división por cero
        if (numero2 != 0) {
            double resultadoDivision = (double) numero1 / numero2;
            System.out.println("Resultado de la división: " + resultadoDivision);
        } else {
            System.out.println("Error: No se puede dividir por cero.");
        }
        
        // Cerrar el scanner
        sc.close();
    }
    
}
