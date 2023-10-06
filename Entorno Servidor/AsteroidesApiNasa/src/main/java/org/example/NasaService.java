package org.example;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;


public class NasaService {
    private final String api = "tzw4J9OhF5l72FdVgN1tikABuLlO4ThFixaJCPj3";
    private final String URL_NASA = "https://api.nasa.gov/neo/rest/v1/feed";

    public List<Asteroide> getAsteroides(LocalDateTime avui,LocalDateTime ahir){

        List<Asteroide> asteroides = new ArrayList<>();

        String avuiParse = "2023-10-03";
        String ahirParse = "2023-10-02";

        final String peticio = URL_NASA + "?start_date=" + ahirParse + "&end_date=" + avuiParse + "&api_key=" + api;
        String json = connexio(peticio);

        // parseo de asteorides
        Gson gson = new Gson();

        JsonObject nasaResponse = gson.fromJson(json, JsonObject.class);

        JsonObject nasaEarthObjects = nasaResponse.get("near_earth_objects").getAsJsonObject();

        JsonArray asteroidesAhirJson = nasaEarthObjects.get(ahirParse).getAsJsonArray();
        JsonArray asteroidesAvuiJson = nasaEarthObjects.get(avuiParse).getAsJsonArray();

        //modern

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


            asteroide.setDiametre((float)(diametreMin+diameterMax)/2);

            return asteroide;
        }).toList();

        asteroides.addAll(asteroidsAvui);

        return asteroides;

    }

    private String connexio(String peticio){

        String peticion = peticio;
        String jsonResponse = "";

        try {
            URL url = new URL(peticion);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");

            int responseCode = connection.getResponseCode();

            if (responseCode == HttpURLConnection.HTTP_OK) {
                BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
                String inputLine;
                StringBuilder response = new StringBuilder();

                while ((inputLine = in.readLine()) != null) {
                    response.append(inputLine);
                }
                in.close();

                jsonResponse = response.toString();
            } else {
                System.out.println("La petición GET no fue exitosa. Código de respuesta: " + responseCode);
                return jsonResponse;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return jsonResponse;
    }



}
