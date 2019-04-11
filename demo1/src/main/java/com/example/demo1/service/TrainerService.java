package com.example.demo1.service;

import com.example.demo1.entities.Trainer;

import java.util.List;

public interface TrainerService {

    List<Trainer> findAll();

    Trainer findById(int id);

    void save(Trainer theTrainer);

    void deleteById(int id);


}
