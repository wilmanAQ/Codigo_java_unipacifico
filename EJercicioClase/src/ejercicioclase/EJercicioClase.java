
package ejercicioclase;

import java.util.Scanner;
public class EJercicioClase {


    public static void main(String[] args) {
                // TODO code application logic here
            Scanner teclado = new Scanner(System.in);
        // Muestra mensaje en la pantalla
        System.out.print("Introduce cuántos números de la serie Fibonacci deseas: ");
        int n = teclado.nextInt();
        // Inicializamos variables 
        int a = 0, b = 1, siguiente;
        System.out.println("Serie de Fibonacci hasta " + n + " números:");
        
        for (int i = 1; i <= n; i++) {
            System.out.print(a + " ");
            siguiente = a + b;
            a = b;
            b = siguiente;
        }

    }
    
}
