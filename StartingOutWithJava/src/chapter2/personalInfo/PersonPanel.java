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
  
  
  // METHODS
  
}
