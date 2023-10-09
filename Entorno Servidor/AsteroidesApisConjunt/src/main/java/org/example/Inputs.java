package org.example;

import java.util.Scanner;

public class Inputs {

    Scanner sc = new Scanner(System.in);

    public String PedriApi(){

        System.out.println("Quina api vols? (nasa o politecnic)");
        return sc.nextLine();

    }
    public int Menu(){
        System.out.println("Que vols fer?");
        System.out.println("1 - Obtenir el asteroide mes petit.");
        System.out.println("2 - Obtenir el asteroide mes gran.");
        System.out.println("3 - Obtenir els asteroides perillosos.");
        System.out.println("4 - Exit.");

        return sc.nextInt();

    }
}
