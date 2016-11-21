/*
 * Ronny Rosabal
 * Programming Fundamentals II
 * COSC 1337 2001
 * 11.19.16
 * Establishes the blueprint for creating a triprism
 */

package chapter10;

public class TriPrism extends ThreeDimensional {
	
	// VARIABLES
	
	private double length;										// holds the length of the triprism
	private Triangle triangle;								// holds a Triangle object
	private static int numInstance = 0; 			// holds the number of instances of the class
	
	
	
	// CONSTRUCTORS
	
	/**
	 * TriPrism initializes length to 1 and triangle to a new Triangle object
	 */
	public TriPrism(){
		
		// calls the TriPrism constructor passing 1 for the length and a new Triangle object
		this( 1, new Triangle() );
	}
	
	/**
	 * TriPrism initializes length to the length value pass as an argument and triangle to
	 * 					a copy of the Triangle object passed as an argument. It also sets sides to 3
	 * 					and faces to 6.
	 * @param length - the length of the triprism
	 * @param triangle - a Triangle object
	 */
	public TriPrism( double length, Triangle triangle ){
		
		// calls a ThreeDimensional constructor passing the sides first and the faces second
		super( 3, 6 );
		
		this.length = length;
		this.triangle = new Triangle( triangle );
		
		// adds an instance of the class
		numInstance++;
	}
	
	/**
	 * TriPrism initializes all the fields to a copy of values of the Triangle object
	 * 					being passed as an argument
	 * @param triprism - a TriPrism object
	 */
	public TriPrism( TriPrism triprism ){
		
		// calls a ThreeDimensional constructor passing the sides first and the faces second
		super( 3, 6 );
		
		this.length = triprism.length;
		this.triangle = new Triangle( triprism.triangle );
		
		// adds an instance of the class
		numInstance++;
	}
	
	
	
	// ACCESSORS
	
	/**
	 * getLength returns the length of the TriPrism
	 * @return the length of the TriPrism
	 */
	public double getLength(){
		return length;
	}
	
	/**
	 * getTriangle returns a copy of the Triangle object
	 * @return a copy of the Triangle object
	 */
	public Triangle getTriangle(){
		return new Triangle( triangle );
	}
	
	
	
	// MUTATORS
	
	/**
	 * setLength sets the length to the length value passed as an argument
	 * @param length - the length of the argument
	 */
	public void setLength( double length ){
		this.length = length;
	}
	
	/**
	 * setTriangle sets triangle to a copy of the Triangle object passed as an argument
	 * @param triangle - a Triangle object
	 */
	public void setTriangle( Triangle triangle ){
		this.triangle = new Triangle( triangle );
	}
	
	
	
	// METHODS
	
	/**
	 * calcArea calculates and returns the surface area of a triprism
	 * @return the surface area of a triprism
	 */
	@Override
	public double calcArea(){
		
		// calculates the area
		// first calculates the area of the ends
		// second calculates the area of the bottom
		// third calculates the area of the sides
		// last it returns all the areas added together
		return ( 2 * triangle.calcArea() ) + 
			   	 ( length * triangle.getWidth() ) + 
			   	 ( 2 * length * triangle.getHeight() );
	}
	
	/**
	 * calcVolume calculates and returns the volume of the triprism
	 * @return the volume of the triprism
	 */
	@Override
	public double calcVolume(){
		return triangle.calcArea() * length;
	}
	
	
	public boolean equals( TriPrism triprism ){
		
		// assumes the values of the two objects are not the same
		boolean isEqual = false;
		
		// compares the values of two TriPrism objects
		if( length == triprism.length && triangle.equals( triprism.triangle ) ){
			
			// if the values are the same change isEqual to true
			isEqual = true;
		}
		
		// return the results
		return isEqual;
	}
	
	/**
	 * getNumInstance return the number of instances of the class
	 * @return number of instances
	 */
	public static int getNumInstance(){
		return numInstance;
	}
	
	
	
	// OUTPUT
	
	/**
	 * toString creates and returns a message
	 * @return a message
	 */
	@Override
	public String toString(){
		
		// initializes the message to be displayed
		String message = "TriPrism\n";
					
					 // calls the toString method on the super class
					 message += super.toString();
					 message += "\nThe width of the triprism is " + triangle.getWidth();
					 message += "\nThe height of the triprism is " + triangle.getHeight();
					 message += "\nThe length of the triprism is " + length;
					 message += String.format("\nThe area of the triprism is %1.2f", calcArea() );
					 message += String.format("\nThe volume of the triprism is %1.2f", calcVolume() );
					 message += "\n\n----------------------------------------\n\n";
		
		// return the message 
		return message;
	}

}
