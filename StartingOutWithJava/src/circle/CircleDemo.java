/*
 * Ronny Rosabal
 * Programming Fundamentals II
 * COSC 1337 2001
 * 11.5.16
 * Creates circles from the Circle class
 */
package circle;

public class CircleDemo {

	public static void main(String[] args) {
		
		// VARIABLES
		
		Circle circle1 = new Circle();				// holds a Circle instance
		Circle circle2 = new Circle( 4.0 );			// holds a Circle instance
		String message;								// the message to show the user
		
		// OUTPUT
		
		// create the message
		message = "Circle1\n\n";
		message += "radius: " + circle1.getRadius();
		message += "\ndiameter: " + circle1.getDiameter();
		message += "\ncircumference: " + circle1.getCircumference();
		message += "\narea: " + circle1.getArea();
		message += "\n\n";
		message += "Circle2\n\n";
		message += "radius: " + circle2.getRadius();
		message += "\ndiameter: " + circle2.getDiameter();
		message += "\ncircumference: " + circle2.getCircumference();
		message += "\narea: " + circle2.getArea();
		message += "\n\n------------------------------------\n\n";
		
		// display the message with original measurements
		System.out.println(message);
		
		// change circle1 to less than 1 radius and circle2 to a radius using a string
		circle1.setRadius(.3);
		circle2.setRadius("3");
		
		// update message with the new measurements
		message = "Circle1\n\n";
		message += "radius: " + circle1.getRadius();
		message += "\ndiameter: " + circle1.getDiameter();
		message += "\ncircumference: " + circle1.getCircumference();
		message += "\narea: " + circle1.getArea();
		message += "\n\n";
		message += "Circle2\n\n";
		message += "radius: " + circle2.getRadius();
		message += "\ndiameter: " + circle2.getDiameter();
		message += "\ncircumference: " + circle2.getCircumference();
		message += "\narea: " + circle2.getArea();
		message += "\n\n------------------------------------\n\n";
		
		System.out.println(message);

	}

}
