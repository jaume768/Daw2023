package org.solucion1;

import lombok.Data;

public @Data class Atleta implements Comparable<Atleta>{
    private String nom;
    private String cognom;

    @Override
    public int compareTo(Atleta o) {
        return this.nom.compareTo(o.getNom());
    }
}
