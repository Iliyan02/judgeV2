package com.softuni.model.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "users")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class User extends BaseEntity{
    @Column(nullable = false, unique = true)
    private String username;
    @Column(nullable = false, unique = true)
    private String password;
    @Column(nullable = false, unique = true)
    private String email;
    @Column
    private String git;
    @ManyToOne
    private Role role;
    @OneToMany(mappedBy = "author")
    private Set<Homework> homework;
    @OneToMany(mappedBy = "author")
    private Set<Comment> comments;
}
