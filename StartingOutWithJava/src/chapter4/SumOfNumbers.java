package chapter4;

import com.sun.corba.se.impl.io.TypeMismatchException;

import javax.swing.JOptionPane;
import java.io.*;
import java.util.InputMismatchException;
import java.util.Scanner;

public class SumOfNumbers {
  
  public static void main( String[] args ) throws IOException {
    
    
    // VARIABLES
    
    String filePath;                           // holds the path of the file with the numbers
    File file = new File( "" );        // opens the file name that holds the numbers
    int input = 0;                             // holds each integer from the file
    String output = "";                        // holds the output to be presented to the user
    Scanner reader = new Scanner( "" ); // use to read from a file
    FileWriter fWriter;
    
    
    // USER INPUT
    
    
    filePath = "StartingOutWithJava/src/chapter4/numbers.txt";
    
    // open file
    try {
      file = new File( filePath );
      reader = new Scanner( file );
    }
    catch( FileNotFoundException e ) {
      JOptionPane.showMessageDialog( null, "Could not find file " + file.getAbsolutePath() );
    }
    
    // read each integer from file
    while( reader.hasNext() ){
      try {
        input = reader.nextInt();
        output += "\n" + numSequence( input );
      }catch( InputMismatchException e ) {
        System.out.println( "'" + reader.nextLine() + "' is not an integer." );
      }
    }
    
    
    
    // USER OUTPUT
    
    try {
      fWriter = new FileWriter( file, true );
      PrintWriter oFile = new PrintWriter( fWriter );
      oFile.println( output );
      oFile.close();
    }catch( FileNotFoundException e ) {
      JOptionPane.showMessageDialog( null, "Could not find file " + file.getAbsolutePath() );
    }
    
    System.out.println( output );
    reader.close();
  }
  
  // METHODS
  
  private static String numSequence( int number ) {
    if( number <= 0 ){
      return "0";
    }else{
      return number + " " + numSequence( number - 1 );
    }
  }
}
