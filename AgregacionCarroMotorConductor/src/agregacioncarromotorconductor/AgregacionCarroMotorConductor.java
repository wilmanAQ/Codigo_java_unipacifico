
package agregacioncarromotorconductor;


/*
    Explicación:
Agregación implica una relación "tiene un" (has-a), 
donde un objeto puede existir independientemente de otro.
En este caso:
Un Carro tiene un Motor y un Conductor.
El Motor y el Conductor pueden existir sin necesidad 
de estar dentro del Carro.
*/


public class AgregacionCarroMotorConductor {

    
    public static void main(String[] args) {
        Motor motorToyota = new Motor("V6");
        Conductor conductorJuan = new Conductor("Juan Pérez");

        // Se crea un Carro con un Motor y un Conductor ya existentes (Agregación)
        Carro miCarro = new Carro("Toyota", motorToyota, conductorJuan);

        miCarro.encenderCarro();
        miCarro.conducirCarro();
    }
    
    
}
