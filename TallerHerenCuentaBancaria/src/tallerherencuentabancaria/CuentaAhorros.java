/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tallerherencuentabancaria;

/**
 *
 * @author Wilmar
 */
public class CuentaAhorros extends CuentaBancaria {
    
    void calcularInteres(double porcentaje) {
        double interes = saldo * (porcentaje / 100);
        System.out.println("Interés ganado: " + interes);
    }
    
}
