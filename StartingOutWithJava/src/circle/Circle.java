/*
 * Ronny Rosabal
 * Programming Fundamentals II
 * COSC 1337 2001
 * 11.5.16
 * Establishes the blueprint for creating a circle
 */
package circle;

public class Circle {

	// VARIABLES
	private final double PI = Math.PI;				// the value of pi 3.1415926....
	private double radius;							// the radius of a circle
	
	
	// CONSTRUCTORS
	
	/**
	 * Circle initializes the radius field to 1 if no argument is given.
	 */
	public Circle(){
		radius = 1;
	}
	
	/**
	 * Circle takes a double parameter and it checks that the input is more than 1 
	 * if so it initializes radius to the parameter otherwise it initializes radius to 1
	 * @param r - the radius of a circle as a double
	 */
	public Circle( double r ){
		if( r > 1 ){
			radius = r;
		}else{
			radius = 1;
		}
	}
	
	/**
	 * Circle takes a string as a parameter. It converts it to a double before checking if its
	 * greater than 1 if so it initializes radius to the parameter otherwise it initializes
	 * radius to 1
	 * @param r - the radius of a circle as a String
	 */
	public Circle( String r ){
		double input = Double.parseDouble(r);				// the parameter converted to a double
		if( input > 1 ){
			radius = input;
		}else{
			radius = 1;
		}
	}
	
	/**
	 * Circle makes a copy of the circle object and assigns it to the radius.
	 * @param circle - a Circle object
	 */
	public Circle( Circle circle ){
		this.radius = circle.getRadius();
	}
	
	
	// ACCESSORS
	
	/**
	 * getRadius returns the value of the radius field
	 * @return - the radius field
	 */
	public double getRadius(){
		return radius;
	}
	
	
	// MUTATORS
	
	/**
	 * setRadius takes a double parameter and it checks that the input is more than 1 
	 * if so it sets radius to the parameter otherwise it sets radius to 1
	 * @param r - the radius of a circle as a double
	 */
	public void setRadius( double r ){
		if( r > 1 ){
			radius = r;
		}else{
			radius = 1;
		}
	}
	
	/**
	 * setRadius takes a string as a parameter. It converts it to a double before checking if its
	 * greater than 1 if so it sets radius to the parameter otherwise it sets radius to 1
	 * @param r - the radius of a circle as a String
	 */
	public void setRadius( String r ){
		double input = Double.parseDouble(r);
		if( input > 1 ){
			radius = input;
		}else{
			radius = 1;
		}
	}
	
	
	// METHODS
	
	/**
	 * getDiameter calculates and return the diameter of a circle by multiplying radius * 2
	 * @return - the diameter of a circle
	 */
	public double getDiameter(){
		return radius * 2;
	}
	
	/**
	 * getCircumference calculates and returns the circumference of a circle by multiplying
	 * the diameter of the circle * PI
	 * @return - the circumference of a circle
	 */
	public double getCircumference(){
		return getDiameter() * PI;
	}
	
	/**
	 * getArea calculates and returns the area of a circle by multiplying PI * radius squared
	 * @return - the area of a circle
	 */
	public double getArea(){
		return PI * Math.pow(radius, 2);
	}
	
	/**
	 * equals compares two Circle objects and returns true if the values of the objects are the same
	 * 		  false if they are not
	 * @param circle2 - a Circle object
	 * @return true if the objects are the same or false if they are not
	 */
	public boolean equals( Circle circle2 ){
		
		// assumes the values are not the same
		boolean isEqual = false;
		
		// compares the values and if they are the same it changes isEqual to true
		if( radius == circle2.radius ){
			isEqual = true;
		}
		
		//returns isEqual
		return isEqual;
	}
	
	public String toString(){
		String message = "";
		
			   // build the message to be displayed
			   message += "The radius of the circle is: " + radius;
			   message += "\nThe diameter of the circle is: " + getDiameter();
			   message += "\nThe circumference of the circle is: " + getCircumference();
			   message += "\nThe area of the circle is: " + getArea();
			   message += "\n\n----------------------------------------\n\n";			// create some space between each circle
			   
		// return the message
		return message;
	}
}
