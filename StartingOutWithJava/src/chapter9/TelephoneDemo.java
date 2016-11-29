/*
 * Ronny Rosabal
 * Programming Fundamentals II
 * COSC 1337 2001
 * 11.27.16
 * Creates telephone objects
 */

package chapter9;

import javax.swing.JOptionPane;
public class TelephoneDemo {

  public static void main( String[] args){

    // VARIABLES

    String input;                         // the input of the user
    Telephone phone;                      // a Telephone object



    // INPUT

    // get the user input and create a telephone object with the input
    input = getInput();
    phone = new Telephone( input );



    // OUTPUT

    // show the user the unformatted and formatted phone
    JOptionPane.showMessageDialog( null, phone );
  }

  public static String getInput(){

    String message = "Enter a phone number.";
           message += "\n\nAcceptable formats:";
           message += "\n(xxx) xxx-xxxx";
           message += "\nxxxxxxxxxx";
           message += "\nxxx.xxx.xxxx";
           message += "\nxxx-xxx-xxxx";

    return JOptionPane.showInputDialog( null, message );
  }

}
