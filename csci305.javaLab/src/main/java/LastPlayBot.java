package main.java;

public class LastPlayBot extends Player {
    public LastPlayBot(String name) {
        super(name);
    }

    @Override
    public Element play(Element move) {
        if (move.getName() == "Rock") {
            return new Rock("Rock");

        } else if (move.getName() == "Paper") {
            return new Paper("Paper");

        } else if (move.getName() == "Scissors") {
            return new Scissors("Scissors");

        } else if (move.getName() == "Lizard") {
            return new Lizard("Lizard");

        } else if (move.getName() == "Spock") {
            return new Spock("Spock");

        } else {
            return new Rock("Rock");
        }
    }
}
