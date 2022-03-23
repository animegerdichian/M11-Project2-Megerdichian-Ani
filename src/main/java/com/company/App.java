package com.company;
import java.util.List;
import java.util.ArrayList;
public class App {
    public static void main(String[] args){

        // create list of actors
        // the amount each actor should be paid is specified, but they have not yet
        // earned that amount
        List<Actor> actors = new ArrayList<Actor>();
        actors.add(new Actor("Sue Chen",75000,0,"Lead #1"));
        actors.add(new Actor("Ali Chipkwa",75000,0,"Lead #2"));
        actors.add(new Actor("Kyle Kimwagi",75000,0,"Co-lead #1"));
        actors.add(new Actor("Sara Toledo",75000,0,"Co-lead #2"));
        actors.add(new Actor("Joseph Esperanza",75000,0,"Co-lead #3"));
        actors.add(new Actor("Erin Johnson",75000,0,"Co-lead #4"));
        actors.add(new Actor("Summer Philips",50000,0,"Extra #1"));
        actors.add(new Actor("Vera Monroe",50000,0,"Extra #2"));
        actors.add(new Actor("Kenan Swan",50000,0,"Extra #3"));
        actors.add(new Actor("Eli Sachar",50000,0,"Extra #4"));

        // Create list of crew
        // the amount each crew member should be paid is specified, but they have not yet
        // earned that amount
        List<Crew> crew = new ArrayList<Crew>();
        crew.add(new PA("Harriet Jacobsen",75, 0, "Design",992));
        crew.add(new PA("David Mesic",75, 0, "Editing",800));
        crew.add(new PA("Kira Tevi",75, 0, "Film Production",1100));
        crew.add(new Crew("Jenny Hendrick", 65000, 0, "Writing"));
        crew.add(new Crew("Sam Tovel", 65000, 0, "Writing"));
        crew.add(new Crew("Kyle Curry", 65000, 0, "Writing"));
        crew.add(new Crew("Parker Dahl", 65000, 0, "Design"));
        crew.add(new Crew("Lily Sanders", 65000, 0, "Design"));
        crew.add(new Crew("Harry Parker", 65000, 0, "Film Production"));
        crew.add(new Crew("Tanner Lu", 65000, 0, "Film Production"));
        crew.add(new Crew("Jose Torres", 65000, 0, "Film Production"));
        crew.add(new Crew("Sandra Robinson", 65000, 0, "Film Production"));
        crew.add(new Crew("Lisa Pak", 65000, 0, "Editing"));
        crew.add(new Crew("Mary Gonzales", 65000, 0, "Editing"));
        crew.add(new Crew("Tony Day", 65000, 0, "Editing"));

        // create a director
        Director director = new Director("Johanna Avi", 100000, 0, "Film Production",0);

        Movie movie = new Movie("Horror", director, actors, crew, 1000000, 0, 30000000, 0);

        movie.payday();

        generateReport(movie.getActors(), movie.getCrew());



    }

    public static void generateReport(List<Actor> actors, List<Crew> crew){
        System.out.format("%37s \n", "ACTOR EARNINGS");
        System.out.format("%23s%18s \n", "NAME", "EARNINGS");
        for(Actor a : actors){
            System.out.format("%25s%8s%.2f \n", a.getName()," ", a.getEarned());

        }
        System.out.format("%37s \n", "CREW EARNINGS");
        System.out.format("%23s%18s \n", "NAME", "EARNINGS");
        for(Crew c : crew){
            System.out.format("%25s%8s%.2f \n", c.getName()," ", c.getEarned());
        }

    }
}
