package com.starwars.app.java_starwars_app;

import com.starwars.app.java_starwars_app.interfaces.IHasLightSaber;

public class Jedi 
        implements IHasLightSaber
{
    private String name;
    private LightSaber lightSaber;

    public Jedi(){
        
    }

    public Jedi(String name ){
        setName(name);
    }

    public String getName(){
        return name;
    }

    public void setName(String value){
        name = value;
    }

    public LightSaber getLightSaber(){
        return lightSaber;
    }

    public void setLightSaber(LightSaber value){
        lightSaber = value;
    }

    public boolean hasLightSaber() {
        if (getLightSaber() != null) {
            return true;
        }

        return false;
    }
}
