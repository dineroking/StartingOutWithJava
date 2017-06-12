/**
 * Created by Ronny Rosabal.
 * Date:      6/8/17
 * Objective: GUI for the Retail Price Calculator
 * Problem:  Create a GUI application where the user enters the wholesale cost of an iem and its markup percentage
 *           into text fields. THe application should have a button that displays the item's retail price when clicked.
 */
package chapter12.RetailPriceCalculatorGUI;

import javax.swing.*;             // for the Swing classes
import java.awt.*;                // for the BorderLayout class
import java.awt.event.*;          // for the ActionListener interface
import java.text.DecimalFormat;   // for the DecimalFormat class

public class CalculatorGUI extends JFrame {
  
  // VARIABLES
  
  // panels
  private UserInputPanel inputPanel;    // the panel for all the user inputs
  private JPanel buttonsPanel;          // the panel for the calculate and exit buttons
  
  // buttons
  private JButton calculateButton;      // the calculate button
  private JButton exitButton;           // the exit button
  
  // formats
  DecimalFormat dollar;                 // the format for US dollar currency
  // TODO: check how to format a percentage
  DecimalFormat percentage;             // the format to show a decimal as a percentage
  
  
  // CONSTRUCTORS
  
  public CalculatorGUI() {
    
    // set the layout manager
    setLayout( new BorderLayout() );
    
    // create the window
    setTitle( "Retail Price Calculator" );
    setSize( 1000, 300 );
    setDefaultCloseOperation( WindowConstants.EXIT_ON_CLOSE );
    
    // create panels
    buildPanels();
    
    
    // add panels to the window
    add( inputPanel, BorderLayout.NORTH );
    add( buttonsPanel, BorderLayout.SOUTH );
    
    // pack and set the window to visible
    pack();
    setVisible( true );
  }
  
  
  
  // EVENT HANDLERS
  
  private class ButtonListener implements ActionListener {
    
    public void actionPerformed( ActionEvent e ) {
      
      // product info
      String productName;       // the name of the product
      double productPrice;      // the price of the product
      double markupRate;        // the percentage of price markup
      double totalPrice;        // the price of the product after the markup
      
      // message to be displayed
      String outputMessage;     // the message to be displayed to the user
      
      if( e.getSource() == calculateButton ) {
        
        try {
          
          // get user input
          productName = inputPanel.getProductInput();
          productPrice = Double.parseDouble( inputPanel.getPriceInput() );
          markupRate = Double.parseDouble( inputPanel.getMarkupInput() )
                       / 100;   // assumes user enters input in whole numbers
          
          // calculate the markup
          totalPrice = ( productPrice * markupRate ) + productPrice;
          
          // initialize currency format
          dollar = new DecimalFormat( "$#0.00" );
          
          // create the message to display
          outputMessage = productName;
          outputMessage += "\n\nPrice: " + dollar.format( productPrice );
          outputMessage += "\nMarkup: " + markupRate;
          outputMessage += "\nTotal: "
          
          
        } catch( IllegalArgumentException o ) {
          
          JOptionPane.showMessageDialog( null, "You did not enter a number." );
        }
        
      } else if ( e.getSource() == exitButton ) {
        System.exit( 0 );
      }
    }
  }
  
  
  // METHODS
  
  // build the calculate and exit panel
  private void buildPanels() {
    
    // create the panels
    inputPanel = new UserInputPanel();
    buttonsPanel = new JPanel( );
    
    // create the buttons
    calculateButton = new JButton( "Calculate" );
    exitButton = new JButton( "Exit" );
    
    // add buttons to the panel
    buttonsPanel.add( calculateButton );
    buttonsPanel.add( exitButton );
    
  }
  
  // execute the program
  public static void main( String[] args ) {
    
    new CalculatorGUI();
  }
  
}
