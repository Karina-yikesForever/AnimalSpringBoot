package com.example.AnimalSpringBoot.service;

import com.example.AnimalSpringBoot.entity.Animal;
import com.example.AnimalSpringBoot.repository.AnimalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AnimalServiceImpl implements AnimalService {
    @Autowired
    private AnimalRepository animalRepository;

    @Override
    public List<Animal> getAllAnimals() {
        return animalRepository.findAll();
    }

    @Override
    public Animal getById(Long id) {
        Optional<Animal> animal = animalRepository.findById(id);
        return animal.orElse(new Animal());
    }

    @Override
    public Animal add(Animal animal) {
        return animalRepository.save(animal);
    }

    @Override
    public void deleteById(Long id) {
        animalRepository.deleteById(id);
    }

    @Override
    public Animal update(Animal animal) {
        return null;
    }

}
