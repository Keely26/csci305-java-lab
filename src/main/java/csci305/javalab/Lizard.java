package csci305.javalab;

public class Lizard extends Element {
    public Lizard(String element) {
        super(element);
    }

    /*
        Returns the Outcome of the Element Lizard vs _______
     */
    @Override
    public Outcome compareTo(Element e) {
        Outcome outcome = null;

        switch (e.getName()){
            case "Rock"://                                                                          Lizard vs Rock
                outcome = new Outcome("Rock crushes Lizard", "Lizard Lose");
                break;

            case "Paper"://                                                                         Lizard vs Paper
                outcome = new Outcome("Lizard eats Paper", "Lizard Win");
                break;

            case "Scissors"://                                                                      Lizard vs Scissors
                outcome = new Outcome("Scissors decapitate Lizard", "Lizard Lose");
                break;

            case "Lizard"://                                                                        Lizard vs Lizard
                outcome = new Outcome("Lizard equals Lizard", "Lizard Tie");
                break;

            case "Spock"://                                                                         Lizard vs Spock
                outcome = new Outcome("Lizard poisons Spock", "Lizard Win");
                break;

        }
        return outcome;
    }
}
