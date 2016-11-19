package chapter10;

public class Triangle extends Shape{
	
	// VARIABLES
	
	private double width,				// holds the width of the triangle 
	 			   height;				// holds the height of the triangle
	
	
	
	// CONSTRUCTORS
	
	/**
	 * Triangle initializes the number of sides to 3, width to 0 and height to 0
	 */
	public Triangle(){
		super( 3 );
		width = 0;
		height = 0;
	}
	
	/**
	 * Triangle initializes the number of sides to 3, the width to the width value passed
	 * 			as an argument, and the height to the height value passed as an argument
	 * @param width
	 * @param height
	 */
	public Triangle( double width, double height ){
		super( 3 );
		this.width = width;
		this.height = height;
	}
	
	/**
	 * Triangle makes a copy of the Triangle object passed as the argument
	 * @param triangle - a Tringle object
	 */
	public Triangle( Triangle triangle ){
		width = triangle.width;
		height = triangle.height;
	}
	
	
	
	// ACCESSORS
	
	/**
	 * getWidth returns the width of the triangle
	 * @return the width of the triangle
	 */
	public double getWidth(){
		return width;
	}
	
	/**
	 * getHeight returns the height of the triangle
	 * @return the height of the triangle
	 */
	public double getHeight(){
		return height;
	}
	
	
	
	// MUTATORS
	
	public void setWidth( double width ){
		this.width = width;
	}
	
	public void setHeight( double height ){
		this.height = height;
	}
	
	
	
	// METHODS
	
	/**
	 * calcArea calculates and returns the area of the triangle
	 * @return the area of the triangle
	 */
	@Override
	public double calcArea(){
		return ( width * height ) / 2;
	}
	
	/**
	 * equals compares two Triangle objects and if their values are the same it returns
	 * 		  true otherwise it returns false
	 * @param triangle - a Triangle object
	 * @return true if the objects are the same, false if they are not
	 */
	public boolean equals( Triangle triangle ){
		
		// assumes the objects are not the same
		boolean isEqual = false;
		
		// compare two Triangle objects
		if( width == triangle.width &&
			height == triangle.height ){
			
			// if the objects' values are the same set isEqual to true
			isEqual = true;
		}
		
		// return the results
		return isEqual;
	}
	
	
	
	// OUTPUT
	
	/**
	 * toString creates a specific message to be displayed
	 */
	@Override
	public String toString(){
		
		// initializes a message
		String message = "";
			   // creates message to be displayed
			   message += "\nA triangle has " + getSides() + " sides.";
			   message += "\nIt's width is " + width;
			   message += "\nIt's height is " + height;
			   message += String.format( "\nIt's area is %1.2f", calcArea() );
		
		// return the message
		return message;
	}

}
