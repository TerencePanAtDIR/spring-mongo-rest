package com.example.terencepan.springsamples.springmongorest.exceptions;

public class DuplicateEmailException extends Exception{
    public DuplicateEmailException(String errorMessage, Throwable err) {
        super(errorMessage, err);
    }
}
