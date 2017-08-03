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
  private PersonPanel personPanel;          // holds the panel for the person's personal info
  private AddressPanel addressPanel;        // holds the panel for the person's address
  private JPanel buttonsPanel;              // holds the panel that holds the submit and reset buttons
  
  // buttons
  private JButton submitButton;
  private JButton resetButton;
  private JButton exitButton;
  
  
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
    add( buttonsPanel, BorderLayout.SOUTH );
    
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
    buttonsPanel = new JPanel(  );
    
    // create the buttons
    submitButton = new JButton( "Submit" );
    resetButton = new JButton( "Reset" );
    exitButton = new JButton(  "Exit" );
    
    // add the buttons to the buttons panel
    buttonsPanel.add( submitButton );
    buttonsPanel.add( resetButton );
    buttonsPanel.add( exitButton );
    
  }
  // execute program
  public static void main( String[] args ) {
    
    new PersonalInfoForm();
    
  }
  
  
}
