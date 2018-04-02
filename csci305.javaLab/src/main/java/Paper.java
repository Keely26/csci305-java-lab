package main.java;

public class Paper extends Element {
    public Paper(String element) {
        super(element);
    }

    @Override
    public Outcome compareTo(Element e) {
        Outcome outcome = null;

        switch (e.getName()){
            case "Rock":
                outcome = new Outcome("Paper covers Rock", "Win");
                break;

            case "Paper":
                outcome = new Outcome("Paper equals Paper", "Tie");
                break;

            case "Scissors":
                outcome = new Outcome("Scissors cut Paper", "Lose");
                break;

            case "Lizard":
                outcome = new Outcome("Lizard eats Paper", "Lose");
                break;

            case "Spock":
                outcome = new Outcome("Paper disproves Spock", "Win");
                break;

        }
        return outcome;
    }
}
