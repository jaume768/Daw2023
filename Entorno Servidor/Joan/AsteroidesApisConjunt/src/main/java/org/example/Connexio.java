package org.example;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class Connexio {
    public String connexio(String peticio) {
        String peticion = peticio;
        String jsonResponse = "";

        try {
            URL url = new URL(peticion);
            HttpURLConnection connection = (HttpURLConnection)url.openConnection();
            connection.setRequestMethod("GET");
            int responseCode = connection.getResponseCode();
            if (responseCode != 200) {
                System.out.println("La petición GET no fue exitosa. Código de respuesta: " + responseCode);
                return jsonResponse;
            }

            BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            StringBuilder response = new StringBuilder();

            String inputLine;
            while((inputLine = in.readLine()) != null) {
                response.append(inputLine);
            }

            in.close();
            jsonResponse = response.toString();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return jsonResponse;
    }
}
