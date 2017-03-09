/*
 * Ronny Rosabal
 * Programming Fundamentals III
 * COSC 2336 2801
 * 02.17.17
 * Sets the blue print for reading the names from a binary file
 */

//TODO: comment out package chapter17 and comment in package names
package chapter17;
//package names;

import java.io.*;                                         // used for FileInputStream, DataInputStream, and Exceptions
import java.util.*;                                       // used for ArrayList

public class NameReader {
  
  // VARIABLES
  
  private FileInputStream file = null;                              // opens the binary file to be read
  private DataInputStream inputFile = null;                        // reads the binary file
  private ArrayList<String> names = new ArrayList<String>();            // holds the list of names
  
  
  
  // CONSTRUCTORS
  
  /**
   * NameReader initializes the value for the file and reads the file into inputFile
   * @param filename the name of the file to be opened
   * @throws IOException throws exception if the file is not found and if the end of file is not found
   */
  public NameReader( String filename ) throws IOException {
    
    boolean endOfFile = false;
    try {
      file = new FileInputStream( filename );
      inputFile = new DataInputStream( file );
      while( !endOfFile ){
        try {
          names.add( inputFile.readUTF() );
        }  catch( EOFException e ) {
          endOfFile = true;
        }
      }
    } catch( FileNotFoundException e ) {
      System.out.println( e.getMessage() );
    } finally {
      file.close();
    }
    
  }
  
  
  // ACCESSORS
  
  /**
   * getNames returns a new ArrayList with the names
   * @return
   */
  public ArrayList<String> getNames() {
    
    return new ArrayList<>( names );
  }
  
  
  // MUTATORS
  
  
  // METHODS
  
}
