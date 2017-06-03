/**
 * Created by Ronny Rosabal.
 * Date:      6/3/17
 * Objective: For practicing the GridLayout manager
 */
package chapter12;

import javax.swing.*;
import java.awt.*;

public class GridWindow extends JFrame {
  
  // VARIABLES
  
  private int windowWidth;
  private int windowHeight;
  private int numberRows;
  private int numberColumns;
  
  
  
  // CONSTRUCTORS
  
  public GridWindow() {
    
    this( 400, 300, 2, 3 );
    
  }
  
  public GridWindow( int width, int height, int rows, int columns ) {
    
    windowWidth = width;
    windowHeight = height;
    numberRows = rows;
    numberColumns = columns;
    
    // create window
    setTitle( "Grid Layout" );
    setSize( windowWidth, windowHeight );
    setDefaultCloseOperation( WindowConstants.EXIT_ON_CLOSE );
    setLayout( new GridLayout( numberRows, numberColumns ) );
    
    // create the buttons
    
    JButton button1 = new JButton( "button1" );
    JButton button2 = new JButton( "button2" );
    JButton button3 = new JButton( "button3" );
    JButton button4 = new JButton( "button4" );
    JButton button5 = new JButton( "button5" );
    JButton button6 = new JButton( "button6" );
  
    // add buttons to the content pane
    add( button1 );                   // row 1 column 1
    add( button2 );                   // row 1 column 2
    add( button3 );                   // row 1 column 3
    add( button4 );                   // row 2 column 1
    add( button5 );                   // row 2 column 2
    add( button6 );                   // row 2 column 3
  
    // make window visible
    setVisible( true );
  }
  
  public static void main( String [] args ) {
  
    new GridWindow(  );
  }
}
