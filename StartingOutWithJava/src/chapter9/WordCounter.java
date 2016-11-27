package chapter9;

/**
 * Created by ronnyrosabal on 11/22/16.
 */

import javax.swing.JOptionPane;

public class WordCounter {

  public static void main( String[] main ){

    // this is some comment

    /*
    this is another comment
     */

    String input;
    String output;

    input = JOptionPane.showInputDialog( null, "Please enter a sentence." );
    output = String.valueOf( wordCounter( input ) );

    System.out.println( "Number of words: " + output );

    System.exit( 0 );

  }

  public static int wordCounter( String str ){
    return str.trim().split( " " ).length;
  }
}
