package main.java;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class Main {

    static final Map<String, Element> moves = new HashMap<>();

    public static void main(String args[]) {
        moves.put("Rock", new Rock("Paper"));
        moves.put("Rock", new Rock("Scissors"));
        moves.put("Rock", new Rock("Lizard"));
        moves.put("Rock", new Rock("Spock"));
        moves.put("Rock", new Rock("Rock"));


        Element rock = new Rock("Rock");
        Element paper = new Paper("Paper");
        System.out.println(rock.compareTo(paper));
        System.out.println(paper.compareTo(rock));
        System.out.println(rock.compareTo(rock));

        Player p1 = new StupidBot("StupidBot");
        Player p2 = new RandomBot("RandomBot");
        Element p1move = p1.play();
        Element p2move = p2.play();
        System.out.println("Stupid move: " + p1move.getName());
        System.out.println("Random move: " + p2move.getName());
        System.out.println(p1move.compareTo(p2move));


    }

}
