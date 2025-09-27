
package gestionlibros;

public class Libro {
    // Atributos privados para encapsulamiento
    private String titulo;
    private String genero;
    private Autor autor; // Aso: Libro tiene un Autor

    // Constructor
    public Libro(String titulo, String genero, Autor autor) {
        this.titulo = titulo;
        this.genero = genero;
        this.autor = autor;
    }

    // Métodos Getter y Setter
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    // Método para mostrar información del libro
    public void mostrarInfo() {
        System.out.println("Título: " + titulo + ", Género: " + genero);
        autor.mostrarInfo();
        
    }
}