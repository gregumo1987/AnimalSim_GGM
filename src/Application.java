import java.util.ArrayList;
import java.util.Arrays;


public class Application {


	
	public static void main(String[] args)  {
		// TODO Auto-generated method stub

	System.out.println("*********************************************\r\n"
			+ "\t\tLocation Tests\r\n"
			+ "*********************************************");
		
		Location L1=new Location();//initializing and instantiates new Location object with empty constructor
		L1.getCoordinates();
		
		System.out.print("Position Coordinates: "+Arrays.toString(L1.getCoordinates())+"\n");//printing integer Array in getCoordinate
		
			
		L1.update(2, 3);//testing update method 
		Location L3= new Location();//instantiating new location
		
	
		System.out.print("Position Coordinates: "+Arrays.toString(L1.getCoordinates())+"\n");//printing integer Array by using getCoordinate method
		
		System.out.println("*********************************************\r\n"
				+ "\t\tAnimal Tests\r\n"
				+ "*********************************************");
		
		
		//Animal Ani=new Animal(); 
		
Animal Bill=new Goldfinch();//testing empty Animal 
		
		

		System.out.print(Bill.eat());//testing/printing eating with a goldFinch animal
		
		
		System.out.println("\n"+Bill.sleep());//testing/printing sleep with a goldFinch animal
		

		
		//testing animal getters and setters
		
		
		Bill.setLocation(L3);
		
		System.out.println(Bill.getLocation());
		
		Bill.setSimID(3456);
		
		System.out.println(Bill.getSimID());///needs exception and logic
		
		Bill.setRested(false);
		
		System.out.println(Bill.isRested());
		
		Bill.setFull(true);
		
		System.out.println(Bill.isFull());
		
		System.out.println("*********************************************\r\n"
				+ "\t\tGoldfinch Tests\r\n"
				+ "*********************************************");
		Goldfinch Sam= new Goldfinch();//testing empty argument constructor for Goldfinch and toString 
		
		System.out.println(Sam.toString());
		
		try {
			Sam.setWingSpan(12);//testing upper bound limit to setWingSpan 
		
		
		Sam.setWingSpan(7);//testing valid wingSpan
		System.out.println(Sam.getWingSpan());//testing getWingSpan
		
		Location L5=new Location();
		
		Sam.fly(L5);//implementing fly method from Flyable interface
		System.out.println(Sam.toString());
		
	
		//implementing walk interface for Sam the Goldfinch 1: up,2: right,3:down,4: left
		
		Sam.walk(3);
		
		System.out.println(Sam.toString());//printing to see how Sam moves
		
		System.out.println("*********************************************\r\n"
				+ "\t\tBrownBear Tests\r\n"
				+ "*********************************************");
		
		BrownBear pooh=new BrownBear();//testing empty argument consructor for BrownBear
		System.out.println(pooh.toString());//testing toString method for BrownBear
		
pooh.setSubSpecies("Asiatic");//testing setSubSpecies with a valid BrownBear
		
		System.out.println(pooh.getSubSpecies());//testing getSubSpecies for pooh the BrownBear
		
		BrownBear Teddy=new BrownBear(9231,L1,"Kodiak");//instantiating a valid BrownBear object
		System.out.println(Teddy.toString());//printing Teddy attributes with toString method
		
		Teddy.swim(3);//implementing swim interface for Teddy should move two points down in y coordinate
		
		System.out.println(Teddy.toString());	
		
Teddy.walk(1);//Teddy the Brownbear walks up three points	
		
		System.out.println(Teddy.toString());
		
		System.out.println("*********************************************\r\n"
				+ "\t\tGenerics Tests\r\n"
				+ "*********************************************");
		
		ArrayList<Animal> arr=new ArrayList<Animal>();//instantiating Arraylist arr that can hold different Animal type
		
		arr.add(Teddy);//adding Teddy the BrownBear to arr the ArrayList
		arr.add(Sam);//adding Sam the GoldFinch to arr the ArrayList
		
		
		for (Animal eachanimal : arr) {//loop to print each animal/element with toString method
	            System.out.println(eachanimal.toString());
	        }
		
		}
	
