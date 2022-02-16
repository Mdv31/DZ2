package main.java.animals;

import main.java.food.Food;
import main.java.food.Meat;

public abstract class Carnivorous extends Animal{

    @Override
    public void eat(Food food) {
        if (food instanceof Meat) {
            System.out.println("Хищники еддят мясо");
        }
        else System.out.println("Хищники не едят траву");

    }
}