package com.gym.exerciseservice.repository;

import com.gym.exerciseservice.model.Exercise;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ExerciseRepository extends MongoRepository<Exercise, String> {
}