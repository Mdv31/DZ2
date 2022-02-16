package main.java.animals;


public class Duck extends Herbivore implements Fly, Run, Swim, Voice {
    private String voice;


    public Duck() {
        this.voice = "Krya - Krya!";
    }




    @Override
    public void getVoice() {
        System.out.println(this.voice);
    }



}
