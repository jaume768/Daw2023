package org.example;


import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
public @Data class Moix /*implements Comparable<Moix>*/ {
    private String nom;
    private  String raca;
    private int edad;
    private boolean hasPedigree;

    /*
    @Override
    public int compareTo(Moix o) {
        return this.nom.compareTo(o.nom);
    }

     */
}
