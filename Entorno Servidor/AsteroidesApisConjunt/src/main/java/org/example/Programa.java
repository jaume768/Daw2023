package org.example;

import Asteroides.AsteroideService;
import Servicios.Nasa;
import Servicios.Politecnic;

public class Programa {
    public void programa(){

        Inputs in = new Inputs();

        String apiTriada = in.PedriApi();

        AsteroideService asteroideService = null;

        if (apiTriada.equals("nasa")){
            asteroideService = new AsteroideService(new Nasa());
        } else if (apiTriada.equals("politecnic")){
            asteroideService = new AsteroideService(new Politecnic());
        }


        int Triar = 0;

        while (Triar != 4){
            Triar = in.Menu();

            if (Triar == 1){
                System.out.println(asteroideService.getMinAsteroide().getNom());
            } else if (Triar == 2) {
                System.out.println(asteroideService.getMaxAsteroide().getNom());
            } else if (Triar == 3){
                asteroideService.getPerillosos();
            }

        }


    }

}
