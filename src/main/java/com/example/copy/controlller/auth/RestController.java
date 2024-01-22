package com.example.copy.controlller.auth;

import com.example.copy.common.api.ApiResponse;
import com.example.copy.common.api.EmptyJsonResponse;
import com.example.copy.common.api.StatusCode;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

public abstract class RestController {

    public <T> ResponseEntity<ApiResponse<?>> buildResponse(HttpStatus status, T data, HttpHeaders headers) {

        ApiResponse<?> apiResponse = ApiResponse.builder()
                .status(StatusCode.SUCCESS)
                .data(data)
                .build();

        return ResponseEntity.ok().headers(headers).body(apiResponse);
    }

    public <T> ResponseEntity<ApiResponse<?>> ok(T data, HttpHeaders headers) {
        return buildResponse(HttpStatus.OK, data, headers);
    }

    public <T> ResponseEntity<ApiResponse<?>> buildResponse(HttpStatus status, T data) {
        return buildResponse(status, data, new HttpHeaders());
    }

    public <T> ResponseEntity<ApiResponse<?>> ok(T data) {
        return buildResponse(HttpStatus.OK, data);
    }

    public <T> ResponseEntity<ApiResponse<?>> buildResponse(HttpStatus status) {
        return buildResponse(status, new EmptyJsonResponse());
    }

    public <T> ResponseEntity<ApiResponse<?>> ok() {
        return buildResponse(HttpStatus.OK);
    }



}
