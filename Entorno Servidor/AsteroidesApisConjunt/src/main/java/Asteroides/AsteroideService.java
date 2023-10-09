package Asteroides;

import Apis.Api;

import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class AsteroideService {

    private Api font;

    public AsteroideService(Api font){
        this.font = font;
    }

    public Asteroide getMaxAsteroide() {

        List <Asteroide> asteroides = this.font.getAsteroideByDate();

        Collections.sort(asteroides, (a1,a2) -> Float.compare(a2.getDiametre(),a1.getDiametre()));

        return asteroides.get(0);
    }

    public Asteroide getMinAsteroide() {
        List <Asteroide> asteroides = this.font.getAsteroideByDate();

        Collections.sort(asteroides, (a1,a2) -> Float.compare(a2.getDiametre(),a1.getDiametre()));

        return asteroides.get(asteroides.size()-1);
    }

    public List<Asteroide> getPerillosos() {
        return null;
    }
}
