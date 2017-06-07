/**
 * Created by Ronny Rosabal.
 * Date:      6/5/2017
 * Objective: Choices of bagels for Brandi's Bagel order calculator
 */
package chapter12.BrandisBagel;

import javax.swing.*;                                       // for Swing classes
import java.awt.*;                                          // for the GridLayout class
import java.awt.event.*;                                    // for ActionListener class

public class BagelPanel extends JPanel {
  
  // VARIABLES
  
  private double bagel1Price;                                            // the price for the first bagel
  private double bagel2Price;                                            // the price for the second bagel
  private JRadioButton bagel1RadioButton;                                // first option of bagel
  private JRadioButton bagel2RadioButton;                                // second option of bagel
  private ButtonGroup bagels;                                            // groups the radio buttons
  
  
  // CONSTRUCTORS
  
  /**
   * BagelPanel creates the panel for the bagel options of the order calculator
   * @param bagel1 the first choice of bagel in the bagel panel
   * @param bagel2 the second choice of bagel in the bagel panel
   * @param bagel1Price the price of the first bagel
   * @param bagel2Price the price of the second bagel
   */
  public BagelPanel( String bagel1, String bagel2, double bagel1Price, double bagel2Price ) {
    
    // variable initialization
    this.bagel1Price = bagel1Price;
    this.bagel2Price = bagel2Price;
    
    // set the layout manager
    setLayout( new GridLayout( 2, 1 ) );
    
    // create the radio buttons and group them
    bagels = new ButtonGroup();
    bagel1RadioButton = new JRadioButton( bagel1, true );
    bagel2RadioButton = new JRadioButton( bagel2 );
    bagels.add( bagel1RadioButton );
    bagels.add( bagel2RadioButton );
    
    // add border to the panel
    setBorder( BorderFactory.createTitledBorder( "Bagel" ) );
    
    // add buttons to panel
    add( bagel1RadioButton );
    add( bagel2RadioButton );
    
  }
  
  // METHODS
  
  /**
   * getBagelPrice returns the price of the bagel that was selected on the bagel panel in the order calculator
   * @return the price of the selected bagel
   */
  public double getBagelCost() {
    
    if( bagel1RadioButton.isSelected() ) {
      return bagel1Price;
    } else {
      return bagel2Price;
    }
  }
}
