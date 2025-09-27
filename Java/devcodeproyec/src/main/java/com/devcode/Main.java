package com.devcode;

public class Main {
    public static void main(String[] args) {
        
        
        Motor motorV8 = new Motor("V8", 450);
        Carro carro = new Carro("Mustang", "Vermelho", 2021, motorV8);
        carro.acelerar();
    }
}