/*
 * Ronny Rosabal
 * Programming Fundamentals III
 * COSC 2336 2801
 * 04.04.17
 * Sets the blue print for creating a EmptyStackException
 */

// TODO: comment out package chapter21
package chapter21;

// TODO: comment in package stacksAndQueues
//package stacksAndQueues;

public class EmptyStackException extends RuntimeException {
  
  public EmptyStackException( String message ) {
    
    System.out.println( "Error: " + message );
  }
}
