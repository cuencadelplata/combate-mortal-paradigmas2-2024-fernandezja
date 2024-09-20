package com.starwars.app.java_starwars_app;

import java.util.ArrayList;
import com.starwars.app.java_starwars_app.interfaces.IHasLightSaber;

public class Contacto 
{
    private String email;

    public  Contacto(String email){
        setEmail(email);
    }

    public String getEmail(){
        return email;
    }
   
    private void setEmail(String value){
        email = value;
    }
    
}
