/**
 * Created by Ronny Rosabal.
 * Date:      1/8/17
 * Objective:
 */
package chapter11;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Field;

public class TestScoresDemo {
  
  public static void main( String[] args ) throws IOException {
    
    //TODO: delete after testing
    String file = "src/chapter11/strong.dat";
    FileReader myFile = new FileReader( file );
    FileReader myFile2 = myFile.copy();
    FileReader myFile3 = new FileReader( myFile );
    System.out.println( myFile2.getFileName() );
    System.out.println( myFile3.getFileName() );
  }
  
}
