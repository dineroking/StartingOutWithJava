/**
 * Created by Ronny Rosabal.
 * Date:      6/4/2017
 * Objective: For practicing with the JRadioButton
 */
package chapter12;

import javax.swing.*;                                    // for the Swing classes
import java.awt.*;                                       // for
import java.awt.event.*;                                 // for event handling classes

public class MetricConverter extends JFrame {
  
  // VARIABLES
  
  final int WINDOW_WIDTH = 400;                          // the width of the window
  final int WINDOW_HEIGHT = 200;                         // the height of the window
  ButtonGroup radioButtons;                              // group that keeps the radio buttons together
  JRadioButton miles;                                    // radio button for converting into miles
  JRadioButton feet;                                     // radio button for converting into feet
  JRadioButton inches;                                   // radio button for converting into inches
  JPanel panel;                                          // panel to hold label and buttons components
  JLabel message;                                        // label for user input
  JTextField inputText;                                  // text field for the user to enter input
  JCheckBox red;                                         // check box for the color red
  JCheckBox green;                                       // check box for the color green
  JCheckBox blue;                                        // check box for the color blue
  
  
  // CONSTRUCTORS
  
  public MetricConverter() {
    
    // create the window
    setSize( WINDOW_WIDTH, WINDOW_HEIGHT );
    setTitle( "Metric Converter" );
    setDefaultCloseOperation( WindowConstants.EXIT_ON_CLOSE );
    
    // create panel
    panel = new JPanel();
    
    // create buttons
    radioButtons = new ButtonGroup();
    miles = new JRadioButton( "Convert to miles", true );
    feet = new JRadioButton( "Convert to feet" );
    inches = new JRadioButton( "Convert to inches" );
    
    // create check boxes
    red = new JCheckBox( "red" );
    green = new JCheckBox( "green" );
    blue = new JCheckBox( "blue" );
    
    // groups radio buttons
    radioButtons.add( miles );
    radioButtons.add( feet );
    radioButtons.add( inches );
    
    // register listener to radio buttons
    miles.addActionListener( new RadioButtonListener() );
    feet.addActionListener( new RadioButtonListener() );
    inches.addActionListener( new RadioButtonListener() );
    
    // register listener to check buttons
    red.addItemListener( new CheckBoxListener() );
    green.addItemListener( new CheckBoxListener() );
    blue.addItemListener( new CheckBoxListener() );
    
    // create label and text field
    message = new JLabel( "Enter a distane in kilometers" );
    inputText = new JTextField( "0.0", 10 );
    
    // add components to panel
    panel.add( message );
    panel.add( inputText );
    panel.add( miles );
    panel.add( feet );
    panel.add( inches );
    panel.add( red );
    panel.add( green );
    panel.add( blue );
    
    // adds panel to content pane
    add( panel );
    
    setVisible( true );
    
  }
  
  // EVENT HANDLERS
  
  private class RadioButtonListener implements ActionListener {
    
    public void actionPerformed( ActionEvent e ) {
      
      String input;                   // holds the input from the user
      String convertTo = "";          // the units we are converting to
      double result = 0.0;            // holds the conversion
      
      // get the user input
      input = inputText.getText();
      
      try {
        
        if( e.getSource() == miles ) {
          
          // convert to miles
          convertTo = " miles.";
          result = Double.parseDouble( input ) * .6214;
          
        } else if( e.getSource() == feet ) {
          
          // convert to feet
          convertTo = " feet.";
          result = Double.parseDouble( input ) * 3281.0;
          
        } else if( e.getSource() == inches ) {
          
          // convert to inches
          convertTo = " inches.";
          result = Double.parseDouble( input ) * 39370.0;
          
        }
        
        // display the conversion
        JOptionPane.showMessageDialog( null, input +
                                             " kilometers is " + result + convertTo );
        
      }
      catch( NumberFormatException o ) {
        
        // handle a user entering something other than a number
        JOptionPane.showMessageDialog( null, "You did not enter a number." );
      }
      
    }
  }
  
  private class CheckBoxListener implements ItemListener {
    
    public void itemStateChanged( ItemEvent e ) {
    
      // determine which box was clicked
      if( e.getSource() == red ) {
        
        if( red.isSelected() ) {
          panel.setBackground( Color.RED );
        } else {
          panel.setBackground( Color.LIGHT_GRAY );
        }
        
      } else if( e.getSource() == green ) {
  
        if( green.isSelected() ) {
          panel.setBackground( Color.GREEN );
        } else {
          panel.setBackground( Color.LIGHT_GRAY );
        }
        
      } else if( e.getSource() == blue ) {
  
        if( blue.isSelected() ) {
          panel.setBackground( Color.BLUE );
        } else {
          panel.setBackground( Color.LIGHT_GRAY );
        }
      }
    }
  }
  
  public static void main( String[] args ) {
    
    // execute program
    new MetricConverter();
  }
  
}
