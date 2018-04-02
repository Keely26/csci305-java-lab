package main.java;

import java.util.HashMap;
import java.util.Map;

public class Main {

    static final Map<String, Element> moves = new HashMap<>();

    public static void main(String args[]) {
        moves.put("Rock", new Rock("Paper"));
        moves.put("Rock", new Rock("Scissors"));
        moves.put("Rock", new Rock("Lizard"));
        moves.put("Rock", new Rock("Spock"));
        moves.put("Rock", new Rock("Rock"));

    }

}
