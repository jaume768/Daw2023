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

public class Nasa implements Font {

    private final String api = "LrbIaa9XsR8a13kaSXbBDYqFrAfGPIJSXEE7NVd1";
    private final String URL_NASA = "https://api.nasa.gov/neo/rest/v1/feed";
    @Override
    public List<Asteroide> getAsteroideByDate(LocalDate avui, LocalDate ahir) {

        Connexio connexio = new Connexio();

        List<Asteroide> asteroides = new ArrayList();
        String avuiParse = avui.toString();
        String ahirParse = ahir.toString();
        String peticio = URL_NASA + "?start_date=" + ahirParse + "&end_date=" + avuiParse + "&api_key=" + api;
        String json = connexio.connexio(peticio);
        Gson gson = new Gson();
        JsonObject nasaResponse = (JsonObject)gson.fromJson(json, JsonObject.class);
        JsonObject nasaEarthObjects = nasaResponse.get("near_earth_objects").getAsJsonObject();
        JsonArray asteroidesAhirJson = nasaEarthObjects.get(ahirParse).getAsJsonArray();
        JsonArray asteroidesAvuiJson = nasaEarthObjects.get(avuiParse).getAsJsonArray();
        List<Asteroide> asteroidsAvui = asteroidesAvuiJson.asList().stream().map(obj ->{
            Asteroide asteroide = new Asteroide(obj.getAsJsonObject().get("name").getAsString());

            Double diametreMin = obj.getAsJsonObject()
                    .get("estimated_diameter")
                    .getAsJsonObject().get("kilometers")
                    .getAsJsonObject().get("estimated_diameter_min")
                    .getAsDouble();

            Double diameterMax = obj.getAsJsonObject()
                    .get("estimated_diameter")
                    .getAsJsonObject().get("kilometers")
                    .getAsJsonObject().get("estimated_diameter_max")
                    .getAsDouble();

            asteroide.setEsPerillos(obj.getAsJsonObject().get("is_potentially_hazardous_asteroid").getAsBoolean());

            asteroide.setDiametre((float)(diametreMin+diameterMax)/2);

            return asteroide;
        }).toList();

        asteroides.addAll(asteroidsAvui);

        return asteroides;

    }
}
