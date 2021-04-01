package com.barbershop.service;

import com.barbershop.entity.BarberEntity;
import com.barbershop.repository.BarberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Service
public class BarberService {

    @Autowired
    private BarberRepository barberRepository;

    public List<BarberEntity> getAllBarbers() {
        return barberRepository.findAll();
    }

    public BarberEntity getBarberById(Integer id) {
        return barberRepository.findById(id).orElseThrow(() -> new RuntimeException("The id " + id + " was not found"));

    }

    public BarberEntity addBarber(BarberEntity barberEntity) {
        return barberRepository.save(barberEntity);
    }

    public BarberEntity updateBarberById(BarberEntity barberEntity) {
        return barberRepository.save(barberEntity);
    }

    public void deleteBarberById(Integer id) {
        barberRepository.deleteById(id);
    }


}
