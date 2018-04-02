package main.java;

public class StupidBot extends Player{

    public StupidBot(String name) {
        super(name);
    }

    @Override
    public Element play() {
        //return Rock every time
        return new Rock("Rock");
    }
}
