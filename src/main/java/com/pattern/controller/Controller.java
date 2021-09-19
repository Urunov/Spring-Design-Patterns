package com.pattern.controller;

@org.springframework.stereotype.Controller
public class Controller {

    private String name;
    private String lastName;
    private String email;

    public Controller(String name) {
        this.name = name;
    }
}
