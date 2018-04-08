package main.java;

public class Spock extends Element {
    public Spock(String element) {
        super(element);
    }

    @Override
    public Outcome compareTo(Element e) {
        Outcome outcome = null;

        switch (e.getName()){
            case "Rock":
                outcome = new Outcome("Spock vaporizes Rock", "Spock Win");
                break;

            case "Paper":
                outcome = new Outcome("Paper disproves Spock", "Spock Lose");
                break;

            case "Scissors":
                outcome = new Outcome("Spock smashes Scissors", "Spock Win");
                break;

            case "Lizard":
                outcome = new Outcome("Lizard poisons Spock", "Spock Lose");
                break;

            case "Spock":
                outcome = new Outcome("Spock equals Spock", "Tie");
                break;

        }
        return outcome;
    }
}
