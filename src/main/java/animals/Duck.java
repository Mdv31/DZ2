package main.java.animals;


import main.java.food.Food;

public class Duck extends Herbivore implements Fly, Run, Swim, Voice {
    private String voice;


    public Duck() {
        this.voice = "Krya - Krya!";
    }

    @Override
    public void eat(Food food) {
        System.out.println("Животное съело "+food);
    }

    @Override
    public void getVoice() {
        System.out.println(this.voice);
    }


}
