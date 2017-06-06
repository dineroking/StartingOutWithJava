/**
 * Created by Ronny Rosabal.
 * Date:      6/5/2017
 * Objective: Choices of bagels for Brandi's Bagel order calculator
 */
package chapter12.BrandisBagel;

import javax.swing.*;                                       // for Swing classes
import java.awt.*;
import java.awt.event.*;                                    // for ActionListener class

public class BagelPanel extends JPanel {
  
  // VARIABLES
  
  private JRadioButton bagel1RadioButton;                                // first option of bagel
  private JRadioButton bagel2RadioButton;                                // second option of bagel
  private ButtonGroup bagels;                                            // groups the radio buttons
  private int price;                                                     // price of selected bagel
  
  
  
  // CONSTRUCTORS
  
  public BagelPanel( String bagel1, String bagel2 ){
    
    // set the layout manager
    setLayout( new GridLayout( 2, 1 ) );
    
    // create the radio buttons and group them
    bagels = new ButtonGroup();
    bagel1RadioButton = new JRadioButton( bagel1, true );
    bagel2RadioButton = new JRadioButton( bagel2 );
    bagels.add( bagel1RadioButton );
    bagels.add( bagel2RadioButton );
  
    // register events to radio buttons
    bagel1RadioButton.addActionListener( new RadioButtonListener() );
    bagel2RadioButton.addActionListener( new RadioButtonListener() );
    
    // add buttons to panel
    add( bagel1RadioButton );
    add( bagel2RadioButton );
    
  }
  
  private class RadioButtonListener implements ActionListener {
    
    public void actionPerformed( ActionEvent e ) {
    
    }
  }
}
