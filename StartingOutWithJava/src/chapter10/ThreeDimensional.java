/*
 * Ronny Rosabal
 * Programming Fundamentals II
 * COSC 1337 2001
 * 11.18.16
 * Establishes the blueprint for creating a ThreeDimensional shape
 */
package chapter10;

public abstract class ThreeDimensional extends Shape{

	// VARIABLES 
	private int faces;						// holds the number of faces of the shape
	
	
	
	// CONSTRUCTOR
	
	/**
	 * ThreeDimensional initializes the number of sides to 0 and the number of faces to 0
	 */
	public ThreeDimensional(){
		this( 4, 1 );
	}
	
	/**
	 * ThreeDimensional initializes the number of sides to the value passed in the argument
	 * 					sides and the number of faces to the value passed in the argument
	 * 					faces
	 * @param sides - the number of sides of the shape
	 * @param faces - the number of faces of the shape
	 */
	public ThreeDimensional( int sides, int faces ){
		super( sides );
		this.faces = faces;
	}
	
	/**
	 * ThreeDimensional makes a copy of the ThreeDimensional object passed as the argument
	 * @param d - a ThreeDimensional object
	 */
	public ThreeDimensional( ThreeDimensional d ){
		faces = d.faces;
	}
	
	
	
	// ACCESSORS
	
	/**
	 * getFaces returns the number of faces of the shape
	 * @return the number of faces of the shape
	 */
	public int getFaces(){
		return faces;
	}
	
	
	
	// MUTATORS
	
	/**
	 * setFaces sets the number of faces to the value passed by the argument
	 * @param faces - the number of faces of the shape
	 */
	public void setFaces( int faces ){
		this.faces = faces;
	}
	
	
	
	// METHODS
	
	/**
	 * calcVolume is an abstract method that calculates the volume of the shape
	 * @return the volume of the shape
	 */
	public abstract double calcVolume();
	
	public boolean equals( ThreeDimensional d ){
		
		// assumes the objects are not equal
		boolean isEqual = false;
		
		// compare objects' field values
		if( faces == d.faces ){
			
			// if the are the same set isEqual to true
			isEqual = true;
			
		}
		
		// return isEqual
		return isEqual;
	}
	
	
	
	// OUTPUT
	
	/**
	 * toString overrides the toString method of the Object class to display a specific 
	 * 			    message
	 */
	@Override
	public String toString(){
		String message = super.toString() + "\n";
			     message = "This shape has " + faces + " faces.";
		return message;
	}
}
