package com.company;
// Actor class is derived from the Person class
// has a unique attribute of a role
public class Actor extends Person{
    private String role;

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
