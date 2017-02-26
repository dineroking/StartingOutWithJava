/*
 * Ronny Rosabal
 * Programming Fundamentals III
 * COSC 2336 2801
 * 02.25.17
 * Sets the blue print for sorting arrays of Objects that implement Comparable
 */
package chapter18;

public class SortTypes {
  
  // METHODS
  
  /**
   * sort sorts all the elements of an array in ascending order
   * @param list an array to be sorted
   * @param <T> a Type that implements the Comparable interface
   */
  public static <T extends Comparable<T>> void sort( T[] list ) {
    quickSort( list, 0, list.length - 1 );
  }
  
  /**
   * quickSort sorts all the elements of an array in ascending order
   * @param list an array to be sorted
   * @param start the starting index of the array
   * @param end the ending index of the array
   * @param <T> a Type that implements the Comparable interface
   */
  private static <T extends Comparable<T>> void quickSort( T[] list, int start, int end ) {
    int pivotPoint;
    
    if( start < end ) {
      pivotPoint = partition( list, start, end );
      
      // sort the first sublist
      quickSort( list, start, pivotPoint - 1 );
      
      // sort the second sublist
      quickSort( list, pivotPoint + 1, end );
    }
  }
  
  /**
   * partition finds the middle point of the array being searched
   * @param list an array to be sorted
   * @param start the starting index of the array
   * @param end the ending index of the array
   * @param <E> an element type that implements the Comparable interface
   * @return the pivotPoint of the array
   */
  private static <E extends Comparable<E>> int partition( E[] list, int start, int end) {
    
    E pivotValue;
    int endOfLeftList;
    int midPoint;
    
    // find the index of the middle element
    midPoint = ( start + end ) / 2;
    
    swap( list, start, midPoint );
    
    pivotValue = list[start];
    
    endOfLeftList = start;
    
    for( int scan = start + 1; scan <= end; scan++ ) {
      if( list[scan].compareTo( pivotValue ) < 0 ) {
        endOfLeftList++;
        swap( list, endOfLeftList, scan );
      }
    }
    
    swap( list, start, endOfLeftList );
    return endOfLeftList;
  }
  
  /**
   * swap swaps two elements
   * @param list the array from which the elements are swapped
   * @param a element to be swapped
   * @param b element to be swapped
   * @param <T> Type of array
   */
  private static <T> void swap( T[] list, int a, int b ) {
    T temp;
    
    temp = list[a];
    list[a] = list[b];
    list[b] = temp;
    
  }
  
}
