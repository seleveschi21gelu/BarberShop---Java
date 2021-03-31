package com.barbershop.service;

import com.barbershop.entity.Appointment;
import com.barbershop.repository.AppointmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Service
public class AppointmentService {

    @Autowired
    private AppointmentRepository appointmentRepository;

    public List<Appointment> getAllAppointments(){
        return appointmentRepository.findAll();
    }

    public Appointment getAppointmentById(Integer id){
       return appointmentRepository.findById(id).orElseThrow(()->new RuntimeException("The id: " +id+" was not found"));
    }

    public Appointment addAppointment(Appointment appointment){
        return appointmentRepository.save(appointment);
    }

    public Appointment updateAppointment(Appointment appointment){
        return appointmentRepository.save(appointment);
    }
    public void deleteAppointmentById(Integer id){
        appointmentRepository.deleteById(id);
    }

}
