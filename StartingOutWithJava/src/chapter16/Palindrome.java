/*
 * Ronny Rosabal
 * Programming Fundamentals III
 * COSC 2336 2801
 * 02.05.17
 * Sets the blue print for the Palindrome class
 */

package chapter16;

//package palindromes

public class Palindrome {
  
  /**
   * isPalindrome tests whether a given string is a palindrome, that is that it is spelled the same forward or backwards
   * @param str the string to be tested
   * @return true if the string is a palindrome or false otherwise
   */
  public static boolean isPalindrome( String str ) {
    
    // compares the given string against its reversed spelling and returns a boolean
    return str.equals( stringReverser( str, 0, str.length() - 1 ) );
  }
  
  /**
   * stringReverser reverses a given string
   * @param str the string to be reversed
   * @param startIndex the starting index, the first call typically 0
   * @param endIndex the ending index, the first call typically the last index of the string
   * @return a reversed string
   */
  public static String stringReverser( String str, int startIndex, int endIndex ) {
    
    // in cases of an even length string
    if( startIndex > endIndex ) {
      return "";
    }
    // in cases of odd length string
    else if( startIndex == endIndex ) {
      return str.charAt( startIndex ) + "";
    }
    // otherwise flip the characters
    else {
      return str.charAt( endIndex ) + stringReverser( str, startIndex + 1, endIndex - 1 ) + str.charAt( startIndex );
    }
  }
}
