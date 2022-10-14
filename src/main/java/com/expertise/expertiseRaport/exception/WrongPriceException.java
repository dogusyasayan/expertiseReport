package com.expertise.expertiseRaport.exception;

public class WrongPriceException extends RuntimeException{
    public WrongPriceException(){
        super("wrong price");
    }
}
