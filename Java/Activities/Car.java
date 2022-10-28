
public class Car {
	String sColor;
	String sTransmission;
	int iMake;
	int iTyres;
	int iDoors;
	
	Car()
	{
		iTyres=4;
		iDoors=4;
	}
	
	public void displayCharacteristics() 
	{
		System.out.println("Color of car is :- "+sColor);
		System.out.println("Transmission of car :- "+sTransmission);
		System.out.println("Make of car :- "+iMake);
		System.out.println("Tyres of car :- "+iTyres);
		System.out.println("Doors of car :- "+iDoors);
		
	}
	public void accelarate() 
	{
		System.out.println("Car is moving forward.");
	}
	public void brake() 
	{
		System.out.println("Car has stopped.");
		
	}

}
