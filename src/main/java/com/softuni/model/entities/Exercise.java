package com.softuni.model.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.time.LocalDateTime;
import java.util.Set;

@Entity
@Table(name = "exercises")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Exercise extends BaseEntity {
    private String name;
    @Column(name = "started_on")
    private LocalDateTime startedOn;
    @Column(name = "due_date")
    private LocalDateTime dueDate;
    @OneToMany(mappedBy = "exercise")
    private Set<Homework> homework;

}
