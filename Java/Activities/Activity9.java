import java.util.ArrayList;

public class Activity9 {
	public static void main(String[] args) {
	 //declaring Arraylist of String objects
	ArrayList<String> myList = new ArrayList<String>();
	//Adding objects to Array List at default index
	myList.add("Mango");
	myList.add("Orange");
	myList.add("Cherry");
    
	//Adding object at specific index
	myList.add(3, "Grapes");
	myList.add(1, "Papaya");
	
	System.out.println("Print all the list: ");
	for (String s:myList) {
		System.out.println(s);
	}
	
	System.out.println("Enter 3rd name in the list: "+myList.get(2));
	System.out.println("Check wheather Chiku is present in the list ot not: "+myList.contains("chiku"));	
	System.out.println("Size of List: "+myList.size());
	System.out.println("Remove the any one fruit from List: "+myList.remove(2));
	System.out.println("Print all the list: "+myList);
	System.out.println("Size of List: "+myList.size());
	
	}
}
