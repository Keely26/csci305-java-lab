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
                outcome = new Outcome("Rock crushes Lizard", "Lizard Lose");
                break;

            case "Paper":
                outcome = new Outcome("Lizard eats Paper", "Lizard Win");
                break;

            case "Scissors":
                outcome = new Outcome("Scissors decapitate Lizard", "Lizard Lose");
                break;

            case "Lizard":
                outcome = new Outcome("Lizard equals Lizard", "Lizard Tie");
                break;

            case "Spock":
                outcome = new Outcome("Lizard poisons Spock", "Lizard Win");
                break;

        }
        return outcome;
    }
}
