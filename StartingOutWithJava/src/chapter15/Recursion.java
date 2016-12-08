/**
 * Created by Ronny Rosabal.
 * Date:      12/6/16
 * Objective:
 */
package chapter15;

public class Recursion {

  public static void main( String[] args ){

    int[] arr = {1, 1, 2, 3, 5, 6, 8, 9 };

    printer( 0, arr );

  }

  public static void printer( int i, int[] array ){
    if( i < array.length ){
      System.out.println( array[i] );
      printer( i + 1, array );
    }
  }
}
