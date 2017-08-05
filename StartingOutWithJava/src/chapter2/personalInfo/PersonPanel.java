/**
 * Created by Ronny Rosabal.
 * Date:      6/28/2017
 * Objective: Creates the panel for the information of the person such as name and age
 */
package chapter2.personalInfo;

import javax.swing.*;           // for all the swing classes
import java.awt.*;              // for the GridLayout Manager

public class PersonPanel extends JPanel {
  
  
  // VARIABLES
  
  // labels
  private JLabel firstNameLabel;
  private JLabel lastNameLabel;
  private JLabel middleNameLabel;
  private JLabel ageLabel;
  
  // text fields
  private JTextField firstNameText;
  private JTextField lastNameText;
  private JTextField middleNameText;
  private JTextField ageText;
  
  
  // CONSTRUCTORS
  
  public PersonPanel() {
    
    // create flow manager
    setLayout( new GridLayout( 4, 2 ) );
    
    // create the labels
    firstNameLabel = new JLabel( "first name:" );
    lastNameLabel = new JLabel( "last name:" );
    middleNameLabel = new JLabel( "middle name:" );
    ageLabel = new JLabel( "age:" );
    
    // create text fields
    firstNameText = new JTextField( 20 );
    lastNameText = new JTextField( 20 );
    middleNameText = new JTextField( 20 );
    ageText = new JTextField( 4 );
    
    // add components to the panel
    add( firstNameLabel );
    add( firstNameText );
    add( middleNameLabel );
    add( middleNameText );
    add( lastNameLabel );
    add( lastNameText );
    add( ageLabel );
    add( ageText );
    
  }
  
  
  // GETTERS
  
  /**
   * getFirstNameText() returns a string with the first name of the person
   *
   * @return the name of the person
   */
  public String getFirstNameText() {
    
    return firstNameText.getText();
  }
  
  /**
   * getLastNameText() returns a string with the last name of the person
   *
   * @return the last name of the person
   */
  public String getLastNameText() {
    
    return lastNameText.getText();
  }
  
  /**
   * getMiddleNameText() returns a string with the middle name of the person
   *
   * @return the middle name of the person
   */
  public String getMiddleNameText() {
    
    return middleNameText.getText();
  }
  
  /**
   * getAgeText() returns an integer with the age of the person
   *
   * @return the age of the person
   */
  public int getAgeText() {
    
    return Integer.parseInt( ageText.getText() );
  }
  
  
  // SETTERS
  
  /**
   * setFirstNameText() changes the first name that appears in the field
   *
   * @param firstNameText the string for the first name
   */
  public void setFirstNameText( String firstNameText ) {
    
    this.firstNameText.setText( firstNameText );
  }
  
  /**
   * setLastNameText() changes the last name that appears in the field
   *
   * @param lastNameText the string for the last name
   */
  public void setLastNameText( String lastNameText ) {
    
    this.lastNameText.setText( lastNameText );
  }
  
  /**
   * setMiddleNameText() changes the middle name that appears in the field
   *
   * @param middleNameText the string for the middle name
   */
  public void setMiddleNameText( String middleNameText ) {
    
    this.middleNameText.setText( middleNameText );
  }
  
  /**
   * setAgeText() changes the age that appears in the age field
   *
   * @param ageText the string for the age field
   */
  public void setAgeText( String ageText ) {
    
    this.ageText.setText( ageText );
  }
}
