package com.starwars.app.java_starwars_app;

import com.starwars.app.java_starwars_app.interfaces.IClockSuscribe;

public class ClockDemo
        implements IClockSuscribe
 {
    
    private int ticCounter = 0;
    
    public int getTic(){
        return ticCounter;
    }

    public void tic(){
        ticCounter++;
    }
}
