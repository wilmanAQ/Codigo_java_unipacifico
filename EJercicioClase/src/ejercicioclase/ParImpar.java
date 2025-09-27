
package ejercicioclase;
import java.util.Scanner;
public class ParImpar {

    
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in); //INSTANCIO UN OBJETO DE teclado de tipo scanner
        System.out.print("Introduce un número: ");

        int numero = teclado.nextInt(); // ASIGNO EL VALOR DIGITADO POR TECLADO
        
        if (numero % 2 == 0) {
            System.out.println("El número " + numero + " es par.");
        } else {
            System.out.println("El número " + numero + " es impar.");
        }
        
        teclado.close(); // CIERRO EL OBJETO TECLADO

    }
    
}
