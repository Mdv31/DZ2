package main.java;
import main.java.animals.Duck;
import main.java.animals.Tiger;
import main.java.employee.Worker;
import main.java.food.Grass;

public class Zoo {
    public static void main(String[] args) {
        Duck Donald = new Duck();
        Tiger Murka = new Tiger();
        Grass Trawa = new Grass();
        Worker Ivan = new Worker();

        Ivan.feed(Donald,Trawa);
        Ivan.getVoice(Donald);
        Ivan.getVoice(Murka);


    }
}
