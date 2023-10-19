package org.solucion1;

public class TriatletaImpl extends Atleta implements Triatleta {

    private String sabates;
    private String bañador;
    private String bicicleta;

    @Override
    public String getBici() {
        return this.bicicleta;
    }

    @Override
    public void setBici(String bici) {
        this.bicicleta = bici;
    }

    @Override
    public String getSabates() {
        return this.sabates;
    }

    @Override
    public void setSabates(String sabates) {
        this.sabates = sabates;
    }

    @Override
    public String getBananor() {
        return this.bañador;
    }

    @Override
    public void setBanador(String banador) {
        this.bañador = banador;

    }
}
