package org.example;

import java.util.Scanner;

public class Inputs {

    Scanner sc = new Scanner(System.in);

    public String PedriApi(){

        System.out.println("Que api quieres? (nasa o politecnic)");
        return sc.nextLine();

    }
}
