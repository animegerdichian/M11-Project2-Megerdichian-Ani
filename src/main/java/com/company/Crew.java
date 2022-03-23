package com.company;
// Crew class is derived from the Person class
// has a unique attribute of a department
public class Crew extends Person{
    private String department;


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
