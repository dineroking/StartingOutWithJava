package chapter8;

public class Area {

	// VARIABLES
	private static double PI = Math.PI;
	private static double radius,
						  width,
						  height;
	
	// METHODS
	
	public static double getArea( double radius ){
		return PI * Math.pow( radius, 2 );
	}
	
	public static double getArea( int width, int length ){
		return width * length;
	}
	
	public static double getArea( double height, double radius ){
		return PI * Math.pow(radius, 2) * height;
	}
}
