/**
 * Created by Ronny Rosabal.
 * Date:      2/22/17
 * Objective:
 */
package chapter18;

import chapter2.StringManipulator;

public class Pair <T extends Number, S extends String>{
  
  // VARIABLES
  
  private T first;
  private S second;
  
  
  
  // CONSTRUCTORS
  
  public Pair( T first, S second ) {
    this.first = first;
    this.second = second;
  }
  
  
  
  // ACCESSORS
  
  public T getFirst() {
    return first;
  }
  
  public S getSecond() {
    return second;
  }
  
  
  
  // MUTATORS
  
  
  
  // METHODS
  
}
