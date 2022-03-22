package com.company;
import java.util.List;

public class Movie {
    String genre;
    Director director;
    List<Actor> actors;
    List<Crew> crew;
    double budget;
    double moneySpent;
    double moneyEarned;
    double profit;

    public Movie(String genre, Director director, List<Actor> actors, List<Crew> crew, double budget, double moneySpent, double moneyEarned, double profit) {
        this.genre = genre;
        this.director = director;
        this.actors = actors;
        this.crew = crew;
        this.budget = budget;
        this.moneySpent = moneySpent;
        this.moneyEarned = moneyEarned;
        this.profit = profit;
    }

    public void calculateProfit(){
        this.profit = this.moneyEarned - this.moneySpent + this.budget;
    }

    public void payday(){
        // pay actors
        this.moneySpent += this.payActors();

        // pay crew
        this.moneySpent += this.payCrew();

        // pay director
        this.moneySpent += this.director.payday();

        // calculate profit
        this.calculateProfit();

        // pay director royalties
        this.moneySpent += this.director.payday(this.profit);

        // update profit to account for director royalties
        this.calculateProfit();
    }

    // pay actors
    public double payActors(){
        double totalPaid = 0;
        for(Actor a : actors){
            totalPaid += a.payday();
        }
        return totalPaid;
    }

    // pay crew
    public double payCrew(){
        double totalPaid = 0;
        for(Crew c : crew){
            totalPaid += c.payday();
        }
        return totalPaid;
    }

}
