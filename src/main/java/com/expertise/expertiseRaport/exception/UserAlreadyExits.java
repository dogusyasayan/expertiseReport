package com.expertise.expertiseRaport.exception;

public class UserAlreadyExits extends RuntimeException{

    public  UserAlreadyExits (){
        super("User already exits!");
    }
}
