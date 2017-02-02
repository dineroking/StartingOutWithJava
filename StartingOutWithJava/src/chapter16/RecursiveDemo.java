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
    System.out.println( test2( 10, 20 ));
    System.out.println( gcd( 60, 24 ));
    
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
  
  public static int test2(int x, int y)
  {
    if ( x < y)
    {
      return -5;
    }
    else
    {
      return (test2(x - y, y + 5) + 6);
    }
  }
  
  public static int gcd( int x, int y ) {
    if( x < y ) {
      gcd( y, x );
    } else if( y == 0 ) {
      return x;
    }else {
      return gcd( y, x % y );
    }
    return -1;
  }
  
}
