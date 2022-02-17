package main.java.animals;

import main.java.food.Food;

public abstract class Animal {
    private int satiety =10;
    public int getSatiety() {
        return satiety;
    }

    public abstract void eat(Food food);


    public abstract String getVoice();

    public String swim() {
        return null;
    }

}
