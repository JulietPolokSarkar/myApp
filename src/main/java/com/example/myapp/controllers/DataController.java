package com.example.myapp.controllers;

import com.example.myapp.models.Person;
import com.example.myapp.repositories.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/data")
public class DataController {
    @Autowired
    private PersonRepository personRepository;

    @GetMapping("/input")
    public String showInputForm(Model model) {
        model.addAttribute("person", new Person());
        return "input";
    }

    @PostMapping("/input")
    public String saveData(@ModelAttribute Person person) {
        personRepository.save(person);
        return "redirect:/data/input";
    }

    @GetMapping("/retrieval")
    public String showRetrievalForm(Model model) {
        model.addAttribute("persons", personRepository.findAll());
        return "retrieval";
    }
}

