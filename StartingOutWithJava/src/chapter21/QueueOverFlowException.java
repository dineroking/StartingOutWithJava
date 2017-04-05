/*
 * Ronny Rosabal
 * Programming Fundamentals III
 * COSC 2336 2801
 * 04.04.17
 * Sets the blue print for creating a QueueOverFlowException
 */

// TODO: comment out package chapter21
package chapter21;

// TODO: comment in package stacksAndQueues
//package stacksAndQueues;

public class QueueOverFlowException extends RuntimeException {
  
  public QueueOverFlowException( String message ) {
    
    System.out.println( "Error: " + message );
  }
  
}
