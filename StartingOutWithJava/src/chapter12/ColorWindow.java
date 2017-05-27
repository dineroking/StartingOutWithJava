/**
 * Created by Ronny Rosabal.
 * Date:      5/27/17
 * Objective: How to set the color of a background and the text of the labels
 */
package chapter12;

import javax.swing.*;                                 // for the Swing classes
import java.awt.*;                                    // for the Color class and event listener interface

public class ColorWindow extends JFrame {
  
  // VARIABLES
  
  private int windowWidth;                            // the width of the window in pixels
  private int windowHeight;                           // the height of the window in pixels
  private JLabel messageLabel;                        // the message to be displayed
  private JButton redButton;                          // changes the color to red
  private JButton blueButton;                         // changes the color to blue
  private JButton yellowButton;                       // changes the color to yellow
  private JPanel panel;                               // the panel
  
  
  
  // CONSTRUCTORS
  
  public ColorWindow( ) {
    
    // CREATE THE WINDOW
    
    setTitle( "Colors" );
    setSize( windowWidth, windowHeight );
    setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE);
    messageLabel = new JLabel( "Click a button" +
                               " to select a color." );
    
  }
  
}
