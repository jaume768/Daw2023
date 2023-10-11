package Servicios;

import Apis.Font;
import Asteroides.Asteroide;
import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import org.example.Connexio;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class Politecnic implements Font {

    @Override
    public List<Asteroide> getAsteroideByDate(LocalDate avui, LocalDate ahir) {

        Connexio connexio = new Connexio();

        List<Asteroide> asteroides = new ArrayList();
        String avuiParse = avui.toString();
        String peticio = "https://theteacher.codiblau.com/public/exercicis/nasa?date=" + avuiParse;
        String json = connexio.connexio(peticio);

        Gson gson = new Gson();
        JsonArray jsonArray = gson.fromJson(json, JsonArray.class);

        for (int i = 0; i < jsonArray.size(); i++) {
            JsonObject jsonObject = jsonArray.get(i).getAsJsonObject();
            Asteroide asteroide = new Asteroide(jsonObject.get("asteroid_name").getAsString());

            asteroide.setDiametre(jsonObject.get("asteroid_diameter_mm").getAsFloat());
            asteroide.setEsPerillos(jsonObject.get("asteroid_esperillos").getAsBoolean());

            asteroides.add(asteroide);
        }

        return asteroides;
    }
}
