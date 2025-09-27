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
public class Retiro extends Operacion{
    
    public Retiro(double monto) {
        super(monto);
    }

    @Override
    public void ejecutar(CuentaNequi cuenta) {
      
        if (cuenta.getSaldo() >= monto) {
            cuenta.disminuirSaldo(monto);
            cuenta.getUsuario().notificar(" ESTAMOS CLARO");
            cuenta.getUsuario().notificar("Retiro exitoso de $" + monto);
        } else {
            cuenta.getUsuario().notificar("Fondos insuficientes para retiro.");
            
        }
    }
    
}
