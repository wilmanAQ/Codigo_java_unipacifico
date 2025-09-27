
package sumaresta;
import java.util.Scanner;
public class SumaResta {

    
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in); // Crear objeto Scanner para leer datos
        
        System.out.print("Introduce el primer número: ");
        int numero1 = teclado.nextInt(); // Leer primer número
        
        System.out.print("Introduce el segundo número: ");
        int numero2 = teclado.nextInt(); // Leer segundo número
        
        // Operaciones
        int suma = numero1 + numero2;
        int resta = numero1 - numero2;
        
        // Mostrar resultados
        System.out.println("La suma de " + numero1 + " y " + numero2 + " es: " + suma);
        System.out.println("La resta de " + numero1 + " y " + numero2 + " es: " + resta);
        
        teclado.close(); // Cerrar el Scanner
    }
    
}
