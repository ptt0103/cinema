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
public class M_Show_movie {
    private String name_movie;
    private String date;
    private String start_time;
    private int fare;

    public M_Show_movie() {
    }

    public M_Show_movie(String name_movie, String date, String start_time, int fare) {
        this.name_movie = name_movie;
        this.date = date;
        this.start_time = start_time;
        this.fare = fare;
    }

    public String getName_movie() {
        return name_movie;
    }

    public void setName_movie(String name_movie) {
        this.name_movie = name_movie;
    }

    

    
    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getStart_time() {
        return start_time;
    }

    public void setStart_time(String start_time) {
        this.start_time = start_time;
    }

    public int getFare() {
        return fare;
    }

    public void setFare(int fare) {
        this.fare = fare;
    }
    
}
