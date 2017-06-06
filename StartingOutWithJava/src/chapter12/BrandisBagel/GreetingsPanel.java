/**
 * Created by Ronny Rosabal.
 * Date:      6/5/2017
 * Objective: Greeting message for the Brandi's Bagel order calculator
 */
package chapter12.BrandisBagel;

import javax.swing.*;

public class GreetingsPanel extends JPanel {
  
  // VARIABLES
  
  private JLabel label;                               // the label to hold the message
  
  
  
  // CONSTRUCTORS
  
  /**
   * GreetingPanel creates a panel that holds the welcome message of the order calculator
   * @param message that becomes the welcome message of the order calculator
   */
  public GreetingsPanel( String message ) {
    
    // create the label
    label = new JLabel( message );
    
    // add label to panel
    add( label );
    
  }
  
}
