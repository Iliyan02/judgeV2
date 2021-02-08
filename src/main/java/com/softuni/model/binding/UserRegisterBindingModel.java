package com.softuni.model.binding;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.Email;
import javax.validation.constraints.Pattern;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class UserRegisterBindingModel {
    @Length(min = 2, message = "Username must be minimum two characters")
    private String username;
    @Length(min = 2, message = "Password must be minimum three characters")
    private String password;

    private String confirmPassword;
    @Email(message = "Enter valid email")
    private String email;
    @Pattern(regexp = "https:\\/\\/github\\.com\\/.+", message = "Enter valid git address")
    private String git;
}
