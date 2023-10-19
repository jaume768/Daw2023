package Asteroides;
import Apis.Font;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ObjecteCelestialService<T extends ObjecteCelestial> {

    private T object;
    private Font fonts;

    public ObjecteCelestialService(Font fonts){
        this.fonts = fonts;
    }
    public void set(T object){
        this.object = object;
    }

    public T getMaxObjecteCelestial() {

        return null;
    }

    public T getMinObjecteCelestial() {
        return null;
    }

    public List<T> getPerillosos() {

        List<T> objectesCelestials = (List<T>) this.fonts.getAsteroideByDate(null,null);

        return objectesCelestials.stream().filter(oc -> oc.isEsPerillos()).toList();
    }

}
