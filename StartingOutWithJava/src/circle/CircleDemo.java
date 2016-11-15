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
		
		// ~~~~ CIRCLES ~~~~
		
		// VARIABLES
		
		Circle circle1 = new Circle();				// holds a Circle instance
		Circle circle2 = new Circle( 4.0 );			// holds a Circle instance
		
		// OUTPUT
		
		System.out.println("circle1\n\n" + circle1);
		System.out.println("circle2\n\n" + circle2);
		
		// change circle1 to less than 1 radius and circle2 to a radius using a string
		circle1.setRadius(.3);
		circle2.setRadius("3");
		
		// print message with the new measurements
		
		System.out.println("circle1\n\n" + circle1);
		System.out.println("circle2\n\n" + circle2);
		
		
		
		// ~~~~ CYLINDERS ~~~~
		
		// VARIABLES
		
		Cylinder cylinder1 = new Cylinder( 2.0 );					// holds a Cylinder instance
		
		// circle2 was assigned a radius of 3 in code above
		Cylinder cylinder2 = new Cylinder( 3.0, circle2 );			// holds a Cylinder instance
		
		// has the same measurements as cylinder2 by making a copy of it
		Cylinder cylinder3 = new Cylinder( cylinder2 );				// holds a Cylinder instance
		
		// testing the copy method of the Cylinder class
		Cylinder cylinder4 = cylinder2.copy( cylinder2 );
		
		// testing the copy method without arguments
		Cylinder cylinder5 = cylinder2.copy();
		
		// OUTPUT
		
		System.out.println("cylinder1\n\n" + cylinder1);
		System.out.println("cylinder2\n\n" + cylinder2);
		System.out.println("Do cylinder2 and cylinder3 have the same values: " + cylinder2.equals( cylinder3 ) );
		System.out.println("Do cylinder2 and cylinder4 have the same values: " + cylinder2.equals( cylinder4 ) );
		System.out.println("Do cylinder2 and cylinder5 have the same values: " + cylinder2.equals( cylinder5 ) );

	}

}
