package main.java;
import main.java.animals.Duck;
import main.java.animals.Tiger;
import main.java.employee.Worker;
import main.java.food.Grass;
import main.java.food.Meat;

public class Zoo {
    public static void main(String[] args) {
        Duck Donald = new Duck();
        Tiger Murka = new Tiger();
        Grass Trawa = new Grass();
        Meat Kolbasa = new Meat();
        Worker Ivan = new Worker();


        Ivan.getVoice(Donald);
        Ivan.feed(Donald,Trawa);
        Ivan.feed(Donald,Kolbasa);
        Ivan.getVoice(Murka);
        Ivan.feed(Murka,Trawa);
        Ivan.feed(Murka,Kolbasa);


    }
}
