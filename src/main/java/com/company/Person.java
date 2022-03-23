package com.company;
// Person class is the parent class for the Actor and Crew classes
public class Person {
    private String name;
    protected double paid;
    protected double earned;

    public Person(String name, double paid, double earned) {
        this.name = name;
        this.paid = paid;
        this.earned = earned;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPaid() {
        return paid;
    }

    public void setPaid(double paid) {
        this.paid = paid;
    }

    public double getEarned() {
        return earned;
    }

    public void setEarned(double earned) {
        this.earned = earned;
    }

    // method called by the movie class to distribute payment to objects of classes
    // derived from the person class
    public double payday(){
        this.earned += this.paid; // pay the person the amount they should be paid
        this.paid = 0; // set paid to 0 as funds have been distributed
        return this.earned; // return amount the person earned
    }
}
