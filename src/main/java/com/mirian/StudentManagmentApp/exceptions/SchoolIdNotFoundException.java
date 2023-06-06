package com.mirian.StudentManagmentApp.exceptions;

public class SchoolIdNotFoundException extends RuntimeException {

    public SchoolIdNotFoundException(String message) {
        super(message);
    }

    public SchoolIdNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }

    public SchoolIdNotFoundException(Throwable cause) {
        super(cause);
    }
}
