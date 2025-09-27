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
public class Usuario extends Persona implements Notificable{
    
    private String telefono;

    public Usuario(String nombre, String cedula, String telefono) {
        super(nombre, cedula);// Trae los atributos de la clase padre o de la supe-rclase
        this.telefono = telefono;
    }

    @Override
    public void notificar(String mensaje) {
        System.out.println("📲 Notificación a " + nombre + ": " + mensaje);
    }

    public String getNombre() {
        return nombre;
    }

    
}
