/**
 * Created by Ronny Rosabal.
 * Date:      7/4/17
 * Objective: Creates the address panel for the personal information form
 */
package chapter2.personalInfo;

import javafx.scene.control.ComboBox;

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
  
  
  // GETTERS
  
  /**
   * getAddressText() returns a string with the address of the house of the person
   *
   * @return the address of the person
   */
  public String getAddressText() {
    
    return addressText.getText();
  }
  
  /**
   * getCityText() returns a string with the city of the person
   *
   * @return the city of the person
   */
  public String getCityText() {
    
    return cityText.getText();
  }
  
  /**
   * getZipcodeText() returns a string with the zipcode of the person
   *
   * @return the zipcode of the person
   */
  public String getZipcodeText() {
    
    return zipcodeText.getText();
  }
  
  /**
   * getStateDrop() returns a string with the living state of the person
   *
   * @return the living state of the person
   */
  public String getStateDrop() {
    
    return (String) stateDrop.getSelectedItem();
  }
  
  
  // SETTERS
  
  /**
   * setAddressText() changes the address that appears in the address field
   *
   * @param addressText the new address to be displayed
   */
  public void setAddressText( String addressText ) {
    
    this.addressText.setText( addressText );
  }
  
  /**
   * setCityText() changes the city that appears in the address field
   *
   * @param cityText the new city for the city field
   */
  public void setCityText( String cityText ) {
    
    this.cityText.setText( cityText );
  }
  
  /**
   * setZipcodeText() changes the zip code that appears in the zipcode field
   *
   * @param zipcodeText the new zipcode for the zipcode field
   */
  public void setZipcodeText( String zipcodeText ) {
    
    this.zipcodeText.setText( zipcodeText );
  }
  
  /**
   * setStateDrop() changes the State selection that appears in the state drop down field
   *
   * @param selectedIndex the new state for the state drop down field
   */
  public void setStateDrop( int selectedIndex ) {
    
    this.stateDrop.setSelectedIndex( selectedIndex );
  }
}
