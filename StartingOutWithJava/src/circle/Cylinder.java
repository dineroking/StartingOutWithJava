package circle;

public class Cylinder {
	
	// VARIABLES
	private double height;				// the height of the cylinder
	private Circle circle;				// a Circle object
	
	
	
	// CONSTRUCTORS
	
	/**
	 * Cylinder initializes the height and circle fields
	 * @param height - the height of the cylinder
	 * @param circle - the information about the circle
	 */
	public Cylinder( double height, Circle circle ){
		this.height = height;
		this.circle = new Circle( circle );
	}
	
	/**
	 * Cylinder initializes the Cylinder object's fields by calling the constructor with 2 parameters
	 * 			as a second parameter on the call, it passes a no argument constructor of the Circle class
	 * 			which sets the radius to 1
	 * @param height - the height of the cylinder
	 */
	public Cylinder( double height ){
		this( height, new Circle() );
	}
	
	/**
	 * Cylinder makes a copy of a Cylinder object
	 * @param cylinder - a Cylinder object
	 */
	public Cylinder( Cylinder cylinder ){
		height = cylinder.height;
		circle = new Circle( cylinder.circle );
	}
	
	
	
	// ACCESSORS
	
	/**
	 * getHeight returns the height of the cylinder
	 * @return the height of the circle
	 */
	public double getHeight(){
		return height;
	}
	
	/**
	 * getCircle returns a copy of the circle object
	 * @return a copy of the circle object
	 */
	public Circle getCircle(){
		return new Circle( circle );
	}
	
	
	
	// MUTATORS
	
	/**
	 * setHeight sets the height of the cylinder
	 * @param height - the height of the cylinder
	 */
	public void setHeight( double height ){
		this.height = height;
	}
	
	/**
	 * setCircle sets circle to a copy of the Circle object passed as an argument
	 * @param circle - a Circle object
	 */
	public void setCircle( Circle circle ){
		this.circle = new Circle( circle );
	}
	
	
	
	// METHODS
	
	/**
	 * copy doesn't take any arguments and it returns a copy of the Cylinder object by invoking the 2-argument
	 *      constructor
	 * @return a copy of the Cylinder object
	 */
	public Cylinder copy(){
		return new Cylinder( height, circle );
	}
	
	/**
	 * copy makes a copy of the Cylinder object by using the Constructor designed to copy
	 * @param cylinder - a Cylinder object
	 * @return the address of a new Cylinder object
	 */
	public Cylinder copy( Cylinder cylinder ){
		return new Cylinder( cylinder );
	}
	
	/**
	 * equals compares two Cylinder objects and return true if their values are the same or false if they are not
	 * @param cylinder2 - a Cylinder object
	 * @return true if the objects are the same or false if they are not
	 */
	public boolean equals( Cylinder cylinder2 ){
		
		// assumes the two objects are not the same and sets false to isEqual
		boolean isEqual = false;
		
		// compares the values of the two objects and if they are the same it assigns true to isEqual
		if( height == cylinder2.height && circle.equals( cylinder2.circle ) ){
			isEqual = true;
		}
		
		// returns isEqual
		return isEqual;
	}
	
	/**
	 * getArea calculates and returns the area of the cylinder
	 * @return the area of the cylinder
	 */
	public double getArea(){
		return (circle.getCircumference() * height) + (2 * circle.getArea());
	}
	
	
	
	// OUTPUT
	
	/**
	 * toString formats the message to be display to the user about the information of the cylinder
	 */
	public String toString(){
		String message = "";
		
			   // build the message to be displayed
			   message = "The radius of the cylinder is: " + circle.getRadius();
			   message += "\nThe circumference of the cylinder is: " + circle.getCircumference();
			   message += "\nThe height of the cylinder is: " + height;
			   message += "\nThe area of the cylinder is: " + this.getArea();
			   message += "\n\n----------------------------------------\n\n";			// create some space between each circle
			   
		// display the message
		return message;
	}

}
