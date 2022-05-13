package com.example.demo.controller;

import com.example.demo.model.Circle;
import com.example.demo.repository.CircleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Circle")
public class CircleController {

    @Autowired
    CircleRepository circleRepository;

    @GetMapping
    List<Circle> getAll() {
        return circleRepository.findAll();
    }

    @PostMapping
    Circle create(@RequestBody Circle circle){
        return circleRepository.save(circle);
    }

    @DeleteMapping
    void deleteAll(){
        circleRepository.deleteAll();
    }
}
