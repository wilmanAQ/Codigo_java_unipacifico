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
public class Vehiculo {
    
    // Atributos privados para encapsulamiento
    private String marca;
    private String modelo;
    private Motor motor; // Composición: Vehiculo tiene un Motor

    // Constructor
    public Vehiculo(String marca, String modelo, Motor motor) {
        this.marca = marca;
        this.modelo = modelo;
        this.motor = motor;
    }

    // Métodos Getter y Setter
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    // Método para mostrar información del vehículo
    public void mostrarInfo() {
        System.out.println("Marca: " + marca + ", Modelo: " + modelo);
        motor.mostrarInfo();
    }
    
}
