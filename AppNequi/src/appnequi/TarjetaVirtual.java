/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appnequi;

/**
 *
 * @author Wilmar
 */
public class TarjetaVirtual {
    private String numero;
    private String cvv;

    public TarjetaVirtual(String numero, String cvv) {
        this.numero = numero;
        this.cvv = cvv;
    }

    public String mostrarInfo() {
        return "Tarjeta virtual - Número: " + numero + ", CVV: " + cvv;
    }
    
}
