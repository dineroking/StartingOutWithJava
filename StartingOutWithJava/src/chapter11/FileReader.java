/**
 * Created by Ronny Rosabal.
 * Date:      1/8/17
 * Objective:
 */
package chapter11;

import com.sun.codemodel.internal.JOp;

import java.util.ArrayList;
import java.io.*;
import java.util.InputMismatchException;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class FileReader {
  
  // VARIABLES
  
  private String fileName;
  private File input;
  private ArrayList<String> fileContent = new ArrayList<String>();
  private static int instances = 0;
  
  
  
  // CONSTRUCTORS
  
  /**
   * FileReader initializes the file name, input and fileContent variables
   * @param fileName the name of the file to be used
   * @throws IOException throws the FileNotFound exception if it cant find the file.
   */
  public FileReader( String fileName ) throws IOException {
    
    try {
      
      // open the file
      input = new File( fileName );
      
      // create Scanner object for file reading.
      Scanner fileInput = new Scanner( input );
      
      // store the name of the file
      this.fileName = fileName;
      
      // add to the number of class instances
      instances++;
      
      try {
        
        // add the content of the file to fileContent
        while( fileInput.hasNext() ) {
          fileContent.add( fileInput.next() );
        }
        
      } catch( InputMismatchException e ) {
        JOptionPane.showMessageDialog( null, "Input not a string." );
      }
      
      
      // close the file
      fileInput.close();
      
    } catch( FileNotFoundException e ) {
      
      // create message to display if exception is thrown
      String message = "The file provided was not found.";
      message += "\nPath: " + input.getAbsolutePath();;
      JOptionPane.showMessageDialog( null, message );
    }
    
  }
  
  public FileReader( FileReader fileReader ) throws IOException {
    this.fileName = fileReader.getFileName();
    this.fileContent = new ArrayList<>( fileReader.getFileContent() );
  }
  
  
  
  // ACCESSORS
  
  /**
   * getFileName returns the name of the file
   * @return name of the file
   */
  public String getFileName() {
    
    return fileName;
    
  }
  
  /**
   * getFileContent returns an array with the content of fileContent
   * @return the contents of fileContent
   */
  public ArrayList<String> getFileContent() {
    
    return new ArrayList<>( fileContent );
    
  }
  
  /**
   * getInstances returns the number of times the class has been instantiated
   * @return number of times of the class has been instantiated
   */
  public static int getInstances() {
    
    return instances;
  }
  
  
  // MUTATORS
  
  /**
   * setFileName sets the fileName
   * @param fileName the name of the file to be passed
   */
  public void setFileName( String fileName ) {
    
    this.fileName = fileName;
    
  }
  
  /**
   * setFileContent sets the contents of fileContent
   * @param fileContent the content of the file
   */
  public void setFileContent( ArrayList<String> fileContent ) {
    
    this.fileContent = new ArrayList<>( fileContent );
    
  }
  
  
  // METHODS
  
  public FileReader copy() throws IOException{
    return new FileReader( this.fileName );
  }
  
  public boolean equals( FileReader fileReader ) {
    
    // assumes objects are not equal
    boolean areEqual = false;
    
    // compare the values of the two objects
    if( fileName.equals( fileReader.fileName ) && fileContent.equals( fileReader.fileContent ) ) {
      
      // if they are equal assign true to areEqual
      areEqual = true;
    }
    return areEqual;
  }
  
  public String toString(){
    String message = "File name: " + fileName;
    message += "\nFile contents: " + fileContent;
    return message;
  }
  
}
