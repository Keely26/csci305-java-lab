package main.java;

public class Lizard extends Element {
    public Lizard(String element) {
        super(element);
    }

    @Override
    public Outcome compareTo(Element e) {
        Outcome outcome = null;

        switch (e.getName()){
            case "Rock":
                outcome = new Outcome("Rock crushes Lizard", "Lose");
                break;

            case "Paper":
                outcome = new Outcome("Lizard eats Paper", "Win");
                break;

            case "Scissors":
                outcome = new Outcome("Scissors decapitate Lizard", "Lose");
                break;

            case "Lizard":
                outcome = new Outcome("Lizard equals Lizard", "Tie");
                break;

            case "Spock":
                outcome = new Outcome("Lizard poisons Spock", "Win");
                break;

        }
        return outcome;
    }
}
