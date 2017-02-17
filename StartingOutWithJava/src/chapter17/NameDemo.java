/*
 * Ronny Rosabal
 * Programming Fundamentals III
 * COSC 2336 2801
 * 02.05.17
 * Sets the blue print for the Palindrome class
 */

//TODO: comment out package chapter17 and comment in package names
package chapter17;
//package names;

import java.io.IOException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class NameDemo {
  
  public static void main( String[] args ) throws IOException {
    
    //TODO: update file path to match your system configuration
    String namesFile = "StartingOutWithJava/src/chapter17/names.dat";     // the path of the file
    NameReader fNames = new NameReader( namesFile );                      // holds a NameReader object
    String[] names = new String[fNames.getNames().size()];                // array to hold names in the list
    String searchName;                                                    // the name to be searched for
    
    // converts the strings from an arraylist into an array
    convert( names, fNames.getNames() );
    
    // print original array of names
    System.out.println( printer( names ) );
    
    // sort array of names
    SortNSearch.quickSort( names );
    
    // print sorted array of names
    System.out.println( printer( names ) );
    
    // gets name to be searched
    searchName = JOptionPane.showInputDialog( null, "Enter name to be searched." ).toUpperCase();
    
    // prints message if searchName is found or not
    if( SortNSearch.binarySearch( names, searchName ) < 0 ) {
      JOptionPane.showMessageDialog( null, searchName + " is not on the list." );
    } else {
      JOptionPane.showMessageDialog( null, searchName + " is on the list." );
    }
    
  }
  
  /**
   * convert converts the ArrayList list into a regular array
   * @param arr the array to hold the converted list
   * @param arrList the ArrayList to be converted into an array
   */
  public static void convert( String[] arr, ArrayList<String> arrList ) {
    
    for( int i = 0; i < arr.length; i++ ) {
      arr[i] = arrList.get( i );
    }
  }
  
  /**
   * printer prints the entire list as a single string
   * @param nam the array to be printed
   * @return the string to be printed
   */
  public static String printer( String[] nam ) {
    
    String msg = "";
    for( String elem : nam ) {
      msg += elem + " ";
    }
    return msg;
  }
  
}
