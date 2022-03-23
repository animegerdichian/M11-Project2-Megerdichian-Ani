package com.company;
// PA class is derived from the Crew class
// has a unique attribute of hoursWorked
// should earn pay based on hours worked, and so overrides the Person class' payday() method
// to calculate pay earned based on an hourly wage
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
        this.earned += (this.paid * this.hoursWorked); // add total wages to earned
        this.hoursWorked = 0; // set hours worked to 0
        return this.earned; // return the amount the PA earned
    }
}
