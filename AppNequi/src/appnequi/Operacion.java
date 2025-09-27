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
abstract  class Operacion {
    
    protected double monto;

    public Operacion(double monto) {
        this.monto = monto;
    }

    public abstract void ejecutar(CuentaNequi cuenta);
    
}
