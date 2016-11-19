/*
 * Ronny Rosabal
 * Programming Fundamentals II
 * COSC 1337 2001
 * 11.5.16
 * Establishes the blueprint for creating a Shape
 */
package chapter10;

public abstract class Shape {

	// VARIABLES 
	private int sides;
	
	
	
	// CONSTRUCTORS
	public Shape(){
		sides = 0;
	}
	
	public Shape( int sides ){
		this.sides = sides;
	}
	
	public Shape( Shape s ){
		sides = s.sides;
	}
	
	
	
	// ACCESSORS 
	public int getSides(){
		return sides;
	}
	
	
	
	// MUTATORS
	public void setSides( int sides ){
		this.sides = sides;
	}
	
	
	
	// METHODS
	public abstract double calcArea();
	
	
	
	// OUTPUT
	public String toString(){
		String message = "";
			   message += "This shape has " + sides + " sides.";
		return message;
	}
}
