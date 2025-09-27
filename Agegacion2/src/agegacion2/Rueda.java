
package agegacion2;


public class Rueda {
    
    private String marca;   // Marca de la rueda
    private int tamano;    // Tamaño de la rueda

    // Constructor para inicializar los atributos de la rueda
    public Rueda(String marca, int tamanio) {
        this.marca = marca;
        this.tamano = tamano;
    }

    // Método toString para representar la rueda como una cadena de texto
    @Override
    public String toString() {
        return "Rueda [Marca=" + marca + ", Tamaño=" + tamano + "]";
    }
    
}
