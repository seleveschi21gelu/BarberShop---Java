package com.barbershop.service;

import com.barbershop.entity.AppointmentDTO;
import com.barbershop.entity.AppointmentEntity;
import com.barbershop.entity.BarberEntity;
import com.barbershop.repository.AppointmentRepository;
import com.barbershop.repository.BarberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AppointmentService {

    @Autowired
    private AppointmentRepository appointmentRepository;

    @Autowired
    private BarberRepository barberRepository;

    public List<AppointmentEntity> getAllAppointments() {
//        List<AppointmentEntity> appointmentEntityList = appointmentRepository.findAll();
//        List<AppointmentDTO> appointmentDTOList = new ArrayList<>();
//
//        for (AppointmentEntity appointmentEntity : appointmentEntityList) {
//            appointmentDTOList.add(
//                    new AppointmentDTO(appointmentEntity.getId(),
//                            appointmentEntity.getClient(),
//                            appointmentEntity.getDate(),
//                            appointmentEntity.getTelephone(),
//                            appointmentEntity.getTime(),
//                            appointmentEntity.getBarber().getName()));
//
//        }
//        return appointmentDTOList;
        return appointmentRepository.findAll();

    }

    public AppointmentDTO getAppointmentById(Integer id) {
        AppointmentEntity appointmentEntity = appointmentRepository.findById(id).orElseThrow(() -> new RuntimeException("The id: " + id + " was not found"));

        AppointmentDTO appointmentDTO = new AppointmentDTO(appointmentEntity.getId(),
                appointmentEntity.getClient(),
                appointmentEntity.getDate(),
                appointmentEntity.getTelephone(),
                appointmentEntity.getTime(),
                appointmentEntity.getBarber().getName());

        return appointmentDTO;

    }

    public AppointmentEntity addAppointment(AppointmentDTO appointmentDTO) {
        BarberEntity barber = barberRepository.findByName(appointmentDTO.getBarber());
        AppointmentEntity appointmentEntity = new AppointmentEntity(
                appointmentDTO.getClient(),
                appointmentDTO.getDate(),
                appointmentDTO.getTelephone(),
                appointmentDTO.getTime(),
                barber);

        return appointmentRepository.save(appointmentEntity);

    }


    public AppointmentDTO updateAppointment(AppointmentDTO appointmentDTO) {
        BarberEntity barber = new BarberEntity();

        AppointmentEntity appointmentEntity = new AppointmentEntity();
        appointmentEntity.setId(appointmentDTO.getId());
        appointmentEntity.setClient(appointmentDTO.getClient());
        appointmentEntity.setDate(appointmentDTO.getDate());
        appointmentEntity.setTelephone(appointmentDTO.getTelephone());
        appointmentEntity.setTime(appointmentDTO.getTime());
        appointmentEntity.setBarber(barber);
        appointmentRepository.save(appointmentEntity);
        return appointmentDTO;

    }

    public void deleteAppointmentById(Integer id) {
        appointmentRepository.deleteById(id);
    }

}
