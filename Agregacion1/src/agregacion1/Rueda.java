/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agregacion1;

/**
 *
 * @author Wilmar
 */
public class Rueda {
    
        private String tipo;
        
    public Rueda(String tipo) {
        this.tipo = tipo;
    }
    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Tipo de rueda: " + tipo;
    }

    
}
