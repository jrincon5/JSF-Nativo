/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import javax.inject.Named;
import javax.enterprise.context.RequestScoped;

/**
 *
 * @author julian.rincon
 */
@Named(value = "personaBean")
@RequestScoped
public class PersonaBean {

    private String nombre;
    private String mensaje;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    /**
     * Creates a new instance of PersonaBean
     */
    public PersonaBean() {
    }

    public void saludar() {
        this.mensaje = "Hola, usted es" + this.nombre;
    }

}
