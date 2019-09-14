package main;

public class Horse {
	
	String maneColor = "";
	
	String furColor = "";
	
	String name = "";
	
	//					  0        1        2        3         4              5            6
	String[] colors = {"brown", "black", "grey", "white", "dark grey", "golden yellow", "blue"};
	
	
	public Horse( String name ) {
		
		this.name = name;
		this.setFurColor();
		
	}
	

	
	public void setManeColor(int index ) {
		
		String color = this.colors[index];
		
		System.out.println("The color at the index of " + index + " is " + color);
		
		this.maneColor = color;
		
	}
	
	private void setFurColor() {
		
		// make a random number
		int number =  (int) ( Math.random() * this.colors.length);
		
		String color = this.colors[number];
		
		this.furColor = color;
		
		
				
		
	}
	
	public void display() {
		
		System.out.println("Hello, I'm a horse.");
		System.out.println("My name is " + this.name + ".");
		System.out.println("The color of my mane is " + this.maneColor + ".");
		System.out.println("The color of my fur is " + this.furColor + ".");
	}

}
