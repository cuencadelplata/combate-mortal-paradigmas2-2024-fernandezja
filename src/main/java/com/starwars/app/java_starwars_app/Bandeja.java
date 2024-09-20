package com.starwars.app.java_starwars_app;

import java.util.ArrayList;

import com.starwars.app.java_starwars_app.interfaces.IHasLightSaber;
import java.util.function.Predicate;

import org.springframework.boot.autoconfigure.amqp.RabbitProperties.Stream;
import java.util.*;
import java.util.stream.*;

public class Bandeja 
{
    private ArrayList<Email> items;

    public  Bandeja(){
        items = new ArrayList<Email>();
    }

    public void add(Email email) 
    {      
        items.add(email);
    }

    public ArrayList<Email> filtrarPorAsunto(String asuntoParaFiltrar) {
       
        Predicate<Email> filtroPorAsunto = e -> e.getAsunto().contains(asuntoParaFiltrar);

        var filtrado = this.items.stream()
                        .filter(filtroPorAsunto)
                        .collect(Collectors
                        .toCollection(ArrayList::new));

        return filtrado;
    }

    public Predicate<Email> generarFiltroPorAsunto(String asuntoParaFiltrar) {
        
        Predicate<Email> filtroPorAsunto = e -> e.getAsunto().contains(asuntoParaFiltrar);
        return filtroPorAsunto;
    }

    public ArrayList<Email> filtrar(Predicate<Email> filtro) {

        return this.items.stream()
                .filter(filtro)
                .collect(Collectors
                .toCollection(ArrayList::new));
    }

    
}