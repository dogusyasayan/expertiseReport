package com.expertise.expertiseRaport.exception;

public class LoginCantFound extends RuntimeException{
    public LoginCantFound(){
        super("Login cant be found");
    }
}

