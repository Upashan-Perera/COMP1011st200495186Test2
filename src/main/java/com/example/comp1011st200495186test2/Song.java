package com.example.comp1011st200495186test2;

import com.google.gson.annotations.SerializedName;

import java.time.LocalDate;

public class Song {

    @SerializedName("SongTitle")
    private String songTitle;

    @SerializedName("performer")
    private String performer;

    @SerializedName("weekPosition")
    private int weekPosition;

    @SerializedName("Year")
    private int year;

    @SerializedName("month")
    private int month;

    @SerializedName("day")
    private int day;

    @SerializedName("url")
    private String url;

    public String getSongTitle() {
        return songTitle;
    }

    public String getPerformer() {
        return performer;
    }

    public int getWeekPosition() {
        return weekPosition;
    }

    public int getYear() {
        return year;
    }

    public int getMonth() {
        return month;
    }

    public int getDay() {
        return day;
    }

    public String getUrl() {
        return url;
    }

    public String toString() {

        return songTitle + " - " + performer + " - (" + year + "/" + month + "/" + day + ")";
    }

    public LocalDate getWeek() {

        return LocalDate.of(year, month, day);
    }
}
