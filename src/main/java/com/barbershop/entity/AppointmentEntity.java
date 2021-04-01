package com.barbershop.entity;

import javax.persistence.*;
import java.time.LocalDate;


@Entity
public class AppointmentEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String client;
    private LocalDate date;
    private String telephone;
    private String time;

    @ManyToOne
    @JoinColumn(name = "barberId", referencedColumnName = "id")
    private BarberEntity barber;


    public AppointmentEntity() {
    }

    public AppointmentEntity(String client, LocalDate date, String telephone, String time,BarberEntity barber) {
        this.client = client;
        this.date = date;
        this.telephone = telephone;
        this.time = time;
        this.barber =barber;
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

    public BarberEntity getBarber() {
        return barber;
    }

    public void setBarber(BarberEntity barber) {
        this.barber = barber;
    }
}
