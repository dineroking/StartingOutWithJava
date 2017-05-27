/**
 * Created by Ronny Rosabal.
 * Date:      5/25/2017
 * Objective: for practicing the Swing classes
 */
package chapter12;

import javax.swing.*;                             // for all the swing classes
import java.awt.event.*;                          // for event classes
import java.awt.*;                                // For the Color class

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
    
    label = new JLabel( "Enter a distance " +
                        "in kilometers" );                  // creates a label for user entry
    
    kiloText = new JTextField( 10 );               // text field with number of spaces
    
    calcButton = new JButton( "Calculate" );          // button to calculate the conversion
    
    calcButton.addActionListener( new ButtonListener() );  // register the event
    calcButton.setForeground( Color.red );                 // set the text of the button to red
    
    panel = new JPanel();                                  // create the empty panel
    
    // add components to the panel
    panel.add( label );
    panel.add( kiloText );
    panel.add( calcButton );
    
  }
  
  private class ButtonListener implements ActionListener {
  
    /**
     * actionPerformed handles a click to the Calculate button
     * @param e the event of
     */
    public void actionPerformed( ActionEvent e ) {
      
      final double CONVERSION = 0.6214;
      String input;
      double miles;
      
      input = kiloText.getText();
      
      try {
        
        miles = Double.parseDouble( input ) * CONVERSION;
        JOptionPane.showMessageDialog( null, input + " kilometers is " +
                                             miles + " miles." );
        
      }
      catch( NullPointerException o ) {
        
        kiloText.setText( "Empty" );
        
      }
      catch( NumberFormatException o ) {
        
        kiloText.setText( "Error" );
        
      }
      
    }
  }
  
  public static void main( String[] args ) {
    
    new KilometerConverter();
  }
}
