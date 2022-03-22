package com.company;
import java.util.List;

public class Movie {
    private String genre;
    private Director director;
    private List<Actor> actors;
    private List<Crew> crew;
    private double budget;
    private double moneySpent;
    private double moneyEarned;
    private double profit;

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

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public Director getDirector() {
        return director;
    }

    public void setDirector(Director director) {
        this.director = director;
    }

    public List<Actor> getActors() {
        return actors;
    }

    public void setActors(List<Actor> actors) {
        this.actors = actors;
    }

    public List<Crew> getCrew() {
        return crew;
    }

    public void setCrew(List<Crew> crew) {
        this.crew = crew;
    }

    public double getBudget() {
        return budget;
    }

    public void setBudget(double budget) {
        this.budget = budget;
    }

    public double getMoneySpent() {
        return moneySpent;
    }

    public void setMoneySpent(double moneySpent) {
        this.moneySpent = moneySpent;
    }

    public double getMoneyEarned() {
        return moneyEarned;
    }

    public void setMoneyEarned(double moneyEarned) {
        this.moneyEarned = moneyEarned;
    }

    public double getProfit() {
        return profit;
    }

    public void setProfit(double profit) {
        this.profit = profit;
    }
}
