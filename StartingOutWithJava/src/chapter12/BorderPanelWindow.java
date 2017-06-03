/**
 * Created by Ronny Rosabal.
 * Date:      6/3/17
 * Objective: Practice using the BorderLayout manager
 */
package chapter12;

import javax.swing.*;                             // for the Swing classes
import java.awt.*;                                // for layout managers
import java.awt.event.*;                          // for event handling

public class BorderPanelWindow extends JFrame {
  
  // VARIABLES
  
  
  // CONSTRUCTORS
  
  public BorderPanelWindow() {
    
    // create window
    setTitle( "Border Panel Window" );            // set the title of the window
    setDefaultCloseOperation( WindowConstants.EXIT_ON_CLOSE );
    setLayout( new BorderLayout() );
    
    // create panels
    JPanel panel1 = new JPanel();
    JPanel panel2 = new JPanel();
    JPanel panel3 = new JPanel(  );
    JPanel panel4 = new JPanel(  );
    JPanel panel5 = new JPanel(  );
    
    // create buttons
    JButton button1 = new JButton( "button1" );
    JButton button2 = new JButton( "button2" );
    JButton button3 = new JButton( "button3" );
    JButton button4 = new JButton( "button4" );
    JButton button5 = new JButton( "button5" );
  
    // add handlers to the buttons
    button1.addActionListener( new ButtonListener() );
    button2.addActionListener( new ButtonListener() );
    button3.addActionListener( new ButtonListener() );
    button4.addActionListener( new ButtonListener() );
    button5.addActionListener( new ButtonListener() );
    
    // add buttons to panels
    panel1.add( button1 );
    panel2.add( button2 );
    panel3.add( button3 );
    panel4.add( button4 );
    panel5.add( button5 );
    
    // add the panels to the content pane
    add( panel1, BorderLayout.NORTH );
    add( panel2, BorderLayout.SOUTH );
    add( panel3, BorderLayout.EAST );
    add( panel4, BorderLayout.WEST );
    add( panel5, BorderLayout.CENTER );
  
    // pack and display the window
    pack();
    setVisible( true );                           // make the window visible
    
  }
  
  private class ButtonListener implements ActionListener{
    
    public void actionPerformed( ActionEvent e ) {
      
      System.out.println( e.getActionCommand() );
      
    }
  }
  
  public static void main( String[] args ) {
    
    // execute window
    new BorderPanelWindow();
  }
}
