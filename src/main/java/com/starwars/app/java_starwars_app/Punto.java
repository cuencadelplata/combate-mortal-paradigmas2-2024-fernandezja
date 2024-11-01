package com.starwars.app.java_starwars_app;

public final class Punto {
    private final int x; //final=readonly
    private final int y;

    public Punto(int x, int y) {
        this.x = x;
        //setX(x);
        this.y = y;
    }

    //private void setX(int value) { 
    //    this.x = value; 
    //}

    public int getX() { 
        return x; 
    }

    public int getY() { 
        return y; 
    }
}