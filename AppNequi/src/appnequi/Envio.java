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
public class Envio extends Operacion {
    
    private Usuario destinatario;

    public Envio(double monto, Usuario destinatario) {
        super(monto);
        this.destinatario = destinatario;
    }

    @Override
    public void ejecutar(CuentaNequi cuenta) {
        if (cuenta.getSaldo() >= monto) {
            cuenta.disminuirSaldo(monto);
            cuenta.getUsuario().notificar("Enviados $" + monto + " a " + destinatario.getNombre());
            destinatario.notificar("Recibiste $" + monto + " de " + cuenta.getUsuario().getNombre());
        } else {
            cuenta.getUsuario().notificar("Fondos insuficientes para envío.");
        }
    }
    
    
    
}
