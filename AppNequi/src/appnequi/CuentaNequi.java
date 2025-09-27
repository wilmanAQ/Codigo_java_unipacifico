/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appnequi;

import java.util.List;
import java.util.ArrayList;

public class CuentaNequi {
    
    private Usuario usuario;// Agregación
    private double saldo;
    private TarjetaVirtual tarjeta;
    private List<Operacion> historial;

    public CuentaNequi(Usuario usuario) {
        this.usuario = usuario;
        this.saldo = 0.0;
        this.tarjeta = new TarjetaVirtual("1234-5678-9012", "999"); // Composición
        this.historial = new ArrayList<>(); // Composición
    }

    public void ejecutarOperacion(Operacion op) {
        op.ejecutar(this);
        historial.add(op);
    }

    public void mostrarSaldo() {
        System.out.printf("💰 Saldo actual: $%.2f%n", saldo);
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public double getSaldo() {
        return saldo;
    }

    public void aumentarSaldo(double valor) {
        saldo += valor;
    }

    public void disminuirSaldo(double valor) {
        saldo -= valor;
    }

    public TarjetaVirtual getTarjeta() {
        return tarjeta;
    }
    
}
