
package algovectoresnominatrabajadores;
import java.util.Scanner;
import java.util.Vector;

public class AlgoVectoresNominaTrabajadores {

    
    public static void main(String[] args) {
        // Crear un vector para almacenar la información de los trabajadores
        Vector<Double> salarios = new Vector<>();
        Vector<Integer> vacaciones = new Vector<>();
        Vector<Double> bonificaciones = new Vector<>();
        Scanner scanner = new Scanner(System.in);
        
        // Solicitar datos de 5 trabajadores
        System.out.println("Ingrese la información de 5 trabajadores:");
        for (int i = 0; i < 5; i++) {
            System.out.println("\nTrabajador " + (i + 1) + ":");
            
            System.out.print("Salario: ");
            salarios.add(scanner.nextDouble());  // Capturar el salario
            
            System.out.print("Días de vacaciones: ");
            vacaciones.add(scanner.nextInt());  // Capturar los días de vacaciones
            
            System.out.print("Bonificación: ");
            bonificaciones.add(scanner.nextDouble());  // Capturar la bonificación
        }
        
        // Mostrar la nómina
        System.out.println("\nNómina de Trabajadores:");
        System.out.println("Trabajador\tSalario\tVacaciones\tBonificación");
        for (int i = 0; i < 5; i++) {
            System.out.printf("%d\t\t%.2f\t%d\t\t%.2f\n", (i + 1), salarios.get(i), vacaciones.get(i), bonificaciones.get(i));
        }
        
    }
    
}
