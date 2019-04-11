package com.example.demo1.controllers;


import com.example.demo1.entities.Trainer;
import com.example.demo1.service.TrainerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping(value = "/trainers")
public class TrainerController {


    private final TrainerService trainerService;

    @Autowired
    public TrainerController(TrainerService trainerService) {
        this.trainerService = trainerService;
    }


    @GetMapping(value = "/list")
    public String listTrainers(Model theModel) {
        List<Trainer> theTrainers = trainerService.findAll();
        theModel.addAttribute("trainers", theTrainers);
        return "trainers/list-trainers";
    }

    @PostMapping("/save")
    public String saveTrainer(@ModelAttribute("trainer") Trainer theTrainer) {
        trainerService.save(theTrainer);
        return "redirect:/trainers/list";
    }

    @GetMapping("/showFormForAdd")
    public String showFormForAdd(Model theModel) {
        Trainer theTrainer = new Trainer();
        theModel.addAttribute("trainer", theTrainer);
        return "trainers/trainer-form";
    }

    @GetMapping("/showFormForUpdate")
    public String showFormForUpdate(@RequestParam("trainerId") int id, Model theModel) {
        Trainer theTrainer = trainerService.findById(id);
        theModel.addAttribute("trainer", theTrainer);
        return "trainers/trainer-form";
    }

    @GetMapping("/delete")
    public String delete(@RequestParam("trainerId") int id) {
        trainerService.deleteById(id);
        return "redirect:/trainers/list";
    }
}
