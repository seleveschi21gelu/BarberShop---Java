package com.barbershop.service;

import com.barbershop.entity.AppointmentEntity;
import com.barbershop.repository.AppointmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AppointmentService {

    @Autowired
    private AppointmentRepository appointmentRepository;

    public List<AppointmentEntity> getAllAppointments(){
        return appointmentRepository.findAll();
    }

    public AppointmentEntity getAppointmentById(Integer id){
       return appointmentRepository.findById(id).orElseThrow(()->new RuntimeException("The id: " +id+" was not found"));
    }

    public AppointmentEntity addAppointment(AppointmentEntity appointmentEntity){
        return appointmentRepository.save(appointmentEntity);
    }

    public AppointmentEntity updateAppointment(AppointmentEntity appointmentEntity){
        return appointmentRepository.save(appointmentEntity);
    }
    public void deleteAppointmentById(Integer id){
        appointmentRepository.deleteById(id);
    }

}
