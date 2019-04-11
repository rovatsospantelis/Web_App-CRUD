package com.example.demo1.service;

import com.example.demo1.entities.Trainer;
import com.example.demo1.repositories.TrainerRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TrainerServiceImpl implements TrainerService {

    private TrainerRepository trainerRepository;

    @Autowired
    public TrainerServiceImpl(TrainerRepository trainerRepository) {
        this.trainerRepository = trainerRepository;
    }

    @Override
    public List<Trainer> findAll() {
        return trainerRepository.findAll();
    }

    @Override
    public Trainer findById(int id) {
        return trainerRepository.findById(id);
    }

    @Override
    public void save(Trainer theTrainer) {
        trainerRepository.save(theTrainer);
    }

    @Override
    public void deleteById(int id) {
        trainerRepository.deleteById(id);
    }
}
