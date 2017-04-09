/*
 * Ronny Rosabal
 * Programming Fundamentals III
 * COSC 2336 2801
 * 04.07.17
 * Sets the blue print for reading a file
 */

package chapter21;

import java.io.*;                           // for file and IOExceptions
import java.util.*;                         // for reading from the file

public class FileReader {
  
  // VARIABLES
  
  private File inputFile = null;            // file to be read provided by the user
  private Scanner reader = null;            // reads from the file
  private int charsCounter;                 // counts the number of characters or words in the file
  private ArrayList<String> list;           // list of inputs
  
  
  // CONSTRUCTORS
  
  /**
   * FileReader() opens the file and reads its content into a String list
   *
   * @param fileName the name of the file to be opened
   * @throws IOException for the FileNotFoundException
   */
  public FileReader( String fileName ) throws IOException {
    
    charsCounter = 0;                       // initialize character/string counter to 0
    
    try {
      
      inputFile = new File( fileName );     // open file
      reader = new Scanner( inputFile );    // initialize reader with opened file
      
    }
    catch( FileNotFoundException e ) {
      System.out.println( e.getMessage() + ": " + inputFile.getAbsolutePath() );
    }
  }
  
  
  // ACCESSORS
  
  /**
   * getCharsCounter
   *
   * @return
   */
  public int getCharsCounter() {
    
    return charsCounter;
  }
  
  public ArrayList<String> getList() {
    
    return list;
  }
  
  
  // METHODS
  
  public String getChar() {
    
    String item = "";
    try {
      
      if( reader.hasNext() ) {
        item = reader.next();
      } else {
        item = "eof";
      }
    }
    catch( InputMismatchException e ) {
      item = String.valueOf( reader.next() );  // if the char read is not a string convert it to a string
    }
    
    return item;
  }
  
  
}
