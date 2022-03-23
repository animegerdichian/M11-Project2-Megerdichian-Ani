package com.company;
// Director class is dervied from the Crew class
// unique attribute is royalties
//should earn a 1% royalty based on Movie profits, therefore overloads Person class'
// payday() method to add royalties to its overall money earned
public class Director extends Crew{
    private double royalties;
    public Director(String name, double paid, double earned, String department, double royalties) {
        super(name, paid, earned, department);
    }

    public double payday(double profit){
        this.royalties = (profit * 0.01);
        this.earned += this.royalties;
        return this.earned;
    }

    public double getRoyalties() {
        return royalties;
    }

    public void setRoyalties(double royalties) {
        this.royalties = royalties;
    }
}
