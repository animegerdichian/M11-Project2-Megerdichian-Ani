package com.company;

public class Person {
    String name;
    double paid;
    double earned;

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

    public double payday(){
        this.earned += this.paid; // pay the person the amount they should be paid
        this.paid = 0; // set paid to 0 as funds have been distributed
        return this.earned; // return amount the person earned
    }
}
