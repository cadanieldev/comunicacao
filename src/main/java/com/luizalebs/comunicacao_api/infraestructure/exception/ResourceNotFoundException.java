package com.luizalebs.comunicacao_api.infraestructure.exception;

public class ResourceNotFoundException extends RuntimeException {
    public ResourceNotFoundException(String message) {
        super(message);
    }
    public ResourceNotFoundException(String message, Throwable throwable){
        super(message, throwable);
    }
}
