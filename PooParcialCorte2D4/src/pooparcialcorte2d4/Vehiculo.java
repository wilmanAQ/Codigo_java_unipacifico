
package pooparcialcorte2d4;


public class Vehiculo {
    
    private String marca;
    private String modelo;
    private Propietario propietario;  // Asociación
    
    public Vehiculo(String marca, String modelo, Propietario propietario) {
        this.marca = marca;
        this.modelo = modelo;
        this.propietario = propietario;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public Propietario getPropietario() {
        return propietario;
    }

    public void mostrarInfoVehiculo() {
        System.out.println("Marca: " + marca + ", Modelo: " + modelo);
    }
    
}
