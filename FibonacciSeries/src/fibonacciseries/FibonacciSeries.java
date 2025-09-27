
package fibonacciseries;
import java.util.Scanner;
public class FibonacciSeries {
    public static void main(String[] args) {
        // TODO code application logic here
            Scanner scanner = new Scanner(System.in);
        
        System.out.print("Introduce cuántos números de la serie Fibonacci deseas: ");
        int n = scanner.nextInt(); // PARA CAPTURAR LO QUE EL USUARIO DIGITE POR EL TECLADO
        
        int a = 0, b = 1, siguiente;
        System.out.println("Serie de Fibonacci hasta " + n + " números:");
        
        for (int i = 1; i <= n; i++) {
            System.out.print(a + " ");
            siguiente = a + b;
            a = b;
            b = siguiente;
        }
        
        scanner.close();
    }
    
}
