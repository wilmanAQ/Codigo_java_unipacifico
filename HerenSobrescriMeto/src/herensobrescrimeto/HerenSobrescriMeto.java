
package herensobrescrimeto;

public class HerenSobrescriMeto {

    
    public static void main(String[] args) {
        // Instanciando la clase Gerente
        Gerente gerente = new Gerente();
        // Llamando al método sobrescrito
        gerente.trabajar();  // El gerente está gestionando

        // También puedes llamar al método de la superclase si cambias la instancia
        Empleado empleado = new Empleado();
        empleado.trabajar();  // El empleado está trabajando
    }
    
}
