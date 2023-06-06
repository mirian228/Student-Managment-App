package com.mirian.StudentManagmentApp.exceptions;

public class PrincipalIdNotFoundException extends RuntimeException {
    public PrincipalIdNotFoundException(String message) {
        super(message);
    }

    public PrincipalIdNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }

    public PrincipalIdNotFoundException(Throwable cause) {
        super(cause);
    }
}
