package com.imer1c.util;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.imer1c.CurseforgeAPIProvider;
import com.imer1c.requests.body.IBody;

import java.io.*;
import java.net.*;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Map;

public class HttpUtil {
    public static String sendGetRequest(String apiKey, String link) {
        try
        {
            URL url = new URL(link);
            HttpURLConnection con = (HttpURLConnection) url.openConnection();
            con.setRequestMethod("GET");
            con.setRequestProperty("X-Api-Key", apiKey);
            con.setRequestProperty("Accept", "application/json");

            int status = con.getResponseCode();

            if (status != 200)
            {
                return null;
            }

            BufferedReader reader = new BufferedReader(new InputStreamReader(con.getInputStream()));

            StringBuilder builder = new StringBuilder();
            String line = reader.readLine();
            while (line != null)
            {
                builder.append(line);
                line = reader.readLine();
            }

            return builder.toString();
        }
        catch (IOException e)
        {
            throw new RuntimeException(e);
        }
    }

    public static String sendPostRequest(String apiKey, String link, IBody body) {
        try
        {
            URL url = new URL(link);
            HttpURLConnection con = (HttpURLConnection) url.openConnection();
            con.setRequestMethod("POST");
            con.setRequestProperty("Content-Type", "application/json");
            con.setRequestProperty("Accept", "application/json");
            con.setRequestProperty("X-Api-Key", apiKey);
            con.setDoOutput(true);

            Map<String, IBody> jsonMap = new HashMap<>();

            jsonMap.put("body", body);

            OutputStream outputStream = con.getOutputStream();

            String json = CurseforgeAPIProvider.GSON.toJson(jsonMap);
            System.out.println("Sent json: \n" + json);
            outputStream.write(json.getBytes());

            outputStream.flush();
            outputStream.close();

            int status = con.getResponseCode();

            if (status != 200)
            {
                System.out.println("Error: Status code " + status + " on post request");
                return null;
            }

            BufferedReader reader = new BufferedReader(new InputStreamReader(con.getInputStream()));

            StringBuilder builder = new StringBuilder();
            String line = reader.readLine();
            while (line != null)
            {
                builder.append(line);
                line = reader.readLine();
            }

            return builder.toString();
        }
        catch (IOException e)
        {
            throw new RuntimeException(e);
        }
    }
}
