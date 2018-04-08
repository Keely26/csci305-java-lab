package main.java;

public class StupidBot extends Player{

    public StupidBot(String name) {
        super(name);
    }

    @Override
    public Element play(Element move) {
        //return Rock every time
        return new Rock("Rock");
    }
}
