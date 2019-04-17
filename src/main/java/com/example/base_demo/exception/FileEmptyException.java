package com.example.base_demo.exception;

public class FileEmptyException extends RuntimeException {
    private String message;

    public FileEmptyException(String message){
        super(message);
    }
}
