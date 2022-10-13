package com.expertise.expertiseRaport.exception;

public class UserNameAndPasswordCantBeNull extends RuntimeException {

    public  UserNameAndPasswordCantBeNull(){
        super("Username or password not found!");
    }
}
