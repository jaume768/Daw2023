package org.solucion1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<TriatletaImpl> triatletes = new ArrayList<>();

        TriatletaImpl triatleta1 = new TriatletaImpl();
        triatleta1.setNom("Joan");
        TriatletaImpl triatleta2 = new TriatletaImpl();
        triatleta2.setNom("Pep");
        TriatletaImpl triatleta3 = new TriatletaImpl();
        triatleta3.setNom("Jaumes");
        TriatletaImpl triatleta4 = new TriatletaImpl();
        triatleta4.setNom("Alber");

        triatletes.add(triatleta1);
        triatletes.add(triatleta2);
        triatletes.add(triatleta3);
        triatletes.add(triatleta4);

        Atleta atleta = new Atleta();
        atleta.setNom("jaume");


        Collections.sort(triatletes);

        Collections.sort(triatletes,(obj1, obj2) -> obj1.getNom().length()-obj2.getNom().length());

        for (TriatletaImpl triatleta : triatletes) {
            System.out.println(triatleta.getNom());
        }

    }
}