package activities;

public class Car {
    //variables
   String color;
   String transmission;
   int make;
   int tyres;
   int doors;
//Constructor
    Car ()
    {
        tyres=4;
        doors=4;
    }
// Methods
    public void displayCharacterstics () {
        System.out.println("Color of the Car is: " + color);
        System.out.println("Make of the Car is: " + make);
        System.out.println("Transmission  of the Car is :" + transmission );
        System.out.println("Number of doors for the Car are: " + doors);
        System.out.println("Number of tyres for the Car are: " + tyres);
    }
    public void accelerate(){
        System.out.println("Car is moving forward.");
            }
    public void brake(){
        System.out.println("Car has stopped.");
            }
}
