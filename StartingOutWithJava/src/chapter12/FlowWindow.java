/**
 * Created by Ronny Rosabal.
 * Date:      6/2/17
 * Objective: Practice layout managers.
 */
package chapter12;

import javax.swing.*;                               // for the Swing classes
import java.awt.*;                                  // for the FlowLayout class

public class FlowWindow extends JFrame {
  
  // VARIABLES
  
  private int windowWidth;
  private int windowHeight;
  JPanel panel;
  
  
  
  // CONSTRUCTORS
  
  public FlowWindow() {
    this( 300, 100 );
  }
  
  public FlowWindow( int width, int height ) {
    
    windowWidth = width;
    windowHeight = height;
    
    // create window
    setTitle( "Flow Manager" );                   // sets the title of the window
    setSize( windowWidth, windowHeight );         // sets the size of the window
    setDefaultCloseOperation( WindowConstants.EXIT_ON_CLOSE );    // sets the action to follow when for close button
    setLayout( new FlowLayout( FlowLayout.CENTER, 100, 0 ) );              // selects the layout manager to use
    buildPanel();                                 // creates the panel and its components
    add( panel );                                 // add the panel to the frame
    setVisible( true );                           // makes the window visible
    
  }
  
  private void buildPanel() {
    
    // create the panel
    panel = new JPanel(  );
    panel.setLayout( new BorderLayout(  ) );
    
    // create components
    JButton button1 = new JButton( "Button 1" );
    JButton button2 = new JButton( "Button 2" );
    JButton button3 = new JButton( "Button 3" );
    
    // add components to panel
    panel.add( button1, BorderLayout.NORTH );
    panel.add( button2, BorderLayout.SOUTH );
    panel.add( button3, BorderLayout.CENTER );
    
  }
  
  public static void main( String [] args ) {
    
    new FlowWindow(  );
    
  }
}
