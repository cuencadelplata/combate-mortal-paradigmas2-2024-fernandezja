package com.starwars.app.java_starwars_app;
import java.util.ArrayList;

import com.starwars.app.java_starwars_app.interfaces.IClockSuscribe;

public class Clock {
    
    private ArrayList<IClockSuscribe> suscribes;

    public Clock() {
        suscribes = new ArrayList<IClockSuscribe>();
    }

    private ArrayList<IClockSuscribe> getSuscribes(){
        return suscribes;
    }

    public void suscribe(IClockSuscribe s){
        getSuscribes().add(s);

    }

    public void tic(){
        for (IClockSuscribe c : suscribes) {
            c.tic();
        }

    }

}
