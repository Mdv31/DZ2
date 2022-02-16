package main.java.animals;

import main.java.food.Food;

public abstract class Animal {
    private int satiety ;
    public int getSatiety() {
        return satiety;
    }

    abstract void eat(Food food);

    public class Herbivore extends Animal{
        @Override
        void eat(Food food) {
            return;
            //if(food Instanceof Grass) //

        }
    }
    public class Carnivorous extends Animal{
        @Override
        void eat(Food food) {

        }
    }
}
