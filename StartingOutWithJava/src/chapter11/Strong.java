/*
 * Ronny Rosabal
 * Programming Fundamentals II
 * COSC 1337 2001
 * 12.10.16
 * Establishes the blueprint for creating a Strong password object
 */
package chapter11;

import java.io.IOException;
import java.util.ArrayList;

public class Strong {

  // VARIABLES

  private PasswordReaderWriter file;
  private ArrayList<String> passwords;
  private ArrayList<String> results = new ArrayList<String>();



  // CONSTRUCTORS

  /**
   * Strong initializes a Strong object with a PasswordReaderWriter object
   * @param file PasswordReaderWriter object
   */
  public Strong( PasswordReaderWriter file ){
    this.file = new PasswordReaderWriter( file );
    this.passwords = new ArrayList<String>( file.getPasswords() );
  }



  // ACCESSORS

  /**
   * getFile returns a new PasswordReaderWriter object with the file's name passed as the argument
   * @return
   */
  public PasswordReaderWriter getFile() throws IOException{
    return new PasswordReaderWriter( file.getFileName() );
  }

  /**
   * getPasswords returns an ArrayList object with the passwords
   * @return
   */
  public ArrayList<String> getPasswords(){
    return new ArrayList<String>( passwords );
  }



  // MUTATORS

  /**
   * setFile sets the file to be
   * @param file
   */
  public void setFile( PasswordReaderWriter file ){
    this.file = new PasswordReaderWriter( file );
    this.passwords = new ArrayList<>( file.getPasswords() );
  }



  // METHODS

  /**
   * validatePassword checks the password passed as an argument and if all the requirements are met
   *                  it returns the string "Strong" otherwise it returns the string "INVALID"
   * @param password the password to be validated
   * @return "Strong" if password meets requirements or "INVALID" if not
   */
  private String validatePassword( String password ){

    String pwdStrength = "an INVALID";                // holds INVALID or STRONG depending on the password
    final int MIN_LENGTH = 8;                         // holds the minimum length required for password
    boolean hasOther = false;                         // TRUE if it has a character not approved
    boolean hasUpper = false;                         // TRUE if it has at least an upper case character
    boolean hasChar = false;                          // TRUE if it has at least one special character
    boolean hasDigit = false;                         // TRUE if it has at least one digit
    String specialChars = "!@#$%^&*()_+=";            // the special characters to look for

    // trim white spaces from around the password
    password = password.trim();

    // check for length of password
    if( password.length() >= MIN_LENGTH ){

      // cycle through each character in the password to check for each requirement
      for( int i = 0; i < password.length(); i++ ){

        // check to see if the character is a digit
        if( Character.isDigit( password.charAt( i ) ) ){

          // if it is change hasDigit to true
          hasDigit = true;
        }

        // check to see if character is an upper case character
        else if( Character.isUpperCase( password.charAt( i ) ) ){

          // if it is change hasUpper to true
          hasUpper = true;
        }

        // check to see if character is a special character
        else if( specialChars.contains( password.substring( i, i + 1 ) ) ){

          // if it is change hasChar to true
          hasChar = true;
        }

        // check to see if it has a character not approved
        else if( !Character.isLetter( password.charAt( i ) ) ){

          // if it does, assign true to hasOther
          hasOther = true;
        }

        // check to see that all the password requirements were met
        // it is not needed to check for the length because this check
        // is already inside the check for the length
        if( !hasOther && hasDigit && ( hasUpper || hasChar ) ){

          // if they were met assign the string "STRONG" to pwdStrength
          pwdStrength = "a STRONG";
        }
        else{

          // if requirements were not met or a non approve character was found
          pwdStrength = "an INVALID";
        }

      }
    }

    return pwdStrength;
  }

  /**
   * checkPasswords validates each password in the passwords array and adds the results to the results array
   */
  private void checkPasswords(){

    // for each password in the array of passwords
    for( String password : passwords ){

      // add the validated password to the array of results
      results.add( validatePassword( password ) );
    }
  }

  /**
   * copy makes a copy of the object by creating a new Strong object
   * @return a copy of the Strong object
   */
  public Strong copy(){
    return new Strong( file );
  }

  /**
   * equals compares the values of two Strong objects returning true if they are equal or false otherwise
   * @param strong a Strong object
   * @return true if the objects' values are equal or false if they are not
   */
  public boolean equals( Strong strong ){

    // assume the values of the objects are not equal
    boolean isEqual = false;

    // compare the values of two Strong objects
    if( this.file.equals( strong.file ) &&
        passwords.equals( strong.getPasswords() )){

      // if they are equal assign true to isEqual
      isEqual = true;
    }

    return isEqual;
  }



  // OUTPUT

  /**
   * toString formats a message to be displayed to the user
   * @return the message to be displayed to the user
   */
  @Override
  public String toString(){

    checkPasswords();

    // initializes a string to an empty string
    String message = "";

    // sets the number of password
    int numPasswords = passwords.size();

    // for each password in the array
    for( int i = 0; i < numPasswords; i++ ){

      // assign the password and the results associated to that password
      message += "\n" + passwords.get( i ) + " is " + results.get( i ) + " password.\n";
    }

    return message;
  }
}
