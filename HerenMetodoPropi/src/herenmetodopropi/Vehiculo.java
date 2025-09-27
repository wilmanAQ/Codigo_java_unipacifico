
package herenmetodopropi;

public class Vehiculo {
    public String nombre;
    
    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    
    void conducir() {
        System.out.println("Conduciendo vehículo");
    }
    void frenar(){
        System.out.println("Frenando el vehiculo");
    
    }
    
    public void mostrarInfo(){
        System.out.println("Este es el grupo IS01D4");
    
    }
}
