package Asteroides;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;


public class Asteroide extends ObjecteCelestial implements EspaiAeriI {

    @Setter
    @Getter
    private String nom;
    @Setter
    @Getter
    private float diametre;
    @Setter
    @Getter
    private boolean esPerillos;

    public Asteroide(String nom) {
        super(nom);
        this.nom = nom;
    }
    @Override
    public boolean isEsPerillos() {
        return this.esPerillos;
    }
}
