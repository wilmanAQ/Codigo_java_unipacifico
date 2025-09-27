package com.devcode;

public class Carro {
    private String modelo;
    private String color;
    private int ano;
    private Motor motor;

    public Carro(String modelo, String color, int ano, Motor motor) {
        this.modelo = modelo;
        this.color = color;
        this.ano = ano;
        this.motor = motor;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setCor(String color) {
        this.color = color;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public Motor getMotor() {
        return motor;
    }
    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    public void acelerar() {
        System.out.println("O carro " + modelo + " está acelerando com motor " + motor.getTipo() + " de " + motor.getPotencia() + " cavalos.");
    }

}
