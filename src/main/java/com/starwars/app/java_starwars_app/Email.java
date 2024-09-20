package com.starwars.app.java_starwars_app;

import java.util.ArrayList;
import com.starwars.app.java_starwars_app.interfaces.IHasLightSaber;

public class Email 
{
    private String asunto;
    private Contacto remitente;
    private ArrayList<Contacto> destinatarios;

    public  Email(Contacto remitente){
        setRemitente(remitente);
        destinatarios = new ArrayList<Contacto>();
    }

    private void setRemitente(Contacto value) 
    {      
        remitente = value;
    }

    public void setAsunto(String value) 
    {      
        asunto = value;
    }

    public ArrayList<Contacto> getDestinatarios() {
      
       return destinatarios;
    }

    public String getAsunto() {
        return asunto;
    }

    public Contacto getRemitente() {
       return remitente;
    }
    
}