/**
 * Created by Ronny Rosabal.
 * Date:      1/30/17
 * Objective:
 */
package chapter16;

public class RecursiveDemo {
  
  public static void main( String[] args ) {
    
    message( 5 );
    System.out.println( factorial( 3 ) );
    
  }
  
  public static void message( int n ) {
    
    if( n > 0 ) {
      System.out.println( "Value of n before call: " + n );
      message( n - 1 );
      System.out.println( "Value of n after call: " + n );
    }
  }
  
  public static int factorial( int n ) {
    
    if( n == 0 ) {
      return 1;
    }
    return n * factorial( n - 1 );
  }
  
}
