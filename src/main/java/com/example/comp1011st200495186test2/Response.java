package com.example.comp1011st200495186test2;

import com.google.gson.annotations.SerializedName;

import java.util.Arrays;
import java.util.List;

public class Response {

    @SerializedName("[]")
    private Song[] songs;

    public List<Song> getSongs()
    {
        return Arrays.asList(songs);
    }
}
