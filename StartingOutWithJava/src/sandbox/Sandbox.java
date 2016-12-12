package sandbox;

import java.util.StringTokenizer;
import java.text.DecimalFormat;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

public class Sandbox {

	public static void main(String[] args) {
		
		/*String string1 = "This is a string";
		String string2 = "305-343-8007";
		String string3 = "305.343.8007";
		String string4 = "305 343.8007";
		String string5 = " (305)-343.8007 ";

		String[] splitted1 = string1.split( " |-");
    String[] splitted2 = string2.split( " |-");
    String[] splitted3 = string3.split( " |-|\\.");
    String[] splitted4 = string4.split( " |-|\\.");
    String[] splitted5 = string5.split( "[\\s()-.]+");

    for( String token : splitted5 ){
      if( token == "" ){

      }else{

      }
      System.out.println("*" + token + "*");
    }
		System.out.println( splitted5.length );*/

		// RECURSION EXERCISES

    // 1.

    System.out.println( "1. " + recurs( 4 ) );

    // 2.

    System.out.println( "2. " + tries( 1 ) );

    // 3.

    System.out.println( "3. " + tries( 6 ) );

    // 4.

    System.out.println( "4. " + wow( 2 ) );

    // 5.

    System.out.println( "5. " + wow( -5 ));

    // 6.

    System.out.println( "6. " + roses( 5 ));

    // 7.

    System.out.println( "7. " + roses( 0 ) );

    // 8.

    System.out.println( "8. " + rec( "abcdef" ) );

    // 9.

    System.out.println( "9. " + rec( "" ));

    // 10.

    System.out.println( "10. " + factorial( 9 ) );

    // 11.

    System.out.println( "11. " + factorial( 0 ) );

    // 12.

    System.out.println();


	}

	// RECURSION EXERCISES

  // 1.

  public static int recurs( int n ){

	  int results = 0;
    if( n <= 3 ){
      results = 2;
    }
    else {
      return recurs( n - 2 ) + ( n - 2 );
    }
    return results;
  }

  // 2, 3.

  public static int tries( int n ){
    if( n == 1 || n == 2 ){
      return 2 * n;
    }
    else{
      return tries( n - 1 ) + tries( n - 2 );
    }
  }

  // 4, 5.

  private static int wow( int n ){
    if( n < 10 ){
      return n + wow( n + 2 );
    }
    else{
      return 1;
    }
  }

  // 6, 7.
  private static int roses( int n ){
    if( n == 0 ){
      return 1;
    }
    else if( n % 2 != 0 ){
      return roses( n - 1 ) + n;
    }

    return roses( n - 2 ) + n;
  }

  // 8, 9.

  private static String rec( String s ){

    if( s == null || s.length() == 0 ){
      return "";
    }

    return ( s.charAt( s.length() - 1 ) + rec( s.substring( 0, s.length() / 2 ) ) );
  }

  // 10, 11.

  private static int factorial( int n ){
    if( n == 0 ){
      return 1;
    }
    return n * factorial( n - 1 );
  }
}
