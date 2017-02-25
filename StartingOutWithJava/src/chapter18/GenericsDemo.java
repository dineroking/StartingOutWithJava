/**
 * Created by Ronny Rosabal.
 * Date:      2/21/17
 * Objective:
 */
package chapter18;

public class GenericsDemo {
  
  public static void main( String[] args ) {
    
    String[] names = { "Ronny", "Leslie", "Christian" };
    displayNames( names );
    
    Point3D <Integer> cube = new Point3D<>( 3, 5, 7 );
    Pair <Integer, String> multiple = new Pair<>( 3, "Ronny" );
    
    System.out.println( cube );
  }
  
  public static <E> void displayNames( E[] array ) {
    
    for( E element : array ) {
      System.out.println( element );
    }
  }
  
}
