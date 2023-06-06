package com.mirian.StudentManagmentApp.exceptions;

public class StudentIdNotFoundException extends RuntimeException {
    public StudentIdNotFoundException(String message) {
        super(message);
    }

    public StudentIdNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }

    public StudentIdNotFoundException(Throwable cause) {
        super(cause);
    }
}
