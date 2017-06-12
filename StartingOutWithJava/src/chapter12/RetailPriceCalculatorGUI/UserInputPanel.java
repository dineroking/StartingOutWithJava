/**
 * Created by Ronny Rosabal.
 * Date:      6/8/17
 * Objective: The panel for the user input of the price and the markup percentage.
 */
package chapter12.RetailPriceCalculatorGUI;

import javax.swing.*;     // for the Swing classes
import java.awt.*;        // for FlowLayout class

/**
 * UserInputPanel class puts together all the components of the user input panel
 */
public class UserInputPanel extends JPanel {
  
  // VARIABLES
  
  // panel
  private JPanel inputPanel;                // the panel to hold the labels and input
  
  // labels
  private JLabel productLabel;              // the label attached to the name of the product
  private JLabel priceLabel;                // the label attached to the price of the product
  private JLabel markupLabel;               // the label attached to the markup percentage of the product
  
  // input fields
  private JTextField productInput;          // the input field for the name of the product
  private JTextField priceInput;            // the input field for the price of the product
  private JTextField markupInput;           // the input field for the markup percentage of the product
  
  
  
  // CONSTRUCTORS
  
  public UserInputPanel( ) {
    
    // set the layout manager of the panel
    setLayout( new FlowLayout() );
    
    // create labels
    productLabel = new JLabel( "Enter the product's name:" );
    priceLabel = new JLabel( "Price:" );
    markupLabel = new JLabel( "Markup" );
    
    // create text fields
    productInput = new JTextField( 20 );
    priceInput = new JTextField( 10 );
    markupInput = new JTextField( 5 );
    
    // add components to panel
    add( productLabel );
    add( productInput );
    add( priceLabel );
    add( priceInput );
    add( markupLabel );
    add( markupInput );
    
  }
  
  
  
  // METHODS
  
  /**
   * getProductInput() returns the name of the product entered by the user
   * @return the name of product
   */
  public String getProductInput() {
    
    return  productInput.getText();
  }
  
  /**
   * getPriceInput() returns the price of the product entered by the user
   * @return the price of the product
   */
  public String getPriceInput() {
    
    return priceInput.getText();
  }
  
  /**
   * getMarkupInput() returns the markup percentage of the product entered by the user
   * @return the markup percentage of the product
   */
  public String getMarkupInput() {
    
    return markupInput.getText();
  }
}
