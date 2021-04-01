package com.barbershop.controller;

import com.barbershop.entity.AppointmentEntity;
import com.barbershop.service.AppointmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/api")
@CrossOrigin
public class AppointmentRestController {

    @Autowired
    private AppointmentService appointmentService;

    @GetMapping
    public List<AppointmentEntity> getAllAppointment() {
        return appointmentService.getAllAppointments();
    }

    @GetMapping("/{id}")
    public AppointmentEntity getAppointmentById(@PathVariable Integer id) {
        return appointmentService.getAppointmentById(id);
    }

    @PostMapping
    public AppointmentEntity addAppointment(@RequestBody AppointmentEntity appointmentEntity) {
        return appointmentService.addAppointment(appointmentEntity);
    }

    @PutMapping("/{id}")
    public AppointmentEntity updateAppointmentById(@RequestBody AppointmentEntity appointmentEntity, @PathVariable Integer id) {
        appointmentEntity.setId(id);
        return appointmentService.updateAppointment(appointmentEntity);
    }

    @DeleteMapping
    public void deleteAppointmentById(@PathVariable Integer id) {
        appointmentService.deleteAppointmentById(id);
    }


}
