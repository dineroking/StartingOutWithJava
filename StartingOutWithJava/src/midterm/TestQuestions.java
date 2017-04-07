/**
 * Created by Ronny Rosabal.
 * Date:      3/25/17
 * Objective:
 */
package midterm;

import java.io.*;
import java.lang.reflect.Array;
import java.util.*;

public class TestQuestions {
  
  public static void main( String[] args ) throws IOException {
    
    System.out.println( fileList( "src/midterm/States.txt" ) );
    System.out.println( sort( fileList( "src/midterm/States.txt" ) ) );
    System.out.println( search( sort( fileList( "src/midterm/States.txt" ) ), "FL" ));
  }
  
  public static int gcd( int x, int y ) {
    
    if( x < y ) {
      gcd( y, x );
    }
    else if( x == 0 ) {
      return x;
    }
    else {
      return gcd( y, x % y );
    }
    
    return -1;
  }
  
  public static int count( String str, char c ) {
    
    if( str.length() == 0 ) {
      return 0;
    }else if( str.charAt( 0 ) == c ) {
      return 1 + count( str.substring( 1 ), c );
    }else {
      return count( str.substring( 1 ), c );
    }
  }
  
  public static ArrayList<String> fileList( String file ) {
    
    File input = null;
    Scanner read;
    ArrayList<String> states = new ArrayList<>();
    
    try {
      
      input = new File( file );
      read = new Scanner( input );
      
      try {
        
        while( read.hasNext() ) {
          states.add( read.next() );
        }
      } catch( InputMismatchException e ) {
        read.nextLine();
      }
      
    } catch( FileNotFoundException e ) {
      System.out.println( "File not found: " + input.getAbsolutePath() );
    }
    
    return states;
  }
  
  public static ArrayList<String> sort( ArrayList<String> list ) {
    
    int startScan;
    int index;
    int minIndex;
    String minValue;
    
    for( startScan = 0; startScan < (list.size() - 1 ); startScan++ ) {
      
      minIndex = startScan;
      minValue = list.get( startScan );
      
      for( index = startScan + 1; index < list.size(); index++ ) {
        
        if( list.get(index).compareTo( minValue ) < 0 ) {
          
          minValue = list.get( index );
          minIndex = index;
          
        }
      }
      
      list.set( minIndex, list.get( startScan ) );
      list.set( startScan, minValue);
    }
    
    return list;
  }
  
  public static int search( ArrayList<String> list, String value ) {
    return binarySearch( list, 0, list.size() - 1, value );
  }
  
  
  public static int binarySearch( ArrayList<String> list, int first, int last, String value ) {
    
    int middle;
    
    if( first > last ) {
      return -1;
    }
    
    middle = (first + last ) / 2;
    
    if( list.get( middle ).equals( value ) ) {
      return middle;
    } else if ( list.get( middle ).compareTo( value ) < 0 ) {
      return binarySearch( list, middle + 1, last, value );
    } else {
      return binarySearch( list, first, middle - 1, value );
    }
  }
}
