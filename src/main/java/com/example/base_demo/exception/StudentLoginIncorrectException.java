package com.example.base_demo.exception;

public class StudentLoginIncorrectException extends RuntimeException{
    private String message;

    public StudentLoginIncorrectException(String message){
        super(message);
    }
}
