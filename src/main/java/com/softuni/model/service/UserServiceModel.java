package com.softuni.model.service;

import com.softuni.model.entities.Role;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class UserServiceModel {
    private Long id;
    private String username;
    private String password;
    private String email;
    private String git;
    private Role role;
}
