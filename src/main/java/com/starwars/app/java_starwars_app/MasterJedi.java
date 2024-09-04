package com.starwars.app.java_starwars_app;

import com.starwars.app.java_starwars_app.interfaces.IHasLightSaber;

public class MasterJedi 
        extends Jedi
{
    private String title;

    public String getTitle(){
        return title;
    }

    public void setTitle(String value){
        title = value;
    }

}
