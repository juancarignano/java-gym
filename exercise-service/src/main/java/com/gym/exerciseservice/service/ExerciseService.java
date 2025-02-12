package com.gym.exerciseservice.service;

import com.gym.exerciseservice.model.Exercise;
import com.gym.exerciseservice.repository.ExerciseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ExerciseService {

    @Autowired
    private ExerciseRepository exerciseRepository;

    public Exercise createExercise(Exercise exercise) {
        return exerciseRepository.save(exercise);
    }
}