package Asteroides;

import Apis.Font;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AsteroideService {

    private Font fonts;

    public AsteroideService(Font fonts){
        this.fonts = fonts;
    }

    public Asteroide getMaxAsteroide() {

        LocalDate localDateAvui = LocalDate.now();
        LocalDate localDateAhir = LocalDate.now().minusDays(1);

        List <Asteroide> asteroides = this.fonts.getAsteroideByDate(localDateAvui,localDateAhir);

        Collections.sort(asteroides, (a1,a2) -> Float.compare(a2.getDiametre(),a1.getDiametre()));

        return asteroides.get(0);
    }

    public Asteroide getMinAsteroide() {
        LocalDate localDateAvui = LocalDate.now();
        LocalDate localDateAhir = LocalDate.now().minusDays(1);

        List <Asteroide> asteroides = this.fonts.getAsteroideByDate(localDateAvui,localDateAhir);

        Collections.sort(asteroides, (a1,a2) -> Float.compare(a2.getDiametre(),a1.getDiametre()));

        return asteroides.get(asteroides.size()-1);
    }

    public List<Asteroide> getPerillosos() {

        LocalDate localDateAvui = LocalDate.now();
        LocalDate localDateAhir = LocalDate.now().minusDays(1);

        List <Asteroide> asteroides = this.fonts.getAsteroideByDate(localDateAvui,localDateAhir);
        List <Asteroide> asteroidesPersillosos = new ArrayList<>();

        for (Asteroide asteroide : asteroides) {
            if (asteroide.isEsPerillos()) {
                asteroidesPersillosos.add(asteroide);
            }
        }

        return asteroidesPersillosos;
    }
}
