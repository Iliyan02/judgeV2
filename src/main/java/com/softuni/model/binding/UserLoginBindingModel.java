package com.softuni.model.binding;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.validator.constraints.Length;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class UserLoginBindingModel {
    @Length(min = 2, message = "Username must be minimum two characters")
    private String username;
    @Length(min = 3, message = "Password must be minimum two characters")
    private String password;
}
