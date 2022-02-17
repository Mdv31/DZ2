package main.java.animals;

public class Rabbit extends Herbivore implements Run,Voice {
    private int satiety ;

    private String voice;


    public Rabbit() {
        this.voice = "Piii - Piii!";
    }


    @Override
    public String getVoice() {
        return this.voice;
    }
    @Override
    public String run() {
        return "Я бегу!";
    }
}
