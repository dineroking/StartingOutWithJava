/**
 * Created by Ronny Rosabal.
 * Date:      5/25/2017
 * Objective: a basic window/frame
 */
package chapter12;

import javax.swing.*;                                   // for the Swing classes

public class ShowWindow extends JFrame {
  
  // VARIABLES
  
  final int WINDOW_WIDTH = 400;                      // the width of the window
  final int WINDOW_HEIGHT = 300;                     // the height of the window
  
  
  // CONSTRUCTOR
  
  public ShowWindow() {
    
    // CREATE WINDOW
    
    setTitle( "This is my special window." );  // sets the title of the window
    setSize( WINDOW_WIDTH, WINDOW_HEIGHT );    // sets the width and height of the window
    setDefaultCloseOperation( WindowConstants.EXIT_ON_CLOSE );  // what happens when the close button is clicked
    setVisible( true );
  }
  
  public static void main( String[] args ) {
    
    ShowWindow window = new ShowWindow();       // a new ShowWindow, which in reality is a new JFrame
    new ShowWindow();                           // same thing but is an anonymous ShowWindow
  }
}


