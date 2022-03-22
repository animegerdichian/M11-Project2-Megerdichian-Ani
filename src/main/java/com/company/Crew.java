package com.company;

public class Crew extends Person{
    String department;


    public Crew(String name, double paid, double earned, String department) {
        super(name, paid, earned);
        this.department = department;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}
