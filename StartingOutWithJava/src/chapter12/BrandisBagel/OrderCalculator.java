/**
 * Created by Ronny Rosabal.
 * Date:      6/5/2017
 * Objective: The JFrame for the Brandi's Bagel Order Calculator
 */
package chapter12.BrandisBagel;

import javax.swing.*;
import java.awt.*;

public class OrderCalculator extends JFrame {
  
  // VARIABLES
  
  final int WINDOW_WIDTH = 400;
  final int WINDOW_HEIGHT = 200;
  
  
  // CONSTRUCTORS
  
  public OrderCalculator() {
    
    // create window
    setSize( WINDOW_WIDTH, WINDOW_HEIGHT );
    setTitle( "Order Calculator" );
    setDefaultCloseOperation( WindowConstants.EXIT_ON_CLOSE );
    setLayout( new BorderLayout() );
    
    // add panels to content pane
    add( new GreetingsPanel( "Welcome to Brandi's Bagel House" ), BorderLayout.NORTH );
    add( new BagelPanel( "White", "Whole wheat", 1.25, 1.5 ), BorderLayout.WEST );
    add( new ToppingPanel(), BorderLayout.CENTER );
    
    // make window visible
    setVisible( true );
  }
  
  // execute program
  public static void main( String[] args ) {
    
    new OrderCalculator();
    
  }
  
}
