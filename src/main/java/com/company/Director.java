package com.company;

//should earn a 1% royalty based on Movie profits
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

}
