/*
 * Ronny Rosabal
 * Programming Fundamentals II
 * COSC 1337 2001
 * 11.19.16
 * Establishes the blueprint for creating a Telephone object
 */

package chapter9;

public class Telephone {

  // VARIABLES

  private String phoneNumber;                 // the phone number entered by the user



  // CONSTRUCTORS

  /**
   * Telephone initializes phoneNumber to the String passed as the phoneNumber argument
   * @param phoneNumber the phone number of the person
   */
  public Telephone( String phoneNumber ){

    // trim the white space on the edges
    phoneNumber = phoneNumber.trim();

    // check for the right size of string
    if( phoneNumber.length() == 12 ){

      // if correct assign argument to phoneNumber
      this.phoneNumber = phoneNumber;
    }else{

      // if not assign a default number
      this.phoneNumber = "123-456-7890";
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

  public String getPhoneNumber(){
    return phoneNumber;
  }



  // MUTATORS

  public void setPhoneNumber( String phoneNumber ){

    // trim the white space on the edges
    phoneNumber = phoneNumber.trim();

    // check for the right size of string
    if( phoneNumber.length() == 12 ){

      // if correct assign argument to phoneNumber
      this.phoneNumber = phoneNumber;

    }else{

      // if not assign a default number
      this.phoneNumber = "123-456-7890";

    }
  }



  // METHODS

  public String [] stringSplitter(){
    return phoneNumber.split( "" );
  }


  // OUTPUT

  public String toString(){
    return "";
  }

}
