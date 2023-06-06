package com.mirian.StudentManagmentApp.exceptions;

public class TeacherIdNotFoundException extends RuntimeException {

    public TeacherIdNotFoundException(String message) {
        super(message);
    }

    public TeacherIdNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }

    public TeacherIdNotFoundException(Throwable cause) {
        super(cause);
    }
}
