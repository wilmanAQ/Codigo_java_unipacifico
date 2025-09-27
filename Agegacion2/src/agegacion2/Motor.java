
package agegacion2;


public class Motor {
    
    private int potencia;  // Potencia del motor en caballos de fuerza
    private String tipo;   // Tipo de motor (gasolina, diésel, eléctrico)

    // Constructor para inicializar los atributos del motor
    public Motor(int potencia, String tipo) {
        this.potencia = potencia;
        this.tipo = tipo;
    }

    // Método que simula el encendido del motor
    public void encender() {
        System.out.println("El motor de tipo " + tipo + " con potencia de " + potencia + " caballos ha sido encendido.");
    }

    // Método toString para representar el motor como una cadena de texto
    @Override
    public String toString() {
        return "Motor [Tipo=" + tipo + ", Potencia=" + potencia + " caballos]";
    }
    
    
    
}
