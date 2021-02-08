package com.softuni.model.service;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ExerciseServiceModel {

    private Long id;
    private String name;
    private LocalDateTime startedOn;
    private LocalDateTime dueDate;
}
