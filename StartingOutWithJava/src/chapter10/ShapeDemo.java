/*
 * Ronny Rosabal
 * Programming Fundamentals II
 * COSC 1337 2001
 * 11.18.16
 * Demonstrates all the different shapes 
 */
package chapter10;

import java.util.ArrayList;

public class ShapeDemo {

	public static void main(String[] args) {
		
		// ~~~~ GENERAL SHAPES ~~~~
		
		// VARIABLES
		
		ArrayList<Shape> shapes = new ArrayList<Shape>();
		
		// add objects to the list
		shapes.add( new Rectangle() );
		shapes.add( new Circle() );
		shapes.add( new Triangle() );
		shapes.add( new Box() );
		shapes.add( new Cylinder() );
		shapes.add( new TriPrism() );
		shapes.add( new Box( 3.5, new Rectangle( 1.5, 2.5 ) ) );
		shapes.add( new Box( 1.5 , new Rectangle( 1.3, 2.0 ) ) );
		shapes.add( new Cylinder( 5.0, new Circle( 1.5 ) ) );
		shapes.add( new TriPrism( 4.0, new Triangle( 1.0, 3.3 ) ) );
		
		int i = 1;
		for( Shape shape : shapes){
			System.out.println("Shape " + i + "\n" + shape );
			i++;
		}
		
		
		
		// ~~~~ RECTANGLES ~~~~
		
		// VARIABLES 
		
		Rectangle rect1 = new Rectangle();
		Rectangle rect2 = new Rectangle( 2.0, 4.0 );
		Rectangle rect3 = new Rectangle( rect2 );
		
		// OUTPUT
		
		System.out.println( rect1 );
		System.out.println( rect2 );
		System.out.println( rect3 );
		//System.out.println( rect1.equals( rect2 ) );
		//System.out.println( rect2.equals( rect3 ) );



		// ~~~~ TRIANGLE ~~~~
		
		// VARIABLES
		
		Triangle triangle1 = new Triangle();
		Triangle triangle2 = new Triangle( 1.5, 3.0 );
		Triangle triangle3 = new Triangle( triangle2 );
		
		// OUTPUT
		
		System.out.println( triangle1 );
		System.out.println( triangle2 );
		System.out.println( triangle3 );
		
		
		// ~~~~ CIRCLE ~~~~

		// VARIABLES
		
		Circle circle1 = new Circle();
		Circle circle2 = new Circle( 2.5 );
		Circle circle3 = new Circle( circle2 );
		
		// OUTPUT 
		
		System.out.println( circle1 );
		System.out.println( circle2 );
		System.out.println( circle3 );
		
		// ~~~~ CYLINDER ~~~~

		// VARIABLES

		Cylinder cylinder1 = new Cylinder();
		Cylinder cylinder2 = new Cylinder( 3.0, circle2 );
		Cylinder cylinder3 = new Cylinder( cylinder2 );

		// OUTPUT

		System.out.println( cylinder1 );
		System.out.println( cylinder2 );
		System.out.println( cylinder3 );
		
		
		
		// ~~~~ BOX ~~~~
		
		// VARIABLES 
		
		Box box1 = new Box();
		Box box2 = new Box( 3.0, rect2 );
		Box box3 = new Box( box2 );
		
		// OUTPUT
		
		System.out.println( box1 );
		System.out.println( box2 );
		System.out.println( box3 );
		
		
		
		// ~~~~ TRIPRISM ~~~~
		
		// VARIABLES
		
		TriPrism triprism1 = new TriPrism();
		TriPrism triprism2 = new TriPrism( 2.0, triangle2 );
		TriPrism triprism3 = new TriPrism( triprism2 );
		
		// OUTPUT
		
		System.out.println( triprism1 );
		System.out.println( triprism2 );
		System.out.println( triprism3 );

	}

}

