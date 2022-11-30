package com.example.Inst_Sait.payload.response;

public class InvalidLoginResponse {

    private String username;
    private String password;

    public invalidLoginResponce(){
        this.username = "Invalid Username";
        this.password = "Invalid Password";
    }
}
