package com.file.updown.services;

public class FileEException extends RuntimeException {
    public FileEException(String message) {
        super(message);
    }

    public FileEException(String message, Throwable cause) {
        super(message, cause);
    }
}