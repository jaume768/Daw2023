package org.example;

import java.util.*;

public class Main {
    public static void main(String[] args) {


        Moix tara = new Moix("Para","No",7,false);
        Moix pablo = new Moix("Cablo","Siames",4,true);
        Moix kim = new Moix("Kim","Siames",4,true);
        Moix lola = new Moix("Lola","Siames",8,true);

        //System.out.println(tara.compareTo(pablo));
        //System.out.println(pablo.compareTo(tara));

        List<Moix> moixos = new ArrayList<>();
        moixos.add(tara);
        moixos.add(pablo);
        moixos.add(kim);
        moixos.add(lola);

        /*Collections.sort(moixos, new Comparator<Moix>() {
            @Override
            public int compare(Moix o1, Moix o2) {
                return o1.getNom().compareTo(o2.getNom());
            }
        });*/

        Collections.sort(moixos,(a,b) -> a.getNom().compareTo(b.getNom()));

        List<Moix> moixosJoves = moixos.stream().filter(moix -> moix.getEdad() <= 5).toList();

        for (Moix moix:moixosJoves) {

            System.out.println(moix.getNom());

        }



    }
}