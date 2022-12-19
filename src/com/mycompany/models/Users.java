/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.models;

import java.sql.Timestamp;
import java.time.LocalDate;

/**
 *
 * @author zerot
 */
public class Users {
    private int id_user;
    private int cedula;
    private int days;
    private String type;
    private Timestamp day_of_arrival;
    private Timestamp registration_date;

    public void setId_user(int id_user) {
        this.id_user = id_user;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public void setDays(int days) {
        this.days = days;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setDay_of_arrival(Timestamp day_of_arrival) {
        this.day_of_arrival = day_of_arrival;
    }

    public void setRegistration_date(Timestamp registration_date) {
        this.registration_date = registration_date;
    }

    

    public int getId_user() {
        return id_user;
    }

    public int getCedula() {
        return cedula;
    }

    public int getDays() {
        return days;
    }

    public String getType() {
        return type;
    }

    public Timestamp getDay_of_arrival() {
        return day_of_arrival;
    }

    public Timestamp getRegistration_date() {
        return registration_date;
    }

    
}
