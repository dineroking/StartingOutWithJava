/*
 * Ronny Rosabal
 * Programming Fundamentals III
 * COSC 2336 2801
 * 03.08.17
 * Demonstrate the LinkedList class
 */
package chapter20;

import java.io.IOException;
import java.util.ArrayList;

public class LinkedListDemo {
  
  public static void main( String[] args ) throws IOException {
    
    // VARIABLE DECLARATIONS
    
    String fName;                   // the path to the file
    NameReader fileReader;          // reads the file name
    ArrayList<String> names;        // an array list of names
    LinkedList<String> list;        // holds the linked list of names
    
    // TODO: update path to match your system
    fName = "src/chapter20/names.dat";
    fileReader = new NameReader( fName );
    names = fileReader.getNames();
    list = new LinkedList<>();
    
    // check to see if list is empty
    System.out.println( "Is linked list empty: " + list.isEmpty() );
    
    // check size of list before adding any elements
    System.out.println( "Size before adding elements: " + list.size() );
    
    // adding a couple of elements
    list.add( names.get( 0 ) );
    list.add( names.get( 1 ) );
    
    // check to see if list is empty
    System.out.println( "Is linked list empty: " + list.isEmpty() );
    
    // check size of list after adding any elements
    System.out.println( "Size after adding elements: " + list.size() );
    
    // print current linked list
    System.out.println( list.toString() );
    
    // add other elements to the front of list
    list.add( 0, names.get( 2 ) );
    
    // print current linked list
    System.out.println( "\n" + list.toString() );
    
    // remove the element in position 1
    list.remove( 1 );
    
    // print current linked list
    System.out.println( "\n" + list.toString() );
    
    // remove the name LINDA
    list.remove( "LINDA" );
    
    // print current linked list
    System.out.println( "\n" + list.toString() );
    
    // remove the element in position 0
    list.remove( 0 );
    
    // print current size of linked list
    System.out.println( "current size: " + list.size() );
    
    // add all elements into the linked list
    for( String elem : names ) {
      list.add( elem );
    }
    
    // print current linked list
    System.out.println( "\n" + list.toString() );
    
    // get element in a specific index
    System.out.println( "Element in index 1: " + list.get( 1 ) );
    
  }
  
}
