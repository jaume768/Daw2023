package org.example;

import Apis.Api;
import Asteroides.AsteroideService;
import Servicios.Nasa;

public class Programa {
    public void programa(){

        Inputs in = new Inputs();

        String apiTriada = in.PedriApi();

        AsteroideService asteroideService = new AsteroideService(new Nasa());


        System.out.println(asteroideService.getMinAsteroide().getNom());

    }

}
