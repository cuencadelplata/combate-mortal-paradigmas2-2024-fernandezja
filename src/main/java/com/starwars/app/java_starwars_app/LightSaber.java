package com.starwars.app.java_starwars_app;

public class LightSaber{
    private String name;
    private String color;

    public String getName(){
        return name;
    }

    public void setName(String value){
        name = value;
    }

    public String getColor(){
        return color;
    }

    private void setColor(String value){
        color = value;
    }

    public LightSaber(String color){
        setColor(color);
    }
}
