package com.example.copy.common.api;

public enum StatusCode {

    SUCCESS(200, "Success");

    private final String message;

    private final int code;

    StatusCode(final int code, final String message) {
        this.message = message;
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public int getCode() {
        return code;
    }
}
