/*
 * Ronny Rosabal
 * Programming Fundamentals II
 * COSC 1337 2001
 * 11.27.16
 * Establishes the blueprint for creating a Telephone object
 */

package chapter9;

import com.sun.corba.se.impl.orb.ParserTable;

public class Telephone {

  // VARIABLES

  private StringBuilder phoneNumber;                 // the phone number entered by the user



  // CONSTRUCTORS

  /**
   * Telephone initializes phoneNumber to the String passed as the phoneNumber argument
   * @param phoneNumber the phone number of the person
   */
  public Telephone( String phoneNumber ){

    // trim the white space on the edges
    phoneNumber = phoneNumber.trim();

    // check for the right size of string
    if( phoneNumber.length() >= 10 && phoneNumber.length() <= 14 ){

      // if correct assign argument to phoneNumber
      this.phoneNumber = new StringBuilder( phoneNumber );
    }else{

      // if not assign a default number
      this.phoneNumber = new StringBuilder( "123-456-7890" );
    }

  }

  /**
   * Telephone creates a copy of the Telephone object passed as the argument
   * @param telephone a Telephone object
   */
  public Telephone( Telephone telephone ){

    this.phoneNumber = telephone.phoneNumber;
  }



  // ACCESSORS

  public StringBuilder getPhoneNumber(){

    return phoneNumber;

  }



  // MUTATORS

  public void setPhoneNumber( String phoneNumber ){

    // trim the white space on the edges
    phoneNumber = phoneNumber.trim();

    // check for the right size of string
    if( phoneNumber.length() == 12 ){

      // if correct assign argument to phoneNumber
      this.phoneNumber.replace( 0, this.phoneNumber.length(), phoneNumber );

    }else{

      // if not assign a default number
      this.phoneNumber.replace( 0, this.phoneNumber.length(), "123-456-7890" );

    }
  }



  // METHODS

  /**
   * stringSplitter splits a formatted phone number into an array of strings
   * @return an array of the phone number string
   */
  public String [] stringSplitter(){

    // return an array of strings seperated by spaces, parentheses, dashes or periods
    return numberTanslator().split( "[\\s()-.]+" );

  }

  /**
   * numberTranslator converts the letters in a phone number into an all digit phone number
   * @return an all digit phone number
   */
  public String numberTanslator(){

    // convert a StringBuilder object into a string
    String output = String.valueOf( phoneNumber );

    // replaces the letters in a phone number with its corresponding number
    output = output.replaceAll( "[abdABC]", "2" );
    output = output.replaceAll( "[defDEF]", "3" );
    output = output.replaceAll( "[ghiGHI]", "4");
    output = output.replaceAll( "[jklJKL]", "5" );
    output = output.replaceAll( "[mnoMNO]", "6");
    output = output.replaceAll( "[pqrsPQRS]", "7" );
    output = output.replaceAll( "[tuvTUV]", "8" );
    output = output.replaceAll( "[wxyzWXYZ]", "9" );

    // returns a converted phone number
    return output;
  }

  /**
   * phoneFormatter formats a string representing a phone number into the format x (xxx) xxx-xxxx
   * @return a formatted phone number string
   */
  public String phoneFormatter(){

    // split the unformatted string into an array of strings
    String [] number = stringSplitter();

    // holds the formatted phone number
    String formatted = "";

    // check to see if unformatted phone number did not need to be split
    if( number.length == 1 ){

      // if not, check is the number was 11 digits long
      if( number[0].length() == 11 ){

        // if so, format string into x (xxx) xxx-xxxx
        formatted = number[0].charAt( 0 ) + " (";
        formatted += number[0].substring( 1, 4 ) + ") ";
        formatted += number[0].substring( 4, 7 ) + "-";
        formatted += number[0].substring( 7 );
      }else{

        //otherwise, it has 10 digits so format string into 1 (xxx) xxx-xxxx
        formatted = "1 (";
        formatted += number[0].substring( 1, 4 ) + ") ";
        formatted += number[0].substring( 4, 7 ) + "-";
        formatted += number[0].substring( 7 );
      }

      // if the unformatted string needed to be split
    }else if( number.length == 4 ){

      // format each string in the array into x (xxx) xxx-xxxx
      formatted = number[0] + " (";
      formatted += number[1] + ") ";
      formatted += number[2] + "-";
      formatted += number[3];

      // if it was split into 3 elements
    }else{

      // format each string in the array into 1 (xxx) xxx-xxxx
      formatted = "1 (";
      formatted += number[0] + ") ";
      formatted += number[1] + "-";
      formatted += number[2];
    }

    // returns formatted phone number
    return formatted;
  }

  public Telephone copy(){

    return new Telephone( this.phoneNumber.toString() );
  }

  public boolean equals( Telephone telephone ){

    // assume the two objects values are not equal
    boolean isEqual = false;

    // compare the values of the two objects
    if( this.phoneNumber == telephone.phoneNumber ){

      // if their values are equal change isEqual to true
      isEqual = true;
    }

    // return isEqual
    return isEqual;
  }



  // OUTPUT

  /**
   * toString creates a message to be displayed to the user
   * @return message to be displayed to the user
   */
  public String toString(){

    // initialize the message to be presented to the user
    String message = "";

           // formats the message to be displayed into (xxx)xxx-xxxx
           // I think that assigning stringSplitter to a variable and then
           // using that variable to access the subscript would have been more logical and
           // efficient but I was curious if it would work this way. It does.
           //message += stringSplitter()[0] + ")";
           //message += stringSplitter()[1] + "-";
           //message += stringSplitter()[2];

           // create the message for the user
           message = "Unformatted phone: " + phoneNumber;
           message += "\nFormatted phone: " + phoneFormatter();

    // return the message to the user
    return message;
  }

}
