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
public class AppNequi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        Usuario juan = new Usuario("Juan Manuel", "112233", "3150000000");
        Usuario maria = new Usuario("María López", "445566", "3160000000");

        CuentaNequi cuentaJuan = new CuentaNequi(juan);

        cuentaJuan.ejecutarOperacion(new Recarga(100000));
        cuentaJuan.mostrarSaldo();

        cuentaJuan.ejecutarOperacion(new Retiro(20000));
        cuentaJuan.mostrarSaldo();

        cuentaJuan.ejecutarOperacion(new Envio(50000, maria));
        cuentaJuan.mostrarSaldo();

        System.out.println(cuentaJuan.getTarjeta().mostrarInfo());
    
    }
    
}
