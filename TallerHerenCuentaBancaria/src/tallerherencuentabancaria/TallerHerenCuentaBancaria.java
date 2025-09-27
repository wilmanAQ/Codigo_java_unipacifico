
package tallerherencuentabancaria;


public class TallerHerenCuentaBancaria {

    
    public static void main(String[] args) {
        CuentaAhorros cuenta = new CuentaAhorros();
        cuenta.depositar(1000);
        cuenta.retirar(200);
        cuenta.mostrarSaldo();
        cuenta.calcularInteres(5); // Calcular interés del 5%
    }
    
}
