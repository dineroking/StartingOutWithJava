/**
 * Created by Ronny Rosabal.
 * Date:      6/5/2017
 * Objective: The class that creates the toppings panel and the options of toppings in it.
 */

package chapter12.BrandisBagel;

import javax.swing.*;
import java.awt.*;

public class ToppingPanel extends JPanel {
  
  // VARIABLES
  
  public final double CREAM_CHEESE_PRICE = .5;                  // the price of the cream cheese topping
  public final double BUTTER_PRICE = .25;                       // the price of the butter topping
  public final double PEACH_JELLY_PRICE = .75;                  // the price of the peach jelly topping
  public final double BLUEBERRY_JAM = .75;                      // the price of the blueberry jam topping
  private JCheckBox creamCheeseBox;                             // holds the cream cheese checkbox
  private JCheckBox butterBox;                                  // holds the butter checkBox
  private JCheckBox peachJelly;                                 // holds the peach jelly checkbox
  private JCheckBox blueberryJamBox;                            // holds the blueberry checkbox
  
  
  
  // CONSTRUCTORS
  
  /**
   * ToppingPanel creates the panel for the toppings in the order calculator
   */
  public ToppingPanel() {
    
    // set the layout manager
    setLayout( new GridLayout( 4, 1 ) );
    
    // create the checkboxes
    creamCheeseBox = new JCheckBox( "Cream cheese" );
    butterBox = new JCheckBox( "Butter" );
    peachJelly = new JCheckBox( "Peach jelly" );
    blueberryJamBox = new JCheckBox( "Blueberry jam" );
    
    // add check boxes to the panel
    add( creamCheeseBox );
    add( butterBox );
    add( peachJelly );
    add( blueberryJamBox );
    
    // set a border around the panel
    setBorder( BorderFactory.createTitledBorder( "Toppings" ) );
  }
  
  
  
  // METHODS
  
  /**
   * getToppingCost calculates the cost of the toppings selected
   * @return the cost of the toppings selected
   */
  public double getToppingCost() {
    
    double totalCost = 0.0;               // the total cost of the toppings selected
    
    if( creamCheeseBox.isSelected() ) {
      totalCost += CREAM_CHEESE_PRICE;
    }
    if( butterBox.isSelected() ) {
      totalCost += BUTTER_PRICE;
    }
    if( peachJelly.isSelected() ) {
      totalCost += PEACH_JELLY_PRICE;
    }
    if( blueberryJamBox.isSelected() ) {
      totalCost += BLUEBERRY_JAM;
    }
    return totalCost;
  }
}
