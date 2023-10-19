package org.example;

import java.util.Scanner;

public class Inputs {

    Scanner sc = new Scanner(System.in);
    public String PedriApi(){

        return sc.nextLine();

    }
    public int Menu(){

        while (!sc.hasNextInt()) {
            sc.next();
        }

        return sc.nextInt();

    }
}
