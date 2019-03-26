package com.example.employee;

import lombok.Builder;

import java.util.List;


@lombok.Data
@Builder
public class Response {
    int code;
    List<String> messages;
    List<String> warnings;
    List<String> errors;
    String data;
}