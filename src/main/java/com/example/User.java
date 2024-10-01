package com.example;

public class User {
    String name;
    User left, right;

    public User(String name) {
        this.name = name;
        left = right = null;
    }  
}
