package com.ua.controllers;

import com.ua.model.Person;
import com.ua.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class MainController {
    @Autowired
    PersonService personService;

    @GetMapping("/")
    public String intitPage(Model model){

        List<Person> people = personService.findAll();
        model.addAttribute("people", people);
        return "main";
    }
}
