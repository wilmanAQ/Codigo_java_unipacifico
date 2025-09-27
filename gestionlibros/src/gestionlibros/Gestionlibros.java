
package gestionlibros;

public class Gestionlibros {

    public static void main(String[] args) {
        
        // Creación de instancias de Autor
        Autor autor1 = new Autor("Gabriel García Márquez", "Colombiana");
        Autor autor2 = new Autor("Isabel Allende", "Chilena");

        // Creación de instancias de Libro
        Libro libro1 = new Libro("Cien Años de Soledad", "Realismo Mágico", autor1);
        Libro libro2 = new Libro("La Casa de los Espíritus", "Realismo Mágico", autor2);

        // Mostrar información de los libros
        libro1.mostrarInfo();
        System.out.println("-------------------------");
        libro2.mostrarInfo();
        
  
    }
    
}
