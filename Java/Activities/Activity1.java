package activities;

public class Activity1 {

    public static void main(String[] args) {
        Car Honda = new Car();
        Honda.make=2013;
        Honda.color= "Blue";
        Honda.transmission="Manual";
        // Car class method
        Honda.displayCharacterstics();
        Honda.accelerate();
        Honda.brake();
    }

}