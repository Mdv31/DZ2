package main.java;

import main.java.animals.Animal;
import main.java.animals.Duck;
import main.java.employee.Worker;
import main.java.food.Grass;

public class Zoo {
    public static void main(String[] args) {
        Duck Donald = new Duck();
        Grass Trawa = new Grass();
        Worker Ivan = new Worker();

        Ivan.feed(Donald,Trawa);
        Ivan.getVoice(Donald);
    }
}
