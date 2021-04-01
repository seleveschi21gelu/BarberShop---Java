package com.barbershop.repository;

import com.barbershop.entity.BarberEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BarberRepository extends JpaRepository<BarberEntity,Integer> {
}
