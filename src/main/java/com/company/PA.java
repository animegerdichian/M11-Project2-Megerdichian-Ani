package com.company;

// should earn pay based on hours worked
public class PA extends Crew{
    private double hoursWorked;
    public PA(String name, double paid, double earned, String department, double hoursWorked) {
        super(name, paid, earned, department);
        this.hoursWorked = hoursWorked;
    }

    public double getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(double hoursWorked) {
        this.hoursWorked = hoursWorked;
    }
    @Override
    public double payday(){
        System.out.println("Calling PA payday method ...");
        this.earned += (this.paid * this.hoursWorked); // add total wages to earned
        this.hoursWorked = 0; // set hours worked to 0
        return this.earned; // return the amount the PA earned
    }
}
