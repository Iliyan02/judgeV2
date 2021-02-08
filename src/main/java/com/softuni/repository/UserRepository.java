package com.softuni.repository;

import com.softuni.model.entities.Role;
import com.softuni.model.entities.RoleNameEnum;
import com.softuni.model.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByUsernameAndPassword(String username, String password);
}
