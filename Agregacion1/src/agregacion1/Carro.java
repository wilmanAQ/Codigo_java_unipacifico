
package agregacion1;

import java.util.List;

public class Carro {
    
    private String modelo;
    private List<Rueda> ruedas;

    public Carro(String modelo, List<Rueda> ruedas) {
        this.modelo = modelo;
        this.ruedas = ruedas;
    }

    public void mostrarDetalles() {
        System.out.println("Modelo de carro: " + modelo);
        for (Rueda rueda : ruedas) {
            System.out.println(rueda.toString());
        }
    }

    
}
