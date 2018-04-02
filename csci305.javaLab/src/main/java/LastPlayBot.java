package main.java;

public class LastPlayBot extends Player {
    public LastPlayBot(String name) {
        super(name);
    }

    @Override
    public Element play() {
        //will always play the move that the opponent played on the previous move
        //For this Player's first move, you may arbitrarily pick any move.
        return null;
    }
}
