package com.dreamcoder.exceptionhandling.exception;

public class InvalidProductId extends RuntimeException{


    /**
     *
     */
    public InvalidProductId() {
        super();
    }

    /**
     * @param message
     */
    public InvalidProductId(String message) {
        super(message);
    }

    /**
     * @param message
     * @param cause
     */
    public InvalidProductId(String message, Throwable cause) {
        super(message, cause);
    }

    /**
     * @param cause
     */
    public InvalidProductId(Throwable cause) {
        super(cause);
    }

    /**
     * @param message
     * @param cause
     * @param enableSuppression
     * @param writableStackTrace
     */
    protected InvalidProductId(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
