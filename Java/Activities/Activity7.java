package activities;
interface BicycleParts {
    public int gears = 0;
    public int currentSpeed = 0;
}
interface BicycleOperations {
    public void applyBrake(int decrement);
    public void speedUp(int increment);
}
class Bicycle implements BicycleParts, BicycleOperations {
    public int gears;
    public int currentSpeed;

    //one constructor
    public Bicycle(int gears, int currentSpeed) {
        this.gears = gears;
        this.currentSpeed = currentSpeed;
    }
    //three methods
    public void applyBrake(int decrement) {
        currentSpeed -= decrement;
        System.out.println("Current speed: " + currentSpeed);
    }

    public void speedUp(int increment) {
        currentSpeed += increment;
        System.out.println("Current speed: " + currentSpeed);
    }

    //Method to print
    public String bicycleDesc() {
        return("No of gears are "+ gears + "\nSpeed of bicycle is " + currentSpeed);
    }
}

//Derived class
class MountainBike extends Bicycle {

    //The MountainBike subclass adds one more field
    public int seatHeight;

    //The MountainBike subclass has one constructor
    public MountainBike(int gears, int currentSpeed, int startHeight) {
        //Invoking base-class(Bicycle) constructor
        super(gears, currentSpeed);
        seatHeight = startHeight;
    }

    // the MountainBike subclass adds one more method
    public void setHeight(int newValue) {
        seatHeight = newValue;
    }

    public String bicycleDesc() {
        return (super.bicycleDesc()+ "\nSeat height is " + seatHeight);
    }
}

//Driver class
public class Activity7 {
    public static void main(String args[]) {
        MountainBike mb = new MountainBike(3, 0, 25);
        System.out.println(mb.bicycleDesc());
        mb.speedUp(20);
        mb.applyBrake(5);
    }
}
