package com.ua.service;

import com.ua.model.Person;

import java.util.List;
import java.util.Optional;

public interface PersonService {
    void save(Person person);

    List<Person> findAll();

    Optional<Person> findById(int id);

    void deleteById(int id);
}
