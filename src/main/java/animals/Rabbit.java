package main.java.animals;

public class Rabbit extends Herbivore implements Run,Voice {
    private int satiety ;

    private String voice;


    public Rabbit() {
        this.voice = "Piii - Piii!";
    }


    @Override
    public void getVoice() {
        System.out.println(this.voice);
    }
}
