package com.barbershop.controller;

import com.barbershop.entity.AppointmentDTO;
import com.barbershop.entity.AppointmentEntity;
import com.barbershop.entity.BarberEntity;
import com.barbershop.repository.AppointmentRepository;
import com.barbershop.repository.BarberRepository;
import com.barbershop.service.AppointmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/api")
@CrossOrigin
public class AppointmentRestController {

    @Autowired
    private AppointmentService appointmentService;

    @Autowired
    private AppointmentRepository appointmentRepository;

    @Autowired
    private BarberRepository barberRepository;

    @GetMapping
    public List<AppointmentEntity> getAllAppointment() {
//        List<AppointmentDTO> appointmentDTOList = appointmentService.getAllAppointments();

        return appointmentRepository.findAll();
    }

    @GetMapping("/{id}")
    public AppointmentDTO getAppointmentById(@PathVariable Integer id) {
        return appointmentService.getAppointmentById(id);
    }

    @PostMapping
    public AppointmentEntity addAppointment(@RequestBody AppointmentDTO appointmentDTO) {
//        appointmentDTO = appointmentService.addAppointment(appointmentDTO);
        BarberEntity barber = barberRepository.findByName(appointmentDTO.getBarber());
        AppointmentEntity appointmentEntity = new AppointmentEntity(
                appointmentDTO.getClient(),
                appointmentDTO.getDate(),
                appointmentDTO.getTelephone(),
                appointmentDTO.getTime(),
                barber);
        return appointmentRepository.save(appointmentEntity);

    }

    @PutMapping("/{id}")
    public AppointmentDTO updateAppointmentById(@RequestBody AppointmentDTO appointmentDTO, @PathVariable Integer id) {
        appointmentDTO.setId(id);
        return appointmentService.updateAppointment(appointmentDTO);
    }

    @DeleteMapping
    public void deleteAppointmentById(@PathVariable Integer id) {
        appointmentService.deleteAppointmentById(id);
    }


}
