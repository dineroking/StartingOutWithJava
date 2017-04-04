/*
 * Ronny Rosabal
 * Programming Fundamentals III
 * COSC 2336 2801
 * 04.04.17
 * Sets the blue print for creating a stacked collection
 */

// TODO: comment out package chapter21
package chapter21;

// TODO: comment in package stacksAndQueues
//package stacksAndQueues;

import java.util.Objects;
import java.util.Stack;

public class StackCollection<T> {
  
  private T [] s;                         // array of elements of type <T>
  private int top;                        // top of the stack
  
  // CONSTRUCTORS
  
  /**
   * StackCollection initializes the stack capacity and the top of the stack index
   * @param capacity number of item to be held by the stack
   */
  public StackCollection( int capacity ) {
    
    s = ( T[] ) new Object[ capacity ];
    top = 0;
  }
  
  
  
  // METHODS
  
  /**
   * empty() checks if the stack is empty
   * @return true if the stack is empty or false otherwise
   */
  public boolean empty(){
    return top == 0;
  }
  
  /**
   * push() adds a new element to the top of the stack
   * @param elem the element to be added to the top of the stack
   * @return the element added to the top of the stack
   */
  public T push( T elem ) {
    
    if( top == s.length ) {
      throw new StackOverFlowException();
    } else {
      s[top] = elem;
      top++;
      return elem;
    }
  }
  
  /**
   * pop() removes the element at the top of the stack
   * @return the element removed from the top of the stack
   */
  public T pop() {
    
    if( empty() ) {
      throw new EmptyStackException();
    } else {
      T retVal = s[top - 1];
      s[top - 1] = null;
      return retVal;
    }
  }
  
}
