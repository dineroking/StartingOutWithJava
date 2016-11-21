/*
 * Ronny Rosabal
 * Programming Fundamentals II
 * COSC 1337 2001
 * 11.19.16
 * Establishes the blueprint for creating a box
 */
package chapter10;

public class Box extends ThreeDimensional {
	
	// VARIABLES 
	private double length;										// holds the length of the box
	private Rectangle rectangle;							// holds a Rectangle object
	private static int numInstance = 0;				// holds number of instances of the class
	
	
	
	// CONSTRUCTORS
	
	/**
	 * Box initializes a box to have a length of 1
	 */
	public Box(){
		
		// calls the Box constructor passing it a length of 1, and a new Rectangle object
		this( 1, new Rectangle() );
	}
	
	/**
	 * Box initializes a box. It sets the length to the length value passed as an argument
	 * 		 and the rectangle to a copy of a Rectangle object
	 * @param length - the length of the box
	 * @param rectangle - a Rectangle object
	 */
	public Box( double length, Rectangle rectangle ){
		
		// calls the ThreeDimentional constructor passing the sides first and the faces second
		super( 4, 6 );
		
		this.length = length;
		this.rectangle = new Rectangle( rectangle );
		
		// adds an instance of the class
		numInstance++;
	}
	
	/**
	 * Box initializes a Box object to an address copy of another Box object
	 * @param box - a Box object
	 */
	public Box( Box box ){
		
		// calls the ThreeDimentional constructor passing the sides first and the faces second
		super( 4, 6 );
		
		this.length = box.length;
		this.rectangle = new Rectangle( box.rectangle );
		
		// adds an instance of the class
		numInstance++;
		
	}
	
	
	
	// ACCESSORS 
	
	/**
	 * getLength returns the length of the box
	 * @return the length of the box
	 */
	public double getLength(){
		return length;
	}
	
	/**
	 * getRectangle returns a copy of the address to rectangle
	 * @return the copy of the address to rectangle
	 */
	public Rectangle getRectangle(){
		return new Rectangle( rectangle );
	}
	
	
	
	// MUTATORS
	
	/**
	 * setLength sets the length to the length value passed as an argument
	 * @param length - the length of the box
	 */
	public void setLength( double length ){
		this.length = length;
	}
	
	/**
	 * setRectangle sets rectangle to a copy of the address of the Rectangle object passed
	 * 							as an argument
	 * @param rectangle - a Rectangle object
	 */
	public void setRectangle( Rectangle rectangle ){
		this.rectangle = new Rectangle( rectangle );
	}
	
	
	
	// METHODS
	
	/**
	 * calcArea calculates and returns the surface area of a box
	 * @return the area of the box
	 */
	@Override
	public double calcArea(){
		
		// holds the surface area of a box
		double area = 0;
		
		// check to see if the box is a cube
		if( rectangle.getWidth() == rectangle.getHeight() 
				&& 
				rectangle.getWidth() == length ){
			area = 6 * Math.pow(length, 2);
		}else{
			
			// calculates the surface area of a box 
			// first it calculates width times height times 2 for the two opposite equal sides
			// then it calculates the length times the width times 2 for the two opposite equal sides
			// last it calculates the length times the height times 2 for the two opposite equal sides
			area = ( 2 * rectangle.calcArea() ) + 
					   ( 2 * length * rectangle.getWidth() ) + 
					   ( 2 * length * rectangle.getHeight() );
		}
		
		// return the total surface area of the box
		return area;
	}
	
	/**
	 * calcVolume calculates and returns the volume of a box
	 * @return the volume of a box
	 */
	@Override
	public double calcVolume(){
		return rectangle.calcArea() * length;
	}
	
	/**
	 * equals compares the values of two Box objects and if they are the same it return
	 * 				true other it returns false
	 * @return true if they are equal or false if they are not
	 */
	public boolean equals( Box box ){
		
		// assumes the values of the Box objects are not the same
		boolean isEqual = false;
		
		// compare the values of the two Box objects
		if( length == box.length 
				&&
				rectangle.equals( box.rectangle ) ){
			
			// if the values are the same change isEqual too true
			isEqual = true;
		}
		
		// return the results of the comparison
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
	
	public String toString(){
		
		// initialize the message
		String message = "Box\n";
		
					 // call the toString from the ThreeDimensional super class
					 message += super.toString();
					 
					 // create the message to be displayed
					 message += "\nThe width of the box is " + rectangle.getWidth();
					 message += "\nThe height of the box is " + rectangle.getHeight();
					 message += "\nThe length of the box is " + length;
					 message += String.format( "\nThe area of the box is %1.2f", calcArea() );
					 message += String.format( "\nThe volume of the box is %1.2f", calcVolume() );
					 message += "\n\n----------------------------------------\n\n";
					 
		// return the message to be displayed
		return message;
	}

}
