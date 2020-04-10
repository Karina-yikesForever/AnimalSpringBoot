package com.example.AnimalSpringBoot.service;

import com.example.AnimalSpringBoot.entity.Animal;

import java.util.List;

public interface AnimalService {
    List<Animal> getAllAnimals();

    Animal getById(Long id);

    Animal add(Animal animal);

    void deleteById(Long id);

    Animal update(Animal animal);
}