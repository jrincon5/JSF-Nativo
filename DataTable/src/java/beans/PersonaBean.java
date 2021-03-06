/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import clases.Persona;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;

/**
 *
 * @author julian.rincon
 */
@Named(value = "personaBean")
@RequestScoped
public class PersonaBean {

    private Persona persona = new Persona(); 
    private static List<Persona> lstPersonas = new ArrayList();

    /**
     * Creates a new instance of PersonaBean
     */
    public PersonaBean() {
    }

    public List<Persona> getLstPersonas() {
        return lstPersonas;
    }

    public void setLstPersonas(List<Persona> lstPersonas) {
        lstPersonas = lstPersonas;
    }
    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }       
    
    public void agregarPersona(){
        lstPersonas.add(this.persona);
    }
    
    public void eliminarPersona(Persona persona){
        lstPersonas.remove(persona);
    }
    
}
