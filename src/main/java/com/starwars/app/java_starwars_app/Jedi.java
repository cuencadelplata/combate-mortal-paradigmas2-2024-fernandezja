package com.starwars.app.java_starwars_app;

public class Jedi {
    private String name;
    private LightSaber lightSaber;

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
