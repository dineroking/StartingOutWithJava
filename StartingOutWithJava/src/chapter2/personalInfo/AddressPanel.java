/**
 * Created by Ronny Rosabal.
 * Date:      7/4/17
 * Objective: Creates the address panel for the personal information form
 */
package chapter2.personalInfo;

import javax.swing.*;             // for the swing classes
import java.awt.*;                // for the BorderLayout manager

public class AddressPanel extends JPanel {
  
  // VARIABLES
  
  // labels
  private JLabel addressLabel;            // the label for the person's address field
  private JLabel cityLabel;               // the label for the person's city field
  private JLabel stateLabel;              // the label for the person's state field
  private JLabel zipcodeLabel;            // the label for the person's zipcode field
  
  // text fields
  private JTextField addressText;         // the text field for the person's address
  private JTextField cityText;            // the text field for the person's city
  private JTextField zipcodeText;         // the text field for the person's zip code
  
  // drop down list
  private JComboBox<String> stateDrop;    // the drop down box for all the states
  private String[] stateList              // list of all the states
    = {"AL", "AR", "FL", "OK", "TX"};
  
  
  // CONSTRUCTORS
  
  public AddressPanel() {
    
    // set the layout manager
    setLayout( new FlowLayout() );
    
    // create the labels
    addressLabel = new JLabel( "address:" );
    cityLabel = new JLabel( "city:" );
    stateLabel = new JLabel( "state:" );
    zipcodeLabel = new JLabel( "zip code:" );
    
    // create the text fields
    addressText = new JTextField( 20 );
    cityText = new JTextField( 10 );
    zipcodeText = new JTextField( 5 );
    
    // create the drop down menu
    stateDrop = new JComboBox<>( stateList );
    
    // add components to the panel
    add( addressLabel );
    add( addressText );
    add( cityLabel );
    add( cityText );
    add( stateLabel );
    add( stateDrop );
    add( zipcodeLabel );
    add( zipcodeText );
    
  }
  
  
  // METHODS
  
}
