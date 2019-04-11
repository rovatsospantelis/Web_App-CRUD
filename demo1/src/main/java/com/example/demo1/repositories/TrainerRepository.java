package com.example.demo1.repositories;

import com.example.demo1.entities.Trainer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;


@Component
public interface TrainerRepository extends JpaRepository<Trainer, Integer> {

    Trainer findByFName(String name);

    Trainer findById(int id);

}
