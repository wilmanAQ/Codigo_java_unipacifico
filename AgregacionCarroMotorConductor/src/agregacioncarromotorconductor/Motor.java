
package agregacioncarromotorconductor;


public class Motor {
     private String tipo;

    public Motor(String tipo) {
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void encender() {
        System.out.println("El motor de tipo " + tipo + " está encendido.");
    }
    
}
