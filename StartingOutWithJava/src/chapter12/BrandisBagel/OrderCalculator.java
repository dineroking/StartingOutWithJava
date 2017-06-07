/**
 * Created by Ronny Rosabal.
 * Date:      6/5/2017
 * Objective: The JFrame for the Brandi's Bagel Order Calculator
 */
package chapter12.BrandisBagel;

import javax.swing.*;           // for the Swing classes
import java.awt.*;              // for
import java.awt.event.*;        // for the ActionListener interface
import java.text.*;             // for the DecimalFormat class

public class OrderCalculator extends JFrame {
  
  // VARIABLES
  
  // costs
  final double TAX_RATE = 0.0825;       // holds the rate of tax for Texas
  private double orderCost;             // holds the costs of the order before taxes
  private double taxes;                 // holds the tax amount of the order
  private double totalCost;             // holds the costs of the order after taxes
  
  // panels
  private GreetingsPanel greeting;      // holds the greetings panel
  private BagelPanel bagel;             // holds the bagel's panel
  private ToppingPanel topping;         // holds the topping's panel
  private CoffeePanel coffee;           // holds the coffee's panel
  private JPanel panel;                 // the panel to hold the calculate and exit buttons
  
  // buttons
  private JButton calculateButton;      // the calculate button
  private JButton exitButton;           // the exit button
  
  // formatting the numbers
  DecimalFormat dollarFormat;           // holds to the format for the dollars
  
  
  // CONSTRUCTORS
  
  public OrderCalculator() {
    
    // create window
    setTitle( "Order Calculator" );
    setDefaultCloseOperation( WindowConstants.EXIT_ON_CLOSE );
    setLayout( new BorderLayout() );
    
    // build the panels
    buildPanels();
    
    // add panels to content pane
    add( greeting, BorderLayout.NORTH );
    add( bagel, BorderLayout.WEST );
    add( topping, BorderLayout.CENTER );
    add( coffee, BorderLayout.EAST );
    add( panel, BorderLayout.SOUTH );
    
    // register the calculate and exit buttons to the action listener
    calculateButton.addActionListener( new ButtonListener() );
    exitButton.addActionListener( new ButtonListener() );
    
    // pack the contents and make window visible
    pack();
    setVisible( true );
  }
  
  private class ButtonListener implements ActionListener {
    
    public void actionPerformed( ActionEvent e ) {
      
      // initialize the order cost
      orderCost = 0.0;
      
      if( e.getSource() == calculateButton ) {
        
        // add the costs of the selections
        orderCost += bagel.getBagelCost();
        orderCost += topping.getToppingCost();
        orderCost += coffee.getCoffeeCost();
        
        // calculate the order's taxes
        taxes = orderCost * TAX_RATE;
        
        // calculate order's total
        totalCost = orderCost + taxes;
        
        // print the receipt
        printReceipt();
        
      } else if( e.getSource() == exitButton ) {
        System.exit( 0 );
      }
      
    }
  }
  
  
  // METHODS
  
  private void buildPanels() {
    
    // build the panels
    panel = new JPanel();
    greeting = new GreetingsPanel( "Welcome to Brandi's Bagel House" );
    bagel = new BagelPanel( "White", "Whole wheat", 1.25, 1.5 );
    topping = new ToppingPanel();
    coffee = new CoffeePanel();
    
    // create the calculate and exit buttons
    calculateButton = new JButton( "Calculate" );
    exitButton = new JButton( "Exit" );
    
    // add buttons to the panel
    panel.add( calculateButton );
    panel.add( exitButton );
    
  }
  
  private void printReceipt() {
    
    String message = "";                // message that will become the receipt
    dollarFormat = new DecimalFormat( "$#0.00" );
    
    // create the message to show on the receipt
    message += "Brandi's Bagel order receipt";
    message += "\n\n";
    message += "Order total: \t\t" + dollarFormat.format( orderCost );
    message += "\nTaxes: \t\t\t" + dollarFormat.format( taxes );
    message += "\nTotal cost: \t\t" + dollarFormat.format( totalCost );
    
    // display the message on the receipt
    JOptionPane.showMessageDialog( null, message );
  }
  
  // execute program
  public static void main( String[] args ) {
    
    new OrderCalculator();
    
  }
  
}
