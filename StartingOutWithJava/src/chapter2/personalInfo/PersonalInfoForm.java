/**
 * Created by Ronny Rosabal.
 * Date:      6/28/2017
 * Objective: Creates a form to collect the info of a person
 */
package chapter2.personalInfo;

import javax.swing.*;               // for all the swing classes
import java.awt.*;                  // for the BorderLayout manager

public class PersonalInfoForm extends JFrame {
  
  // VARIABLES
  
  // panels
  PersonPanel personPanel;          // holds the panel for the person's personal info
  AddressPanel addressPanel;        // holds the panel for the person's address
  
  
  // CONSTRUCTORS
  
  public PersonalInfoForm() {
    
    // create the layout of the frame
    setLayout( new BorderLayout() );
    
    // create the window frame
    setTitle( "Personal Information" );
    setDefaultCloseOperation( WindowConstants.EXIT_ON_CLOSE );
    
    // create the panels
    buildPanels();
    
    // add panels to the frame
    add( personPanel, BorderLayout.NORTH );
    add( addressPanel, BorderLayout.CENTER );
    
    // pack and make window visible
    pack();
    setVisible( true );
  }
  
  
  // METHODS
  
  // build the panels
  private void buildPanels() {
    
    // create the panels
    personPanel = new PersonPanel();
    addressPanel = new AddressPanel();
    
  }
  // execute program
  public static void main( String[] args ) {
    
    new PersonalInfoForm();
    
  }
  
  
}
