/**
 * Created by Ronny Rosabal.
 * Date:      6/4/2017
 * Objective: For practicing with the JRadioButton
 */
package chapter12;

import javax.swing.*;                                    // for the Swing classes
import java.awt.*;                                       // for
import java.awt.event.*;                                 // for event handling classes

public class MetricConverter extends JFrame {
  
  // VARIABLES
  
  final int WINDOW_WIDTH = 400;                          // the width of the window
  final int WINDOW_HEIGHT = 200;                         // the height of the window
  ButtonGroup radioButtons;                              // group that keeps the radio buttons together
  JRadioButton miles;                                    // radio button for converting into miles
  JRadioButton feet;                                     // radio button for converting into feet
  JRadioButton inches;                                   // radio button for converting into inches
  JPanel panel;                                          // panel to hold label and buttons components
  JLabel message;                                        // label for user input
  JTextField inputText;                                  // text field for the user to enter input
  
}
