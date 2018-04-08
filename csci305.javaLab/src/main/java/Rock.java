package main.java;

public class Rock extends Element {
    public Rock(String element) {
        super(element);
    }

    @Override
    public Outcome compareTo(Element e) {
        Outcome outcome = null;

        switch (e.getName()){
            case "Rock":
                outcome = new Outcome("Rock equals Rock", "Rock Tie");
                break;

            case "Paper":
                outcome = new Outcome("Paper covers Rock", "Rock Lose");
                break;

            case "Scissors":
                outcome = new Outcome("Rock crushes Scissors", "Rock Win");
                break;

            case "Lizard":
                outcome = new Outcome("Rock crushes Lizard", "Rock Win");
                break;

            case "Spock":
                outcome = new Outcome("Spock vaporizes Rock", "Rock Lose");
                break;

        }
        return outcome;
    }

}
