/*
 * Ronny Rosabal
 * Programming Fundamentals III
 * COSC 2336 2801
 * 02.25.17
 * Demonstrates how different types of elements are sorted by using the SortTypes class
 */

package chapter18;
//package genericSort;

public class SortTypesDemo {
  
  public static void main( String[] args ) {
    
    String [] names = {"Ronny", "Christian", "Leslie"};
    Integer [] ints = {5, 1, 10, 6, 9};
    Double [] dbls = {2.3, 2.1, 1.1, 4.5, 8.1, 1.3};
    
    // names array before sort
    System.out.println( "Unsorted names: " + printer( names ) );
    // sort names array
    SortTypes.sort( names );
    // names array after sort
    System.out.println( "Sorted names: " + printer( names ) );
  
    // new line
    System.out.println("");
    
    // ints array before sort
    System.out.println( "Unsorted integers: " + printer( ints ) );
    // sort ints array
    SortTypes.sort( ints );
    // ints array after sort
    System.out.println( "Sorted integers: " + printer( ints ) );
    
    // new line
    System.out.println("");
    
    // dbls array before sort
    System.out.println( "Unsorted doubles: " + printer( dbls ) );
    // sort dbls array
    SortTypes.sort( dbls );
    // dbls array after sort
    System.out.println( "Sorted doubles: " + printer( dbls ) );
  }
  
  /**
   * printer prints the elements of an array lined up in the same line
   * @param list an array of elements to be printed
   * @param <E> the type of array
   * @return a String with all the elements printed side by side with a space between them.
   */
  public static <E> String printer( E[] list ) {
    String msg = "";
    for( E elem : list ) {
      msg += elem + " ";
    }
    return msg;
  }
}
