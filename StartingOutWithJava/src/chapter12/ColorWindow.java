/**
 * Created by Ronny Rosabal.
 * Date:      5/27/17
 * Objective: How to set the color of a background and the text of the labels
 */
package chapter12;

import javax.swing.*;                                 // for the Swing classes
import java.awt.*;                                    // for the Color class and event listener interface
import java.awt.event.*;                              // for the ActionListener interface

public class ColorWindow extends JFrame {
  
  // VARIABLES
  
  private int windowWidth;                            // the width of the window in pixels
  private int windowHeight;                           // the height of the window in pixels
  private JLabel messageLabel;                        // the message to be displayed
  private JButton redButton;                          // changes the color to red
  private JButton blueButton;                         // changes the color to blue
  private JButton yellowButton;                       // changes the color to yellow
  private JPanel panel;                               // the panel to hold the components
  
  
  
  // CONSTRUCTORS
  
  /**
   * ColorWindow creates the window, components and registers the event listeners to the buttons
   * @param width the width of the window in pixels
   * @param height the height of the window in pixels
   */
  public ColorWindow( int width, int height ) {
    
    windowWidth = width;
    windowHeight = height;
    
    // CREATE THE WINDOW, COMPONENTS AND REGISTER EVENTS
    
    // create window
    setTitle( "Colors" );                             // title of the window
    setSize( windowWidth, windowHeight );             // size of the window
    setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE);  // action when close button is clicked
    
    
    // create components
    buildPanel();
    add( panel );
    
    // register events
    redButton.addActionListener( new RedButtonListener() );
    blueButton.addActionListener( new BlueButtonListener() );
    yellowButton.addActionListener( new YellowButtonListener() );
    
    // make window visible
    setVisible( true );
  }
  
  // CREATE PANEL AND COMPONENTS
  
  /**
   * buildPanel creates the panel and all of its components
   */
  private void buildPanel() {
    
    // create panel
    panel = new JPanel(  );
    
    // create components
    messageLabel = new JLabel( "Click a button" + // message to be displayed
                               " to select a color." );
    redButton = new JButton( "Red" );            // Button to turn panel red
    blueButton = new JButton( "Blue" );          // Button to turn panel blue
    yellowButton = new JButton( "Yellow" );      // Button to turn panel yellow
    
    // color buttons text
    redButton.setForeground( Color.RED );
    blueButton.setForeground( Color.BLUE );
    yellowButton.setForeground( Color.YELLOW );
    
    // add components to the panel
    panel.add( messageLabel );
    panel.add( redButton );
    panel.add( blueButton );
    panel.add( yellowButton );
    
  }
  
  /**
   * RedButtonListener creates a listener for when the red button is clicked
   */
  private class RedButtonListener implements ActionListener {
  
    @Override
    public void actionPerformed( ActionEvent e ) {
      
      panel.setBackground( Color.RED );              // sets the panel color to red
      messageLabel.setForeground( Color.BLUE );      // sets the label color to blue
      
    }
  }
  
  /**
   * BlueButtonListener creates a listener for when the blue button is clicked
   */
  private class BlueButtonListener implements ActionListener {
    
    @Override
    public void actionPerformed( ActionEvent e ) {
      
      panel.setBackground( Color.BLUE );              // sets the panel color to blue
      messageLabel.setForeground( Color.YELLOW );     // sets the label color to yellow
      
    }
  }
  
  /**
   * YellowButtonListener creates a listener fo when the yellow button is clicked
   */
  private class YellowButtonListener implements ActionListener {
    
    @Override
    public void actionPerformed( ActionEvent e ) {
      
      panel.setBackground( Color.YELLOW );            // sets the panel color to yellow
      
    }
  }
  
  public static void main( String [] args ) {
    
    new ColorWindow( 400, 200 );
    
  }
  
}
