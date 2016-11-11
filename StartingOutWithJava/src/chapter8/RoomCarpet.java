package chapter8;

public class RoomCarpet {
	
	// VARIABLES
	
	private RoomDimension size;
	private double carpetCost;

	// CONSTRUCTOR
	
	public RoomCarpet(){
		size = null;
		carpetCost = 0.0;
	}
	
	public RoomCarpet( RoomDimension dimension, double cost ){
		size = new RoomDimension( dimension.getLength(), dimension.getWidth() );
		carpetCost = cost;
	}
	
	// ACCESSORS 
	
	public RoomDimension getSize(){
		return size;
	}
	
	public double getCarpetCost(){
		return carpetCost;
	}
	
	// MUTATORS 
	
	public void setSize( RoomDimension dimension ){
		size = new RoomDimension( dimension.getLength(), dimension.getWidth() );
	}
	
	public void setCarpetCost( double cost ){
		carpetCost = cost;
	}
	
	// METHODS
	
	public double calcCost(){
		return carpetCost * size.calcArea();
	}
	
	// OUTPUT
	
	public String toString(){
		String message = "The size of the room is: " + size.calcArea();
			   message += "\nThe price per square foor is: " + carpetCost;
			   message += "\nThe tocal cost for the room: " + calcCost();
		return message;
	}
}
