/*
 * Ronny Rosabal
 * Programming Fundamentals II
 * COSC 1337 2001
 * 11.5.16
 * Establishes the blueprint for creating a ThreeDimensional shape
 */
package chapter10;

public abstract class ThreeDimensional extends Shape{

	// VARIABLES 
	private int faces;
	
	
	
	// CONSTRUCTOR
	public ThreeDimensional(){
		faces = 0;
	}
	
	
	
	// ACCESSORS
	public int getFaces(){
		return faces;
	}
	
	
	
	// MUTATORS
	public void setFaces( int faces ){
		this.faces = faces;
	}
	
	
	
	// METHODS
	public abstract double calcVolume();
	
	
	
	// OUTPUT
	public String toString(){
		String message = "";
			   message = "This shape has " + faces + " faces";
		return message;
	}
}
