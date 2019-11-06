package com.ua.controllers;

import com.ua.dao.PersonDAO;
import com.ua.model.Person;
import com.ua.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class PersonController {
    @Autowired
    PersonService personService;

    @GetMapping("/persons")
    public String persons(){
        return "persons";
    }

    @GetMapping("/person/{id}")
    public String person(@PathVariable int id, Model model){
        Person person = personService.findById(id).get();
        model.addAttribute("person", person);
        return "person";
    }

    @PostMapping("/person/create")
    public String save(
            @RequestParam String name,
            @RequestParam String surname
            ){
        Person person = Person.builder().name(name).surname(surname).build();
        personService.save(person);
        return "redirect:/";
    }

    @PostMapping("/person/delete/{id}")
    public String delete(@PathVariable int id){
        personService.deleteById(id);
        return "redirect:/";
    }
}
