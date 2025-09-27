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
public class Recarga extends Operacion {
    
    public Recarga(double monto) {
        super(monto);
    }

    @Override
    public void ejecutar(CuentaNequi cuenta) {
        cuenta.aumentarSaldo(monto);
        cuenta.getUsuario().notificar("Recarga exitosa de $" + monto);
        
    }
    
    
}
