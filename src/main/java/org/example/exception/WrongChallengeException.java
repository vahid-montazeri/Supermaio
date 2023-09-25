package org.example.exception;

public class WrongChallengeException extends RuntimeException {

    public WrongChallengeException(String message) {
        super(message);
    }

}
