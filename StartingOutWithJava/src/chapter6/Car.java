package chapter6;

public class Car {
	
	// FIELDS
	
	private int yearModel;
	private String make;
	private int speed; 
	
	// CONSTRUCTORS
	
	/**
	 * Sets the initial values for the year, make a speed
	 * @param y - the year of the car
	 * @param m - the model of the car
	 * @param s - the speed of the car
	 */
	public Car( int y, String m ){
		yearModel = y;
		make = m;
		speed = 0;
	}
	
	// SPEED CHANGERS
	
	/**
	 * Adds 5 to the speed each time it is called.
	 */
	public void accelerate(){
		speed += 5;
	}
	
	/**
	 * Adds 5 to the speed each time it is called.
	 */
	public void brake(){
		speed -= 5;
	}
	
	// ACCESSORS
	
	/**
	 * Gets the yearModel of the car
	 * @return the yearModel of the car
	 */
	public int getYearModel(){
		return yearModel;
	}
	
	/**
	 * Gets the make of the car
	 * @return the make of the car
	 */
	public String getMake(){
		return make;
	}
	
	/**
	 * Gets the speed of the car
	 * @return the speed of the car
	 */
	public int getSpeed(){
		return speed;
	}

}
