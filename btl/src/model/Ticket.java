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
public class Ticket {
    
    private String name_moive;
    private String date_movie;
    private String time_moive;
    private int fare_moive;
    private int num_seat;
    private int show_id, movie_id, user_id, booking_id;
    private String nameKH;
    
   
    public Ticket() {
    }

    public Ticket(String name_moive, String date_movie, String time_moive, int fare_moive, int num_seat, int show_id, int movie_id, int user_id, int booking_id, String nameKH) {
        this.name_moive = name_moive;
        this.date_movie = date_movie;
        this.time_moive = time_moive;
        this.fare_moive = fare_moive;
        this.num_seat = num_seat;
        this.show_id = show_id;
        this.movie_id = movie_id;
        this.user_id = user_id;
        this.booking_id = booking_id;
        this.nameKH = nameKH;
    }

    public String getNameKH() {
        return nameKH;
    }

    public void setNameKH(String nameKH) {
        this.nameKH = nameKH;
    }

    

    public int getNum_seat() {
        return num_seat;
    }

    public void setNum_seat(int num_seat) {
        this.num_seat = num_seat;
    }

    

    
    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public String getName_moive() {
        return name_moive;
    }

    public void setName_moive(String name_moive) {
        this.name_moive = name_moive;
    }

    public String getDate_movie() {
        return date_movie;
    }

    public void setDate_movie(String date_movie) {
        this.date_movie = date_movie;
    }

    public String getTime_moive() {
        return time_moive;
    }

    public void setTime_moive(String time_moive) {
        this.time_moive = time_moive;
    }

    public int getFare_moive() {
        return fare_moive;
    }

    public void setFare_moive(int fare_moive) {
        this.fare_moive = fare_moive;
    }

    public int getShow_id() {
        return show_id;
    }

    public void setShow_id(int show_id) {
        this.show_id = show_id;
    }

    public int getMovie_id() {
        return movie_id;
    }

    public void setMovie_id(int movie_id) {
        this.movie_id = movie_id;
    }

    public int getBooking_id() {
        return booking_id;
    }

    public void setBooking_id(int booking_id) {
        this.booking_id = booking_id;
    }
    
}
