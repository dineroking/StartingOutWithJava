package chapter8;

public class RoomDimension {
	
	// VARIABLES
	
	private double length;
	private double width;
	
	// CONSTRUCTOR
	
	public RoomDimension(){
		length = 0.0;
		width = 0.0;
	}
	
	public RoomDimension( double length, double width ){
		this.length = length;
		this.width = width;
	}
	
	// ACCESSORS
	
	public double getLength(){
		return length;
	}
	
	public double getWidth(){
		return width;
	}
	
	// MUTATORS
	
	public void setLength( double length ){
		this.length = length;
	}
	
	public void setWidth( double width ){
		this.width = width;
	}
	
	// METHODS
	
	public double calcArea(){
		return length * width;
	}
	
	// OUTPUT
	
	public String toString(){
		String message = "The length of the room is: " + length;
			   message += "\nThe width of the room is: " + width;
			   message += "\nThe area of the room is: " + calcArea();
		return message;
	}

}
