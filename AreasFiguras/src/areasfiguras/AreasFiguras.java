
package areasfiguras;
import java.util.Scanner;
public class AreasFiguras {

   
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        // Área del cuadrado
        System.out.print("Introduce el lado del cuadrado: ");
        double ladoCuadrado = scanner.nextDouble();
        double areaCuadrado = ladoCuadrado * ladoCuadrado;
        System.out.println("El área del cuadrado es: " + areaCuadrado);

        // Área del círculo
        System.out.print("Introduce el radio del círculo: ");
        double radioCirculo = scanner.nextDouble();
        double areaCirculo = Math.PI * Math.pow(radioCirculo, 2);
        System.out.println("El área del círculo es: " + areaCirculo);

        // Área del triángulo
        System.out.print("Introduce la base del triángulo: ");
        double baseTriangulo = scanner.nextDouble();
        System.out.print("Introduce la altura del triángulo: ");
        double alturaTriangulo = scanner.nextDouble();
        double areaTriangulo = (baseTriangulo * alturaTriangulo) / 2;
        System.out.println("El área del triángulo es: " + areaTriangulo);

        scanner.close();
       
    }
    
}
