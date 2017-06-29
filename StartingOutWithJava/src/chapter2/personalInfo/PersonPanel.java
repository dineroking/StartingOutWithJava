/**
 * Created by Ronny Rosabal.
 * Date:      6/28/2017
 * Objective: Creates the panel for the information of the person such as name and age
 */
package chapter2.personalInfo;

import javax.swing.*;           // for all the swing classes
import java.awt.*;

public class PersonPanel extends JPanel {
  
  
  
  // VARIABLES
  
  // labels
  JLabel firstNameLabel;
  JLabel lastNameLabel;
  JLabel middleNameLabel;
  JLabel ageLabel;
  
  // text fields
  JTextField firstNameText;
  JTextField lastNameText;
  JTextField middleNameText;
  JTextField ageText;
  
  
  
  // CONSTRUCTORS
  
  public PersonPanel() {
    
    setLayout( new FlowLayout(  ));
  }
  
  
  
  // METHODS
  
}
