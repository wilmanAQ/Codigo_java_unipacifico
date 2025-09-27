
package agregacioncarromotorconductor;

public class Conductor {
    private String nombre;

    public Conductor(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void conducir() {
        System.out.println(nombre + " está conduciendo.");
    }
    
}
