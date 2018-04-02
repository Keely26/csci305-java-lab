package main.java;

public class Scissors extends Element {

    public Scissors(String element) {
        super(element);
    }

    @Override
    public Outcome compareTo(Element e) {
        Outcome outcome = null;

        switch (e.getName()){
            case "Rock":
                outcome = new Outcome("Rock crushes Scissors", "Lose");
                break;

            case "Paper":
                outcome = new Outcome("Scissors cut Paper", "Win");
                break;

            case "Scissors":
                outcome = new Outcome("Scissors equals Scissors", "Tie");
                break;

            case "Lizard":
                outcome = new Outcome("Scissors decapitate Lizard", "Win");
                break;

            case "Spock":
                outcome = new Outcome("Spock smashes Scissors", "Lose");
                break;

        }
        return outcome;
    }
}
