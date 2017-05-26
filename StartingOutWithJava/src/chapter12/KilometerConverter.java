/**
 * Created by Ronny Rosabal.
 * Date:      5/25/2017
 * Objective: for practicing the Swing classes
 */
package chapter12;

import javax.swing.*;                             // for all the swing classes

public class KilometerConverter extends JFrame {
  
  // VARIABLES
  
  private int width;                              // window width in pixels
  private int height;                             // window height in pixels
  private JPanel panel;                           // container to hold the components
  private JLabel label;                           // the label for the text input
  private JTextField kiloText;                    // the text field for the kilometers
  private JButton calcButton;                     // the button to convert the kilometers to miles
  
  
  // CONSTRUCTORS
  
  /**
   * KilometerConverter constructor initializes the window to a width of 400 and a height of 100
   */
  public KilometerConverter() {
    
    this( 400, 100 );
  }
  
  /**
   * KilometerConverter constructor creates the window and components of the window
   *
   * @param width  the width of the window in pixels
   * @param height the height of the window in pixels
   */
  public KilometerConverter( int width, int height ) {
    
    this.width = width;
    this.height = height;
    
    // CREATE WINDOW
    
    setSize( width, height );                               // set the width and height of the window
    setTitle( "The Kilometer Converter" );                  // set the title of the window
    setDefaultCloseOperation( WindowConstants.EXIT_ON_CLOSE );  // what happens when the close button is clicked
    
    buildPanel();                                           // create the panels and its components
    add( panel );                                           // add the panel to the frame
    setVisible( true );                                     // make the window visible
  }
  
  private void buildPanel() {
    // TODO: finish the method from the book and delete this comments afterwards
  }
  
  public static void main( String[] args ) {
    
    new KilometerConverter();
  }
}
