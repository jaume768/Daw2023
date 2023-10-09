package Asteroides;

import Apis.Font;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AsteroideService {

    private Font fonts;

    public AsteroideService(Font fonts){
        this.fonts = fonts;
    }

    public Asteroide getMaxAsteroide() {

        List <Asteroide> asteroides = this.fonts.getAsteroideByDate();

        Collections.sort(asteroides, (a1,a2) -> Float.compare(a2.getDiametre(),a1.getDiametre()));

        return asteroides.get(0);
    }

    public Asteroide getMinAsteroide() {
        List <Asteroide> asteroides = this.fonts.getAsteroideByDate();

        Collections.sort(asteroides, (a1,a2) -> Float.compare(a2.getDiametre(),a1.getDiametre()));

        return asteroides.get(asteroides.size()-1);
    }

    public List<Asteroide> getPerillosos() {

        List <Asteroide> asteroides = this.fonts.getAsteroideByDate();
        List <Asteroide> asteroidesPersillosos = new ArrayList<>();

        for (Asteroide asteroide : asteroides) {
            if (asteroide.isEsPerillos()) {
                asteroidesPersillosos.add(asteroide);
            }
        }

        for (Asteroide asteroide : asteroides) {
            System.out.println("Nombre: " + asteroide.getNom());
            System.out.println("Diámetro: " + asteroide.getDiametre());
            System.out.println("----------------------");
        }

        return asteroidesPersillosos;
    }
}
