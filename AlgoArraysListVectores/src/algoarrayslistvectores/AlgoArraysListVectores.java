
package algoarrayslistvectores;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/*
 Explicación Paso a Paso
Ingresar los primeros 10 números: Se piden y se almacenan en el ArrayList.
Calcular el promedio: Llama al método calcularPromedio para obtener el promedio de los primeros 10 números.
Agregar más números: Permite agregar números adicionales si el usuario responde que sí.
Eliminar un número: Pide un número a eliminar, intenta eliminarlo del ArrayList, y notifica si el número no se encuentra.
Ordenar los números: Ordena los números en orden ascendente.
Tamaño y mostrar contenido: Muestra el tamaño y el contenido actual del ArrayList.
 */

/*
Qué es una colección en Java?
Una colección es un objeto que agrupa múltiples elementos en una sola estructura, similar a una lista, conjunto o mapa. 
Las colecciones están diseñadas para manejar datos de manera eficiente y suelen usarse para almacenar y organizar grandes cantidades de elementos.
Java proporciona el framework de colecciones (Java Collections Framework), que incluye interfaces y 
clases para manejar estos grupos de elementos. Algunas clases comunes de colecciones en Java son ArrayList, LinkedList, HashSet, HashMap, entre otras.


*/

/*
    ¿Por qué usamos ArrayList en este ejemplo?
ArrayList es una clase de colección que pertenece al paquete java.util y que implementa la interfaz List. 
Un ArrayList es útil cuando necesitas almacenar una lista de elementos y:

Agregar elementos dinámicamente: Puedes agregar o eliminar elementos sin necesidad de definir un tamaño fijo, a diferencia de un arreglo (array) tradicional.
Modificar fácilmente: Puedes añadir, eliminar, ordenar, y acceder a elementos específicos.
Manejo de tamaño automático: Cuando el ArrayList alcanza su capacidad máxima, 
se redimensiona automáticamente para permitir el almacenamiento de más elementos.


*/

/*
    Ventajas de usar ArrayList en este programa
Almacenamiento dinámico: En nuestro ejercicio, primero ingresamos 10 números y luego agregamos más números opcionalmente. 
Con un ArrayList, no necesitamos definir un tamaño fijo desde el principio, y podemos añadir elementos según sea necesario.

Métodos útiles: ArrayList proporciona métodos predefinidos que simplifican muchas tareas comunes:

add(elemento): Añade un elemento al final de la lista.
remove(elemento): Elimina un elemento específico (por valor o posición).
sort(): Ordena los elementos en orden ascendente (usando Collections.sort()).
size(): Devuelve el tamaño actual de la lista, útil para ver cuántos elementos hay en la colección en cualquier momento.
Manipulación más sencilla: Las colecciones en Java están diseñadas para ser fáciles de manipular y recorrer.
En nuestro programa, podemos fácilmente imprimir y ordenar los números, 
obtener el tamaño actual del ArrayList o realizar cálculos como el promedio sin preocuparnos por gestionar la memoria de manera manual, como sucedería con un arreglo.


*/

public class AlgoArraysListVectores {

    // TRABAJADO CON VECTORES (Arryslist)
    public static void main(String[] args) {
        
        ArrayList<Integer> numeros = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        // Ingresar los primeros 10 números
        System.out.println("Ingresa 10 números enteros:");
        for (int i = 0; i < 3; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            int numero = scanner.nextInt();
            numeros.add(numero);
        }

        // Calcular el promedio de los 10 números iniciales
        double promedio = calcularPromedio(numeros);
        System.out.println("Promedio de los primeros 10 números: " + promedio);

        // Agregar más números
        System.out.print("\n¿Quieres agregar otro número? (sí=1 / no=0): ");
        int agregar = scanner.nextInt();
        while (agregar == 1) {
            System.out.print("Ingresa un número para agregar: ");
            int numAgregar = scanner.nextInt();
            numeros.add(numAgregar);
            System.out.print("¿Quieres agregar otro número? (sí=1 / no=0): ");
            agregar = scanner.nextInt();
        }

        // Eliminar un número por valor
        System.out.print("\nIngresa el número que quieres eliminar: ");
        int numEliminar = scanner.nextInt();
        if (numeros.remove((Integer) numEliminar)) {
            System.out.println("Número " + numEliminar + " eliminado.");
        } else {
            System.out.println("Número no encontrado.");
        }

        // Ordenar los números en orden ascendente
        Collections.sort(numeros);
        System.out.println("\nNúmeros ordenados: " + numeros);

        // Mostrar el tamaño actual del ArrayList
        System.out.println("Tamaño actual del ArrayList: " + numeros.size());

        // Mostrar todos los números
        System.out.println("Números en el ArrayList: " + numeros);

        scanner.close();
    }

    // Método para calcular el promedio
    public static double calcularPromedio(ArrayList<Integer> numeros) {
        double suma = 0;
        for (int numero : numeros) {
            suma += numero;
        }
        return suma / numeros.size();
    }
        
    }
    

