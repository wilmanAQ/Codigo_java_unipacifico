
package tallerherenanimal;


public class TallerHerenAnimal {

    
    public static void main(String[] args) {
        Animal miPerro = new Perro();
        Animal miGato = new Gato();
        
        miPerro.hacerSonido();  // El perro ladra
        miGato.hacerSonido();   // El gato maulla
    }
    
}
