package com.example.comp1011st200495186test2;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;

import java.io.FileReader;
import java.io.IOException;
import java.util.List;

public class APIUtility {

    public static Response[] getSongsFromFile()
    {
        Gson gson = new Gson();

        Response apiResponse[] = null;

        try(
                FileReader fileReader = new FileReader("ChristmasSongs.json");
                JsonReader jsonReader = new JsonReader(fileReader);
        )
        {
            apiResponse = gson.fromJson(jsonReader, Response[].class);
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        return apiResponse;
    }
}
