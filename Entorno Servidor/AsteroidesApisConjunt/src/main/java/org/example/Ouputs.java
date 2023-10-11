package org.example;

import Asteroides.Asteroide;

import java.util.List;

public class Ouputs {

    public void imprimirAsteroides(List<Asteroide> asteroides){

        for (Asteroide asteroide : asteroides) {
            System.out.println("Nombre: " + asteroide.getNom());
            System.out.println("Diámetro: " + asteroide.getDiametre());
            System.out.println("----------------------");
        }

    }

    public void imrimirAsteroide(Asteroide asteroide){

        System.out.println(asteroide.getNom());

    }

    public void perdirApi(){

        System.out.println("Quina api vols? (nasa o politecnic)");

    }

    public void pedirMenu(){
        System.out.println("Que vols fer?");
        System.out.println("1 - Obtenir el asteroide mes petit.");
        System.out.println("2 - Obtenir el asteroide mes gran.");
        System.out.println("3 - Obtenir els asteroides perillosos.");
        System.out.println("4 - Exit.");
    }

}
