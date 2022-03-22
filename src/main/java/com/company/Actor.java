package com.company;

public class Actor extends Person{
    String role;

    public Actor(String name, float paid, float earned, String role) {
        super(name, paid, earned);
        this.role = role;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}
