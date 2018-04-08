package main.java;

import sun.awt.SunHints;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class IterativeBot extends Player {
    public IterativeBot(String name){
        super(name);
    }

    @Override
    public Element play(Element move) {
        if (move.getName() == "Rock") {
            return Main.moves.get("Paper");

        } else if (move.getName() == "Paper") {
             return Main.moves.get("Scissors");

        } else if (move.getName() == "Scissors") {
            return Main.moves.get("Lizard");

        } else if (move.getName() == "Lizard") {
            return Main.moves.get("Spock");

        } else { //(move.getName() == "Spock")
            return Main.moves.get("Rock");
        }
    }
}
