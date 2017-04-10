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
    list = new ArrayList<>(  );
    
    try {
      
      inputFile = new File( fileName );     // open file
      reader = new Scanner( inputFile );    // initialize reader with opened file
      
      try {
        
        while( reader.hasNext() ) {
          
          charsCounter++;
          list.add( reader.next() );
        }
      } catch( InputMismatchException e ) {
        list.add( String.valueOf( reader.next() ) );
      }
      
    }
    catch( FileNotFoundException e ) {
      System.out.println( e.getMessage() + ": " + inputFile.getAbsolutePath() );
    }
  }
  
  
  // ACCESSORS
  
  /**
   * getCharsCounter() gets the number of characters/strings in the file
   *
   * @return the number of characters in the file
   */
  public int getCharsCounter() {
    
    return charsCounter;
  }
  
  /**
   * getList() get the ArrayList list
   * @return the ArrayList list
   */
  public ArrayList<String> getList() {
    
    return new ArrayList<>( list );
  }
  
  
  // METHODS
  
  /**
   * getChar() returns a single character from the ArrayList
   * @param index index which character/string should be returned
   * @return a specified character/string
   */
  public String getChar( int index ) {
    return list.get( index );
  }
  
  
}
