/*
 * Ronny Rosabal
 * Programming Fundamentals II
 * COSC 1337 2001
 * 11.18.16
 * Demonstrates all the different shapes 
 */
package chapter10;

public class ShapeDemo {

	public static void main(String[] args) {
		
		// ~~~~ GENERAL SHAPES ~~~~
		
		
		
		// ~~~~ RECTANGLES ~~~~
		
		// VARIABLES 
		
		Rectangle rect1 = new Rectangle();
		Rectangle rect2 = new Rectangle( 2.0, 4.0 );
		Rectangle rect3 = new Rectangle( rect2 );
		
		// OUTPUT
		
		System.out.println( rect1 );
		System.out.println( rect2 );
		System.out.println( rect1.equals( rect2 ) );
		System.out.println( rect2.equals( rect3 ) );

	}

}
