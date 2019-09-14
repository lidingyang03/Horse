package main;

public class Cat {
	
	String name = "";
	
	String primaryFurColor = "";
	String secondaryFurColor = "";
	
	boolean hasSpots = false;
	boolean hasStripes = false;
	
	
	//					  0        1        2        3         4              5            6
	String[] colors = {"brown", "black", "grey", "white", "dark grey", "golden yellow", "blue"};
	
	public Cat (String name) {
		 
		this.name = name;
		
		this.setColors();
		
		this.hasSpots = Math.random() > 0.5;
		this.hasStripes = Math.random() > 0.5;
	
	}
	
	@Override
	public String toString() {
		return "Cat -> name: " + this.name + " has " + this.primaryFurColor + " and " + this.secondaryFurColor 
				+ " fur. \n It is " + this.hasSpots + " that he has spots \n" + 
				"It is " + this.hasStripes + " that he has stripes.";
				
				
	}
	
	private void setColors() {
		
		
		int number =  (int) ( Math.random() * this.colors.length);
		
		String color = this.colors[number];
		
		this.primaryFurColor = color;
		
		int number2 =  (int) ( Math.random() * this.colors.length);
		
		String color2 = this.colors[number2];
		
		this.secondaryFurColor = color2;
		
		
		
		
	}


}
