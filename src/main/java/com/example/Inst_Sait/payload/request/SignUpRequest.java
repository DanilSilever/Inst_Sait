package com.example.Inst_Sait.payload.request;

import com.example.Inst_Sait.annotations.PasswordMatches;
import lombok.Data;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@Data
@PasswordMatches
public class SignUpRequest {
    @Email(message = "It should have email format")
    @NotBlank(message = "Email is required")
//    @ValidEmail
    private String email;

    @NotEmpty(message = "Enter your name")
    private String firstName;
    @NotEmpty(message = "Enter your lastName")
    private String lastName;
    @NotEmpty(message = "Enter your username")
    private String username;
    @NotEmpty(message = "password is required")
    @Size(min = 6)
    private String password;
    private String confirmPassword;
}
