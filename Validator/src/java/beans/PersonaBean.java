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
import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.component.UIInput;
import javax.faces.context.FacesContext;

/**
 *
 * @author julian.rincon
 */
@Named(value = "personaBean")
@RequestScoped
public class PersonaBean {

    private Persona persona = new Persona(); 
    private static final List<Persona> LISTPERSONAS = new ArrayList();

    /**
     * Creates a new instance of PersonaBean
     */
    public PersonaBean() {
    }

    public List<Persona> getLstPersonas() {
        return LISTPERSONAS;
    }
    
    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }       
    
    public void registrar(){
        LISTPERSONAS.add(this.persona);
    }
    
    public void eliminarPersona(Persona persona){
        LISTPERSONAS.remove(persona);
    }
    
    //FacesContext: Obtener todas las variables manejadas desde JSF
    //UIComponent: El componente que esta llamando este metodo
    public void validar(FacesContext context, UIComponent toValidate, 
            Object value){
        context = FacesContext.getCurrentInstance();
        String texto = (String) value;
        
        if(!texto.equalsIgnoreCase("M") && !texto.equalsIgnoreCase("F")){
            ((UIInput)toValidate).setValid(false);
            context.addMessage(toValidate.getClientId(context), new FacesMessage("Sexo no valido"));
        }
    }
    
}
