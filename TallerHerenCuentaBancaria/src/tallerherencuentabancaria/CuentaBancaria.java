
package tallerherencuentabancaria;


public class CuentaBancaria {
    
    double saldo;

    void depositar(double cantidad) {
        saldo += cantidad;
        System.out.println("Se ha depositado: " + cantidad);
    }

    void retirar(double cantidad) {
        if (cantidad <= saldo) {
            saldo -= cantidad;
            System.out.println("Se ha retirado: " + cantidad);
        } else {
            System.out.println("Fondos insuficientes");
        }
    }

    void mostrarSaldo() {
        System.out.println("Saldo actual: " + saldo);
    }
    
    
}
