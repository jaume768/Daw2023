package Exercici2iExercici3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;

public class ObjecteGeneric <T extends AudiovisualImpl>{
    private T object;

    public void set(T object){
        this.object = object;
    }

    public List <T> Ordenar(List<T> llista){

        Collections.sort(llista,(obj1, obj2) -> obj2.getTemps() - obj1.getTemps());

        return llista;

    }

    public List<T> findByDuradaMinima(List<T> llista,int temps){

        Predicate<Integer> minimDurada = (i) -> i > temps;
        List<T> temp = new ArrayList<>();

        for (int i = 0; i < llista.size(); i++) {

            if (minimDurada.test(llista.get(i).getTemps())){
                temp.add(llista.get(i));
            }

        }

        return temp;

    }

    public List<T> findByDuradaMaxima(List<T> llista,int temps){

        Predicate<Integer> maximaDurada = (i) -> i < temps;
        List<T> temp = new ArrayList<>();

        for (int i = 0; i < llista.size(); i++) {

            if (maximaDurada.test(llista.get(i).getTemps())){
                temp.add(llista.get(i));
            }

        }

        return temp;

    }
}
