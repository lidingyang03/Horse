package main;

public class Game {

	public static void main(String[] args) {
		
		System.out.println(" ******* Welcome to the Town ********");
		
		System.out.println(" \n ... This town needs some animals");
		
		Horse horse0 = new Horse("Bob");
		
		horse0.setManeColor(6);
		
		horse0.display();
		
		Cat cat0 = new Cat("Socks");
		
		System.out.println(cat0);
		

	}

}
