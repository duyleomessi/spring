package com.javatpoint.constructor_injection;

public class User {
    private int id;
    private String username;
    private String email;

    public User() {}

    public User(int id, String username, String email) {
        this.id = id;
        this.username = username;
        this.email = email;
    }

    public void displayInfo() {
        System.out.println("Id: " + id + " name: " + username + " email: " + email);
    }
}
