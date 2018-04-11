package csci305.javalab;

public class LastPlayBot extends Player {
    public LastPlayBot(String name) {
        super(name);
    }

    /*
        Returns a new Element that is of the same Element type as the
        Element passed as the parameter (the opponents previous move)
     */
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

        } else {//                                      if there is no Element (first move of game)
            return new Rock("Rock");//          return Element Rock
        }
    }
}
