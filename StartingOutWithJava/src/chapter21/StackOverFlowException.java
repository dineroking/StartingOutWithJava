/*
 * Ronny Rosabal
 * Programming Fundamentals III
 * COSC 2336 2801
 * 04.04.17
 * Sets the blue print for creating a StackOverFlowException
 */

// TODO: comment out package chapter21
package chapter21;

// TODO: comment in package stacksAndQueues
//package stacksAndQueues;

public class StackOverFlowException extends RuntimeException {
  
  public StackOverFlowException( String message ) {
    
    System.out.println( "Error: " + message );
  }
  
}
