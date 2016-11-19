/*
 * Ronny Rosabal
 * Programming Fundamentals II
 * COSC 1337 2001
 * 11.18.16
 * Establishes the blueprint for creating a Shape
 */
package chapter10;

public abstract class Shape {

	// VARIABLES 
	private int sides;						// number of sides for the shape					
	
	
	
	// CONSTRUCTORS
	
	/**
	 * Shape initializes sides to 0
	 */
	public Shape(){
		sides = 0;
	}
	
	/**
	 * Shape initializes sides to the argument value
	 * @param sides - the number of sides of the shape
	 */
	public Shape( int sides ){
		this.sides = sides;
	}
	
	/**
	 * Shape makes a copy of the Shape object passed as an argument
	 * @param s - a Shape object
	 */
	public Shape( Shape s ){
		sides = s.sides;
	}
	
	
	
	// ACCESSORS 
	
	/**
	 * getSides returns the number of sides of the shape
	 * @return - the number of sides
	 */
	public int getSides(){
		return sides;
	}
	
	
	
	// MUTATORS
	
	/**
	 * setSides sets the number of sides of the shape to the argument value
	 * @param sides - the number of sides of the shape
	 */
	public void setSides( int sides ){
		this.sides = sides;
	}
	
	
	
	// METHODS
	
	/**
	 * calcArea is an abstract method for calculating the area of a shape
	 * @return the area of the shape
	 */
	public abstract double calcArea();
	
	/**
	 * equals checks the values of two Shape objects and if they are equal it returns
	 * 		  true otherwise it return false
	 * @param s - a Shape object
	 * @return true if the objects are equal or false if they are not
	 */
	public boolean equals( Shape s ){
		boolean isEqual = false;
		if( sides == s.sides ){
			isEqual = true;
		}
		return isEqual;
	}
	
	
	
	// OUTPUT
	
	/**
	 * toString overrides the toString method display a more accurate message
	 */
	@Override
	public String toString(){
		String message = "";
			   message += "This shape has " + sides + " sides.";
		return message;
	}
}
