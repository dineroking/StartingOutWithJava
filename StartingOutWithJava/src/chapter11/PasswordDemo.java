/*
 * Ronny Rosabal
 * Programming Fundamentals II
 * COSC 1337 2001
 * 12.10.16
 * Executes the Strong password class
 */
package chapter11;

import java.io.IOException;

public class PasswordDemo {

  public static void main( String[] args ) throws IOException {

    // VARIABLES

    // file containing passwords
    String file = "src/chapter11/strong.dat";

    // create PasswordReaderWriter object with a file
    PasswordReaderWriter pwdFile = new PasswordReaderWriter( file );

    // create Strong object
    Strong pwdChecker = new Strong( pwdFile );

    System.out.println( pwdChecker );
  }
}
