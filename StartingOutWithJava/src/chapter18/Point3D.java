/**
 * Created by Ronny Rosabal.
 * Date:      2/22/17
 * Objective:
 */
package chapter18;

public class Point3D<T extends Number> extends Point<T> {
  
  // VARIABLES
  
  private T zCoordinate;                    // holds the coordinates of 3 dimensional objects
  
  
  
  // CONSTRUCTORS
  
  public Point3D( T x, T y, T z ) {
    super( x, y );
    this.zCoordinate = z;
  }
  
  
  
  // ACCESSORS
  
  public T getzCoordinate() {
    return zCoordinate;
  }
  
  
  
  // MUTATORS
  
  public void setzCoordinate( T z ) {
    this.zCoordinate = z;
  }
  
  
  
  // METHODS
  
  @Override
  public String toString() {
    String msg;           // holds to message to be displayed to the user
    msg = super.toString();
    msg = "\nZ coordinate: " + zCoordinate;
    return msg;
  }
  
  
  
}
