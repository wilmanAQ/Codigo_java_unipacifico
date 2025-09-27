
package composicioncarromotorconductor;


public class Motor {
    private String tipo;

    public Motor(String tipo) {
        this.tipo = tipo;
    }

    public void encender() {
        System.out.println("El motor de tipo " + tipo + " está encendido.");
    }
    
    public void apagar() {
        System.out.println("El motor de tipo " + tipo + " está apagado.");
    }
    
}
