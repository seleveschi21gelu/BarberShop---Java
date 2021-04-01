package com.barbershop.controller;

import com.barbershop.entity.BarberEntity;
import com.barbershop.service.BarberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/barber")
public class BarberRestController {

    @Autowired
    private BarberService barberService;

    @GetMapping
    public List<BarberEntity> getAllBarbers() {
        return barberService.getAllBarbers();
    }

    @GetMapping("/{id}")
    public BarberEntity getBarberById(@PathVariable Integer id) {
        return barberService.getBarberById(id);
    }

    @PostMapping
    public BarberEntity addBarber(@RequestBody BarberEntity barberEntity) {
        return barberService.addBarber(barberEntity);
    }

    @PutMapping("/{id}")
    public BarberEntity updateBarberById(@RequestBody BarberEntity barberEntity, @PathVariable Integer id) {
        barberEntity.setId(id);
        return barberService.updateBarberById(barberEntity);
    }

    @DeleteMapping("/{id}")
    public void deleteBarberById(@PathVariable Integer id) {
        barberService.deleteBarberById(id);
    }


}
