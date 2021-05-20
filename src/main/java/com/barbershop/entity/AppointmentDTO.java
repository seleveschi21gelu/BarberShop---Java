package com.barbershop.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDate;

@Entity
public class AppointmentDTO {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String client;
    private LocalDate date;
    private String telephone;
    private String time;
    private String barber;

    public AppointmentDTO(String client, LocalDate date, String telephone, String time, String barber) {
        this.client = client;
        this.date = date;
        this.telephone = telephone;
        this.time = time;
        this.barber = barber;
    }

    public AppointmentDTO() {
    }

    public AppointmentDTO(Integer id, String client, LocalDate date, String telephone, String time, String barber) {
        this.id = id;
        this.client = client;
        this.date = date;
        this.telephone = telephone;
        this.time = time;
        this.barber = barber;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getClient() {
        return client;
    }

    public void setClient(String client) {
        this.client = client;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getBarber() {
        return barber;
    }

    public void setBarber(String barber) {
        this.barber = barber;
    }
}
