package Servicios;

import Apis.Font;
import Asteroides.Asteroide;
import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import org.example.Connexio;

import java.util.ArrayList;
import java.util.List;

public class Nasa implements Font {

    private final String api = "tzw4J9OhF5l72FdVgN1tikABuLlO4ThFixaJCPj3";
    private final String URL_NASA = "https://api.nasa.gov/neo/rest/v1/feed";
    @Override
    public List<Asteroide> getAsteroideByDate() {

        Connexio connexio = new Connexio();

        List<Asteroide> asteroides = new ArrayList();
        String avuiParse = "2023-10-03";
        String ahirParse = "2023-10-02";
        String peticio = "https://api.nasa.gov/neo/rest/v1/feed?start_date=" + ahirParse + "&end_date=" + avuiParse + "&api_key=tzw4J9OhF5l72FdVgN1tikABuLlO4ThFixaJCPj3";
        String json = connexio.connexio(peticio);
        Gson gson = new Gson();
        JsonObject nasaResponse = (JsonObject)gson.fromJson(json, JsonObject.class);
        JsonObject nasaEarthObjects = nasaResponse.get("near_earth_objects").getAsJsonObject();
        JsonArray asteroidesAhirJson = nasaEarthObjects.get(ahirParse).getAsJsonArray();
        JsonArray asteroidesAvuiJson = nasaEarthObjects.get(avuiParse).getAsJsonArray();
        List<Asteroide> asteroidsAvui = asteroidesAvuiJson.asList().stream().map(obj ->{
            Asteroide asteroide = new Asteroide();
            asteroide.setNom(obj.getAsJsonObject().get("name").getAsString());

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
