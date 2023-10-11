package org.example;

import Asteroides.Asteroide;
import Asteroides.AsteroideService;
import Servicios.Nasa;
import Servicios.Politecnic;

import java.util.List;

public class Programa {
    public void programa(){

        Inputs in = new Inputs();
        Ouputs ou = new Ouputs();

        String apiTriada = "";

        do {
            ou.perdirApi();
            apiTriada = in.PedriApi();
        } while (!esApiValida(apiTriada));

        AsteroideService asteroideService = null;

        if (apiTriada.equals("nasa")){
            asteroideService = new AsteroideService(new Nasa());
        } else if (apiTriada.equals("politecnic")){
            asteroideService = new AsteroideService(new Politecnic());
        }

        int Triar = 0;

        while (Triar != 4){

            ou.pedirMenu();



            Triar = in.Menu();

            if (Triar == 1){
                ou.imrimirAsteroide(asteroideService.getMinAsteroide());
            } else if (Triar == 2) {
                ou.imrimirAsteroide(asteroideService.getMaxAsteroide());
            } else if (Triar == 3){
                ou.imprimirAsteroides(asteroideService.getPerillosos());
            }

        }

    }

    private boolean esApiValida(String input) {

        return input.equals("nasa") || input.equals("politecnic");

    }

}
