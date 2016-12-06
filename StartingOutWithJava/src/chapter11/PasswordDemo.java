/**
 * Created by Ronny Rosabal.
 * Date:      12/5/16
 * Objective:
 */
package chapter11;

import java.io.IOException;

public class PasswordDemo {

  public static void main( String[] args ) throws IOException {

    // VARIABLES

    String file = "src/chapter11/strong.dat";

    //TODO: delete after testing
    PasswordReaderWriter myFile = new PasswordReaderWriter( file );

    System.out.println( myFile );
  }
}
