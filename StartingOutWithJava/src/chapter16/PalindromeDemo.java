/*
 * Ronny Rosabal
 * Programming Fundamentals III
 * COSC 2336 2801
 * 02.05.17
 * Tests the isPalindrome function from the Palindrome class
 */
package chapter16;

//package palindromes

public class PalindromeDemo {
  
  public static void main( String[] args ){
    
    // TEST VARIABLES
    String original = "airport";                // the string to be tested
    String reversed;                            // the original string reversed - only for testing
    boolean isPalindrome;                       // holds true if string is a palindrome or false otherwise
    
    
    // ASSIGNMENT VARIABLE
    String [] testStrings = { "one", "two", "test", "asereresa" };
    
    // TESTING FUNCTIONS
    // testing the stringReverser function, endIndex argument must be updated to show last index of the string
    // stringReverser could be used on its own but otherwise could be set to private
    reversed = Palindrome.stringReverser( original, 0, original.length() - 1 );
    isPalindrome = Palindrome.isPalindrome( original );
    
    System.out.println( reversed );
    System.out.println( isPalindrome );
    System.out.println( "~~END OF TEST~~" );
    
    // ASSIGNMENT CALL
    test( testStrings );
  }
  
  /**
   * test tests each string in an array of string for palindrome
   * @param testStrings the array of strings
   */
  public static void test( String [] testStrings ){
    for( int i = 0; i < testStrings.length; i++ ) {
      if( Palindrome.isPalindrome( testStrings[i] ) ){
        System.out.println( testStrings[i] + " is a palindrome.");
      }
      else {
        System.out.println( testStrings[i] + " is not palindrome." );
      }
    }
  }
  
}
