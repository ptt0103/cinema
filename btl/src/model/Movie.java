/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author cuong
 */
public class Movie {
    private int id;
    private String name_Movie;
    private String country;
    private int duration;

    public Movie() {
    }

    public Movie(int id, String name_Movie, String country, int duration) {
        this.id = id;
        this.name_Movie = name_Movie;
        this.country = country;
        this.duration = duration;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName_Movie() {
        return name_Movie;
    }

    public void setName_Movie(String name_Movie) {
        this.name_Movie = name_Movie;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }
    
}
