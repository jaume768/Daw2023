package Exercici2iExercici3;

import java.util.ArrayList;
import java.util.List;
import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;

public class findAllCanconsLliures {

    public List<CancoImpl> getCancoSinCopy(){

        Connexio connexio = new Connexio();

        List<CancoImpl> cancos = new ArrayList();
        String peticio = "https://theteacher.codiblau.com/public/exercicis/audiovisuals";
        String json = connexio.connexio(peticio);
        Gson gson = new Gson();

        JsonArray jsonArray = gson.fromJson(json, JsonArray.class);


        for (int i = 0; i < jsonArray.size(); i++) {
            JsonObject jsonObject = jsonArray.get(i).getAsJsonObject();


            if (jsonObject.get("type").getAsString().equals("Can�o")){

                if (!jsonObject.get("copyRight").getAsBoolean()) {
                    CancoImpl canco = new CancoImpl();

                    canco.setNom(jsonObject.get("name").getAsString());
                    canco.setArtista(jsonObject.get("artist").getAsString());

                    cancos.add(canco);
                }
            }

        }

        return cancos;

    }
}
