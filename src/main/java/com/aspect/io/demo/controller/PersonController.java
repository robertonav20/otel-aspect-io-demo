package com.aspect.io.demo.controller;

import java.util.Collections;
import java.util.Set;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.aspect.io.demo.model.Person;

@RestController
public class PersonController {

    @GetMapping("persons")
    public ResponseEntity<Set<Person>> getPersons() {
        return ResponseEntity.ok(Collections.singleton(new Person("NAME", "LASTNAME")));
    }
}