package main.java.animals;

import main.java.food.Food;

public class Tiger extends Carnivorous implements Fly, Run, Swim, Voice {

    private String voice;


    public Tiger() {
        this.voice = "Mrrrr - Mrrrr!";
    }


    @Override
    public void getVoice() {
        System.out.println(this.voice);
    }



}
