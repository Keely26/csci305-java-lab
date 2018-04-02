package main.java;

public abstract class Player {
    private String name;

    public Player(String name){
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public abstract Element play();
}
