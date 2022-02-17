package main.java.employee;
import main.java.animals.Animal;
import main.java.food.Food;


public class Worker {
    public void feed(Animal animal, Food food) {
        System.out.println("\nРабочий дал корм");
        animal.eat(food);

    }

    public void getVoice(Animal animal) {
        System.out.println("\nРабочий запросил голос");
        System.out.println(animal.getVoice());

    }
}
