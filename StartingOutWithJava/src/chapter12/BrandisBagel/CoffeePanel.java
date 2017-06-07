/**
 * Created by Ronny Rosabal.
 * Date:      6/5/2017
 * Objective: The class that will create the CoffeePanel for the order calculator.
 */
package chapter12.BrandisBagel;

import javax.swing.*;
import java.awt.*;

public class CoffeePanel extends JPanel {
  
  // VARIABLES
  
  private JButton noneButton;                                     // holds the button for the none option
  private JButton regularButton;                                  // holds the button for the regular coffee option
  private JButton decafButton;                                    // holds the button for the defac coffee option
  private JButton cappuccinoButton;                               // holds the button for the cappuccino coffee option
  private ButtonGroup coffeeGroup;                                // groups all the coffee options together
  
  
  
  // CONSTRUCTORS
  
  public CoffeePanel() {
    
    // set the layout manager
    setLayout( new GridLayout( 4, 1 ) );
    
    // create the buttons and buttons group
    coffeeGroup = new ButtonGroup();
    noneButton = new JButton( "None" );
    regularButton = new JButton( "Regular coffee" );
    decafButton = new JButton( "Decaf coffee" );
    cappuccinoButton = new JButton( "Cappuccino coffee" );
    
    // group the coffee buttons
    coffeeGroup.add( noneButton );
    coffeeGroup.add( regularButton );
    coffeeGroup.add( decafButton );
    coffeeGroup.add( cappuccinoButton );
    
    // add buttons to the panel
    add( noneButton );
    add( regularButton );
    add( decafButton );
    add( cappuccinoButton );
    
  }
  
  
  
  // METHODS
  
}
