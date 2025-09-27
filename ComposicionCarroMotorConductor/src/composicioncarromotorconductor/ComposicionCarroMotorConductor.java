
package composicioncarromotorconductor;

/*

En la composición, los objetos que forman parte de otro no
pueden existir independientemente. 
Si el objeto contenedor se destruye, sus componentes 
también se destruyen.

En este caso, en lugar de que Motor y Conductor sean creados 
fuera y pasados como parámetros al Carro, 
el Carro los creará dentro de sí mismo. 
Si el Carro deja de existir, 
el Motor y el Conductor también lo harán.



Diferencias clave con Agregación:

Composición: Carro crea sus propios objetos Motor y Conductor dentro de sí mismo, y no los recibe como parámetros externos.
Si el Carro se destruye, el Motor y el Conductor también dejan de existir.
No es posible reutilizar Motor o Conductor en otro Carro, ya que no existen por sí solos.


*/

public class ComposicionCarroMotorConductor {

    
    public static void main(String[] args) {
        
        // Se crea un Carro, que a su vez crea su Motor y su Conductor (Composición)
        Carro miCarro = new Carro("Toyota", "V6", "Juan Pérez");

        miCarro.encenderCarro();
        miCarro.conducirCarro();

        // Cuando miCarro desaparece, Motor y Conductor también desaparecen
        
        
    }
    
}
