/**
 * Created by Ronny Rosabal.
 * Date:      2/20/17
 * Objective:
 */
package chapter18;

public class Point<T extends Number> {
  
  // VARIABLES
  
  private T xCoordinate;
  private T yCoordinate;
  
  
  
  // CONSTRUCTORS
  
  public Point( T x, T y ) {
    this.xCoordinate = x;
    this.yCoordinate = y;
  }
  
  
  
  // ACCESSORS
  
  public T getxCoordinate() {
    return xCoordinate;
  }
  
  public T getyCoordinate() {
    return yCoordinate;
  }
  
  
  
  // MUTATORS
  
  public void setxCoordinate( T x ) {
    this.xCoordinate = x;
  }
  
  public void setyCoordinate( T y ) {
    this.yCoordinate = y;
  }
  
  
  
  // METHODS
  
  @Override
  public String toString() {
    String msg;         // message to be returned to user
    msg = "X coordinate: " + xCoordinate;
    msg += "\nY coordinate: " + yCoordinate;
    return msg;
  }
  
}
