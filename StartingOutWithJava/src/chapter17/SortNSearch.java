/*
 * Ronny Rosabal
 * Programming Fundamentals III
 * COSC 2336 2801
 * 02.17.17
 * Sets the blue print for sorting and searching an array of strings
 */

//TODO: comment out package chapter17 and comment in package names
package chapter17;
//package names;

public class SortNSearch {
  
  
  // VARIABLES
  
  
  
  // CONSTRUCTORS
  
  
  
  // GETTERS
  
  
  
  // SETTERS
  
  
  
  // METHODS
  
  // sorting
  
  /**
   * quickSort sorts in ascending order an array of integers
   * @param arr an array of integers
   */
  public static void quickSort( int[] arr ) {
    doQuickSort( arr, 0, arr.length - 1 );
  }
  
  /**
   * quickSort sorts in ascending order an array of Strings
   * @param arr an array of strings
   */
  public static void quickSort( String[] arr ) {
    doQuickSort( arr, 0, arr.length - 1);
  }
  
  /**
   * doQuickSort finds pivotPoint and sorts an array of integers
   * @param arr an array of integers
   * @param start the starting index of the array
   * @param end the ending index of the array
   */
  private static void doQuickSort( int[] arr, int start, int end ) {
    int pivotPoint;
    
    if( start < end ) {
      pivotPoint = partition( arr, start, end );
  
      // sort the first sublist
      doQuickSort( arr, start, pivotPoint - 1 );
  
      // sort the second sublist
      doQuickSort( arr, pivotPoint + 1, end );
    }
  }
  
  /**
   * doQuickSort finds the pivotPoint and sorts an array of Strings
   * @param arr an array of integers
   * @param start the starting index of the array
   * @param end the ending index of the array
   */
  private static void doQuickSort( String[] arr, int start, int end ) {
    int pivotPoint;
    
    if( start < end ) {
      pivotPoint = partition( arr, start, end );
      
      // sort the first sublist
      doQuickSort( arr, start, pivotPoint - 1 );
      
      // sort the second sublist
      doQuickSort( arr, pivotPoint + 1, end );
    }
  }
  
  /**
   * partition finds the pivotValue and compares values to split the array into two sublist
   * @param arr an array of integers
   * @param start the starting index of the array
   * @param end the ending index of the array
   * @return the pivotPoint of the array
   */
  private static int partition( int[] arr, int start, int end) {
    
    int pivotValue;
    int endOfLeftList;
    int midPoint;
    
    // find the index of the middle element
    midPoint = ( start + end ) / 2;
    
    swap( arr, start, midPoint );
    
    pivotValue = arr[start];
    
    endOfLeftList = start;
    
    for( int scan = start + 1; scan <= end; scan++ ) {
      if( arr[scan] < pivotValue ) {
        endOfLeftList++;
        swap( arr, endOfLeftList, scan );
      }
    }
    
    swap( arr, start, endOfLeftList );
    return endOfLeftList;
  }
  
  /**
   * partition finds the pivotValue and compares values to split the array into two sublist
   * @param arr an array of Strings
   * @param start the starting index of the array
   * @param end the ending index of the array
   * @return the pivotPoint of the array
   */
  private static int partition( String[] arr, int start, int end) {
    
    String pivotValue;
    int endOfLeftList;
    int midPoint;
    
    // find the index of the middle element
    midPoint = ( start + end ) / 2;
    
    swap( arr, start, midPoint );
    
    pivotValue = arr[start];
    
    endOfLeftList = start;
    
    for( int scan = start + 1; scan <= end; scan++ ) {
      if( arr[scan].compareTo( pivotValue ) < 0 ) {
        endOfLeftList++;
        swap( arr, endOfLeftList, scan );
      }
    }
    
    swap( arr, start, endOfLeftList );
    return endOfLeftList;
  }
  
  /**
   * swap exchanges two values of the arry
   * @param arr an array of integers
   * @param a the first value to be exchanged
   * @param b the second value to be exchanged
   */
  private static void swap( int[] arr, int a, int b ) {
    int temp;
    
    temp = arr[a];
    arr[a] = arr[b];
    arr[b] = temp;
    
  }
  
  /**
   * swap exchanges two values of the arry
   * @param arr an array of Strings
   * @param a the first value to be exchanged
   * @param b the second value to be exchanged
   */
  private static void swap( String[] arr, int a, int b ) {
    String temp;
    
    temp = arr[a];
    arr[a] = arr[b];
    arr[b] = temp;
    
  }
  
  // searching
  
  /**
   * binarySearch used to search for a string in an array of Strings
   * @param names an array of Strings
   * @param name the string to be searched for
   * @return -1 if not found or the index of the string if found
   */
  public static int binarySearch( String[] names, String name ) {
    
    return search( names, 0, names.length - 1, name );
  }
  
  /**
   * search does the search for a string in an array of Strings
   * @param str an array of Strings
   * @param start the starting index of the array of Strings
   * @param end the ending index of the array of Strings
   * @param elem the element to be found
   * @return -1 if the string is not found or the index if it was found
   */
  private static int search( String[] str, int start, int end, String elem ) {
    int midPoint;
    int found;
  
    midPoint = ( start + end ) / 2;
    found = -1;
    if( start <= end ) {
      if( str[midPoint].compareTo( elem ) == 0 ) {
        return midPoint;
      }else if ( str[midPoint].compareTo( elem ) > 0 ) {
        return search( str, start, midPoint - 1, elem );
      } else {
        return search( str, midPoint + 1, end, elem );
      }
      
    }
    return found;
  }
  
}
