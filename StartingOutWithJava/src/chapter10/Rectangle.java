/*
 * Ronny Rosabal
 * Programming Fundamentals II
 * COSC 1337 2001
 * 11.18.16
 * Establishes the blueprint for creating a Rectangle shape
 */

package chapter10;

public class Rectangle extends Shape {
	
	// VARIABLES
	private double width,											// holds the width of the rectangle
				   			 height;										// holds the height of the rectangle
	private static int numInstance = 0;				// holds number of instances of the class
	
	
	
	// CONSTRUCTORS
	
	/**
	 * Rectangle initializes the number of sides to 4, the width to 0 and the height to 0
	 */
	public Rectangle(){
		
		// calls a Rectangle constructor passing a width of 1 and height of 1
		this( 1, 1 );
	}
	
	/**
	 * Rectangle initializes the number of sides to 4, the width to the width value passed
	 * 			 as an argument and the height to the height value passed as an argument
	 * @param width - the width of the rectangle
	 * @param height - the height of the rectangle
	 */
	public Rectangle( double width, double height ){
		super( 4 );
		this.width = width;
		this.height = height;
		
		// add an instance of the class
		numInstance++;
	}
	
	/**
	 * Rectangle makes a copy of the Rectangle object that was passed as an argument
	 * @param r - a Rectangle object
	 */
	public Rectangle( Rectangle r ){
		super( 4 );
		width = r.width;
		height = r.height;
		
		// add an instance of the class
		numInstance++;
	}
	
	
	
	// ACCESSORS
	
	/**
	 * getWidth returns the width of the rectangle
	 * @return - the width of the rectangle
	 */
	public double getWidth(){
		return width;
	}
	
	/**
	 * getheight returns the height of the rectangle
	 * @return - the height of the rectangle
	 */
	public double getHeight(){
		return height;
	}
	
	
	
	// MUTATORS
	
	/**
	 * setWidth sets the width of the rectangle with the value passed as the argument
	 * @param width - the width of the rectangle
	 */
	public void setWidth( double width ){
		this.width = width;
	}
	
	/**
	 * setheight sets the height of the rectangle with the value passed as the argument
	 * @param height - the height of the rectangle
	 */
	public void setheight( double height ){
		this.height = height;
	}
	
	
	
	// METHODS
	
	/**
	 * calcArea calculates and returns the area of the rectangle
	 * @return the area of the rectangle
	 */
	@Override
	public double calcArea(){
		return width * height;
	}
	
	/**
	 * calcPerimeter calculates and returns the perimeter of the rectangle
	 * @return
	 */
	public double calcPerimeter(){
		return ( width * 2 ) + ( height * 2 );
	}
	
	/**
	 * equals compares two Rectangle objects and if their values are the same it return
	 * 		  true otherwise it returns false
	 * @param r - a Rectangle object
	 * @return true if they are equal or false if they are not
	 */
	public boolean equals( Rectangle r ){
		
		// assumes the objects are not the same
		boolean isEqual = false;
		
		// compare the values of the two objects
		if( width == r.width &&
			height == r.height ){
			
			// if the values are the same set isEqual to true
			isEqual = true;
			
		}
		
		// return isEqual
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
	 * toString creates and displays a message with all the information of the rectangle
	 */
	@Override
	public String toString(){
		
		// initialize a message
		String message = "Rectangle\n";
			   // create the message to be displayed 
			   message += super.toString();
			   message += "\nIt's width is " + width;
			   message += "\nIt's height is " + height;
			   message += "\nIt's perimeter is " + calcPerimeter();
			   message += String.format( "\nIt's area is %1.2f", calcArea() ); 
			   message += "\n\n----------------------------------------\n\n";
			   
		// return the message
		return message;
	}

}
