
package chapter9;

/**
 * Created by ronnyrosabal on 11/22/16.
 */

import java.util.ArrayList;
public class Backwards {

  public static void main( String [] args ){

    String output;

    output = reverse( "Ronny" );

    System.out.println( output );

  }

  public static String reverse( String word ){

    String reversed = "";
    String [] wordArray = new String[ word.length() ];

    wordArray = word.split( "" );

    for( int i = word.length() - 1; i >= 0; i-- ){
      reversed += wordArray[i];
    }

    return reversed;
  }
}
