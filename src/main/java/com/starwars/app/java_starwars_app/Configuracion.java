package com.starwars.app.java_starwars_app;

//Patron de diseño de software (de codificacion)
//Singleton
public class Configuracion {

    private static Configuracion instancia;

    private Configuracion() 
    { 

    }

    public static Configuracion getInstancia() 
    {
        if (instancia == null) {
            instancia = new Configuracion();
        }
        return instancia;
    }

}