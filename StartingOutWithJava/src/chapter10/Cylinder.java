/*
 * Ronny Rosabal
 * Programming Fundamentals II
 * COSC 1337 2001
 * 11.19.16
 * Establishes the blueprint for creating a cylinder
 */

package chapter10;

public class Cylinder extends ThreeDimensional{

  // VARIABLES
  private double length;                  // holds the length of the cylinder
  private Circle circle;                  // holds a Circle object
  private static int numInstance = 0;			// holds number of instances of the class



  // CONSTRUCTORS

  /**
   * Cylinder initializes sides to 1, faces to 3, length to 1 and circle to a new Circle object 
   */
  public Cylinder(){
  	
  	// calls the Cylinder constructor with a length of 1 and a new Circle object
    this( 1, new Circle() );
  }

  /**
   * Cylinder initializes sides to 1, faces to 3, length to the length value passed as an argument
   * and circle to the Circle object passed as an argument
   * @param length - the length of a cylinder
   * @param circle - a Circle object
   */
  public Cylinder( double length, Circle circle ){
	
	// calls the ThreeDimensional constructor passing the sides first and faces second
    super( 1, 3 );
    
    this.length = length;
    this.circle = new Circle( circle );
    
    // add an instance of the class 
    numInstance++;
  }

  /**
   * Cylinder creates a copy of the Cylinder object
   * @param cylinder - a Cylinder object
   */
  public Cylinder( Cylinder cylinder ){
	  
	// calls the ThreeDimensional constructor passing the sides first and faces second
	  super( 1, 3 );
	
    length = cylinder.length;
    circle = new Circle( cylinder.circle );
    
    // add an instance of the class 
    numInstance++;
  }



  // ACCESSORS
  
  /**
   * getLength returns the length of the cylinder
   * @return - the length of the cylinder
   */
  public double getLength(){
	  return length;
  }
  
  /**
   * getCircle returns a copy of the address of the circle object
   * @return - the address of the Circle object	
   */
  public Circle getCircle(){
	  return new Circle( circle );
  }



  // MUTATORS
  
  /**
   * setLength sets the length of cylinder to the length value passed as an argument
   * @param length - the length of the cylinder
   */
  public void setLength( double length ){
	  this.length = length;
  }

  /**
   * setCircle sets circle to a copy of Circle object's address passed as an argument
   * @param circle - a Circle object
   */
  public void setCircle( Circle circle ){
	  circle = new Circle( circle );
  }
  
  

  // METHODS

  /**
   * calcArea calculates and return the area of the cylinder
   * @return the area of the cylinder
   */
  @Override
  public double calcArea(){
    return (circle.getCircumference() * length) + (2 * circle.calcArea());
  }

  /**
   * calcVolume calculates and returns the volume of the cylinder
   * @return the volume of the cylinder
   */
  @Override
  public double calcVolume(){
    return Math.PI * Math.pow( circle.getRadius(), 2 ) * length;
  }
  
  /**
   * equals compares two Cylinder objects' values and if they are the same it returns
   * 				true other it returns false
   * @param cylinder - a Cylinder object
   * @return true if they are the same or false if they are not
   */
  public boolean equals( Cylinder cylinder ){
  	
  	// assumes the objects being compared are not the same
  	boolean isEqual = false;
  	
  	// compare the objects 
  	if( length == cylinder.length && circle.equals( cylinder.circle )){
  		
  		// if their values are the same change isEqual to true
  		isEqual = true;
  	}
  	
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
   * toString creates and returns a message to display the cylinder info
   * @return a message with the cylinder info
   */
  @Override
  public String toString(){

    // initialize message to be displayed
    String message = "Cylinder\n";
           message += super.toString();
           message += "\nEach face has " + getSides() + " side.";
           message += "\nThe radius of the cylinder is " + circle.getRadius();
           message += "\nThe diameter of the cylinder is " + circle.getDiameter();
           message += String.format("\nThe area of the cylinder is %1.2f", calcArea());
           message += String.format("\nThe volume of the cylinder is %1.2f", calcVolume() );
           message += "\n\n----------------------------------------\n\n";

    // return the message
    return message;
  }
}
