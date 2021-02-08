package com.softuni.model.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "roles")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Role extends BaseEntity{
    @Enumerated(EnumType.STRING)
    private RoleNameEnum name;
    @OneToMany(mappedBy = "role")
    private Set<User> users;

    public Role(RoleNameEnum name) {
        this.name = name;
    }
}
