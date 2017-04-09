/*
 * Ronny Rosabal
 * Programming Fundamentals III
 * COSC 2336 2801
 * 04.08.17
 * Test file for the Stack and Queue Classes
 */

// TODO: comment out package chapter21
package chapter21;

// TODO: comment in package stacksAndQueues
//package stacksAndQueues;

import java.io.IOException;

public class StackQueueDemo {
  
  public static void main( String[] args ) throws IOException{
    
    // TODO: change path to match your system
    String file = "E:/Web Development/Projects/StartingOutWithJava/StartingOutWithJava/src/chapter21/testFile.txt";
    FileReader test = new FileReader( file );
    
    System.out.println( test.getChar() );
    System.out.println( test.getChar() );
    System.out.println( test.getChar() );
    System.out.println( test.getChar() );
    System.out.println( test.getChar() );
    System.out.println( test.getChar() );
    System.out.println( test.getChar() );
    System.out.println( test.getChar() );
    System.out.println( test.getChar() );
    System.out.println( test.getChar() );
    
  }
  
}
