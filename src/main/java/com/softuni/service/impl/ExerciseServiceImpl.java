package com.softuni.service.impl;

import com.softuni.model.entities.Exercise;
import com.softuni.model.service.ExerciseServiceModel;
import com.softuni.repository.ExercisesRepository;
import com.softuni.service.ExerciseService;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
public class ExerciseServiceImpl implements ExerciseService {

    private final ExercisesRepository exercisesRepository;
    private final ModelMapper modelMapper;

    public ExerciseServiceImpl(ExercisesRepository exercisesRepository, ModelMapper modelMapper) {
        this.exercisesRepository = exercisesRepository;
        this.modelMapper = modelMapper;
    }

    @Override
    public void addExercise(ExerciseServiceModel exerciseServiceModel) {
        exercisesRepository.save(modelMapper.map(exerciseServiceModel, Exercise.class));
    }
}
