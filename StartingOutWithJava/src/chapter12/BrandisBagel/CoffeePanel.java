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
  
  public final double NONE_PRICE = 0.0;                                // the price when none is selected
  public final double REGULAR_PRICE = 1.25;                            // the price when regular coffee is selected
  public final double DECAF_PRICE = 1.25;                              // the price when decaf coffee is selected
  public final double CAPP_PRICE = 2.00;                               // the price when cappuccino coffee is selected
  private JRadioButton noneButton;                                     // holds the button for the none option
  private JRadioButton regularButton;                                  // holds the button for the regular coffee option
  private JRadioButton decafButton;                                    // holds the button for the defac coffee option
  private JRadioButton cappuccinoButton;
    // holds the button for the cappuccino coffee option
  private ButtonGroup coffeeGroup;                                     // groups all the coffee options together
  
  
  // CONSTRUCTORS
  
  /**
   * CoffeePanel creates the coffee panel for the order calculator
   */
  public CoffeePanel() {
    
    // set the layout manager
    setLayout( new GridLayout( 4, 1 ) );
    
    // create the buttons and buttons group
    coffeeGroup = new ButtonGroup();
    noneButton = new JRadioButton( "None" );
    regularButton = new JRadioButton( "Regular coffee", true );
    decafButton = new JRadioButton( "Decaf coffee" );
    cappuccinoButton = new JRadioButton( "Cappuccino coffee" );
    
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
    
    // add a border to the panel
    setBorder( BorderFactory.createTitledBorder( "Coffee" ) );
    
  }
  
  
  // METHODS
  
  /**
   * getCoffeeCost gets the cost of the coffee that was selected in the panel
   * @return the cost of the selected coffee
   */
  public double getCoffeeCost() {
    
    double cost = REGULAR_PRICE;        // the cost of coffee. regular is automatically selected
    
    if( noneButton.isSelected() ) {
      cost = NONE_PRICE;
    } else if( decafButton.isSelected() ) {
      cost = DECAF_PRICE;
    } else if( cappuccinoButton.isSelected() ) {
      cost = CAPP_PRICE;
    }
    return cost;
  }
  
}
