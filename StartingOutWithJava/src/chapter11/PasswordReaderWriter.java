/*
 * Ronny Rosabal
 * Programming Fundamentals II
 * COSC 1337 2001
 * 12.10.16
 * Establishes the blueprint for creating a PasswordReaderWriter object
 */
package chapter11;

import java.io.*;             // import file classes
import java.util.ArrayList;
import javax.swing.JOptionPane;
import java.util.Scanner;

public class PasswordReaderWriter {
  
  // VARIABLES
  
  private File input;                                        // The file input from the user
  private String fileName;                                        // name of the file
  private ArrayList<String> passwords = new ArrayList<String>();  // array of untested password Strings
  
  
  // CONSTRUCTORS
  
  /**
   * PasswordReaderWriter takes a file and converts the input into an array of String passwords
   *
   * @param fileName the file that contains the password
   * @throws IOException throws an input, output exception
   */
  public PasswordReaderWriter( String fileName ) throws IOException {
    
    try {
      
      // open the file
      input = new File( fileName );
      
      // assign fileName to the string fileName
      this.fileName = fileName;
      
      // create the file reader
      Scanner file = new Scanner( input );
      
      // while there is another password to read
      while( file.hasNext() ) {
        
        // read the password and assign it to an array of Strings
        passwords.add( file.next() );
        
      }
      
      // close the file
      file.close();
    }
    catch( FileNotFoundException e ) {
      
      // creates the error message to show the user
      String message = "File entered was not found.";
      message += "\nPlease check the path:";
      message += "\n" + input.getAbsolutePath();
      
      JOptionPane.showMessageDialog( null, message );
      
    }
    
  }
  
  /**
   * PasswordReaderWriter copies a PasswordReaderWriter object
   *
   * @param object a PasswordReaderWriter object
   */
  public PasswordReaderWriter( PasswordReaderWriter object ) {
    
    this.fileName = object.fileName;
    this.passwords = new ArrayList<String>( object.passwords );
  }
  
  
  // ACCESSORS
  
  /**
   * getFileName return the name of the file
   *
   * @return the name of the file
   */
  public String getFileName() {
    
    return fileName;
  }
  
  /**
   * getPasswords returns an ArrayList of strings containing the passwords
   *
   * @return an ArrayList with all the passwords
   */
  public ArrayList<String> getPasswords() {
    
    return new ArrayList<String>( passwords );
    
  }
  
  
  // MUTATORS
  
  public void setPasswords( String fileName ) throws IOException {
    
    try {
      
      // open the file
      input = new File( fileName );
      
      this.fileName = fileName;
      
      // create the file reader
      Scanner file = new Scanner( input );
      
      // while there is another password to read
      while( file.hasNext() ) {
        
        // read the password and assign it to an array of Strings
        passwords.add( file.next() );
        
      }
      
      // close the file
      file.close();
    }
    catch( FileNotFoundException e ) {
      
      // creates the error message to show the user
      String message = "File entered was not found.";
      message += "\nPlease check the path:";
      message += "\n" + input.getAbsolutePath();
      JOptionPane.showMessageDialog( null, message );
      
    }
    
  }
  
  
  // METHODS
  
  /**
   * copy return a copy of the PasswordReaderWriter object
   *
   * @return a PasswordReaderWriter object
   *
   * @throws IOException needed for file input or output
   */
  public PasswordReaderWriter copy() throws IOException {
    
    return new PasswordReaderWriter( fileName );
  }
  
  /**
   * equals compares two PasswordReaderWriter objects and returns true if their values are equal or fasle otherwise
   *
   * @param object a PasswordReaderWriter object
   * @return true if they are equal or false if they are not
   */
  public boolean equals( PasswordReaderWriter object ) {
    
    // assumes both objects are not equal
    boolean isEqual = false;
    
    // compare the values of two objects
    if( fileName.equals( object.fileName ) &&
        passwords.equals( object.getPasswords() ) ) {
      
      // if they are equal change isEqual to true
      isEqual = true;
      
    }
    
    // return isEqual
    return isEqual;
  }
  
  
  // OUTPUT
  
  /**
   * toString formats a message and returns it to the user
   *
   * @return a formatted message
   */
  @Override
  public String toString() {
    
    // initialize the message to be returned
    String message;
    message = "File name: " + fileName;
    message += "\nPasswords: " + passwords.toString();
    
    // return the formatted message
    return message;
  }
  
}
