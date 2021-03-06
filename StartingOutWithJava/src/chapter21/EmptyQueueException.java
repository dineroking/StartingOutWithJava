/*
 * Ronny Rosabal
 * Programming Fundamentals III
 * COSC 2336 2801
 * 04.04.17
 * Sets the blue print for creating a EmptyQueueException
 */

// TODO: comment out package chapter21
package chapter21;

// TODO: comment in package stacksAndQueues
//package stacksAndQueues;

public class EmptyQueueException extends RuntimeException {
  
  /**
   * EmptyQueueException() initializes the error message when the queue is empty
   * @param message message to display
   */
  public EmptyQueueException( String message ) {
    
    System.out.println( "Error: " + message );
  }
  
}
