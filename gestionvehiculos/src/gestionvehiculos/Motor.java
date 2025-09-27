/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestionvehiculos;

/**
 *
 * @author Wilmar
 */
public class Motor {
    // Atributos privados para encapsulamiento
    private String tipo;
    private int potencia; // en caballos de fuerza (HP)

    // Constructor
    public Motor(String tipo, int potencia) {
        this.tipo = tipo;
        this.potencia = potencia;
    }

    // Métodos Getter y Setter
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    // Método para mostrar información del motor
    public void mostrarInfo() {
        System.out.println("Tipo de Motor: " + tipo + ", Potencia: " + potencia + " HP");
    }
    
}
