package chapter10;

public class Triangle extends Shape{
	
	// VARIABLES
	
	private double width,									// holds the width of the triangle 
	 			   				height;								// holds the height of the triangle
	private static int numInstance = 0; 	// holds number of instances of the class
	
	
	
	// CONSTRUCTORS
	
	/**
	 * Triangle initializes the number of sides to 3, width to 0 and height to 0
	 */
	public Triangle(){
		
		// calls the Triangle constructor passing a width of 1, and height of 1
		this( 1, 1 );
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
		
		// add an instance of the class 
    numInstance++;
	}
	
	/**
	 * Triangle makes a copy of the Triangle object passed as the argument
	 * @param triangle - a Triangle object
	 */
	public Triangle( Triangle triangle ){
		super( 3 );
		width = triangle.width;
		height = triangle.height;
		
		// add an instance of the class 
    numInstance++;
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
	
	/**
	 * getNumInstance return the number of instances of the class
	 * @return number of instances
	 */
	public static int getNumInstance(){
		return numInstance;
	}
	
	
	
	// OUTPUT
	
	/**
	 * toString creates a specific message to be displayed
	 */
	@Override
	public String toString(){
		
		// initializes a message
		String message = "Triangle\n";
			   // creates message to be displayed
			   message += super.toString();
			   message += "\nIt's width is " + width;
			   message += "\nIt's height is " + height;
			   message += String.format( "\nIt's area is %1.2f", calcArea() );
			   message += "\n\n----------------------------------------\n\n";
		
		// return the message
		return message;
	}

}
