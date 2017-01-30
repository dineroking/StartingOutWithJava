/*
 * Ronny Rosabal
 * Programming Fundamentals III
 * COSC 2336 2801
 * 01.22.17
 * Sets the blue print for the Payroll class
 */
package payroll;

public class Payroll {
  
  // VARIABLES
  
  private String name;                            // the name of the employee
  private String id;                              // the ID number of the employee
  private int hours;                              // the hours worked by the employee
  private double rate;                            // the pay rate of the employee
  private final int MAX_HOURS = 84;               // the maximum number worked hours allowed
  private final double MAX_RATE = 25.00;          // the maximum pay rate allowed
  private static int numEmployees = 0;            // the number of employees
  
  
  // CONSTRUCTORS
  
  /**
   * Payroll initializes all the values to a default value
   * @throws Exception if any of the requirements are not met
   */
  public Payroll() throws Exception {
    
    this( "unknown", "AA0000", 0, 0.0 );
  }
  
  /**
   * Payroll initializes all the values of the employee
   * @param name the name of the employee
   * @param id the ID number of the employee
   * @param hours the hours worked by the employee
   * @param rate the pay rate of the employee
   * @throws Exception if any of the requirements are not met
   */
  public Payroll( String name, String id, int hours, double rate ) throws Exception {
    
    nameChecker( name );
    idChecker( id );
    hoursChecker( hours );
    rateChecker( rate );
    this.name = name;
    this.id = id;
    this.hours = hours;
    this.rate = rate;
    addEmployee();
  }
  
  
  // ACCESSORS
  
  /**
   * getName returns the name of the employee
   * @return the name of the employee
   */
  public String getName() {
    
    return name;
  }
  
  /**
   * getId returns the ID number of the employee
   * @return the ID number of the employee
   */
  public String getId() {
    
    return id;
  }
  
  /**
   * getHours returns the number of hours worked by the employee
   * @return the number of hours worked by the employee
   */
  public int getHours() {
    
    return hours;
  }
  
  /**
   * getRate returns the pay rate of the employee
   * @return the pay rate of the employee
   */
  public double getRate() {
    
    return rate;
  }
  
  public int getNumEmployees(){
    return numEmployees;
  }
  
  
  // MUTATORS
  
  /**
   * setName sets the name of the employee
   * @param name the name of the employee
   * @throws Exception if the name of the employee is empty
   */
  public void setName( String name ) throws Exception{
    
    nameChecker( name );
    this.name = name;
  }
  
  /**
   * setId sets the ID number of the employee
   * @param id the ID number of the employee
   * @throws Exception if the ID is not in the correct format
   */
  public void setId( String id ) throws Exception{
    
    idChecker( id );
    this.id = id;
  }
  
  /**
   * setHours set the number of hours worked by the employee
   * @param hours number of hours worked by the employee
   * @throws Exception if the hours are less than 0 or more than 84
   */
  public void setHours( int hours ) throws Exception{
    
    hoursChecker( hours );
    this.hours = hours;
  }
  
  /**
   * setRate sets the pay rate of the employee
   * @param rate the pay rate of the employee
   * @throws Exception if the range of the rate is less than 0 or more than 25.0
   */
  public void setRate( double rate ) throws Exception{
    
    rateChecker( rate );
    this.rate = rate;
  }
  
  
  // METHODS
  
  /**
   * equals checks the value of two objects
   * @param payroll a Payroll object
   * @return true is the values are equal or false otherwise
   */
  public boolean equals( Payroll payroll ) {
    
    // assume objects are not equal
    boolean areEqual = false;
    
    // compare the values of the objects
    if( name.equals( payroll.name ) &&
        id.equals( payroll.id ) &&
        hours == payroll.hours &&
        rate == payroll.rate ) {
      
      // if the values are the same assign true to areEqual
      areEqual = true;
    }
    
    return areEqual;
  }
  
  /**
   * toString formats how the message is presented.
   * @return the message
   */
  @Override
  public String toString() {
    
    String message = "Name:\t" + name;
    message += "\nID:\t\t" + id;
    message += "\nHours:\t" + hours;
    message += "\nRate:\t" + rate;
    message += "\nPay:\t$" + calcPay();
    return message;
  }
  
  /**
   * areNumbers checks if a given string is composed of integers
   * @param str the string to check for integer
   * @return true if the string is composed of integer or false otherwise
   */
  private boolean areNumbers( String str ) {
    
    try {
      Integer.parseInt( str );
    } catch( NumberFormatException e ) {
      return false;
    }
    return true;
  }
  
  /**
   * areLetters checks if a given string is composed of letters
   * @param str the string to check for letters
   * @return true if the string are letter or false otherwise
   */
  private boolean areLetters( String str ) {
    
    // assumes string are composed of letters
    boolean areLetter = true;
    for( int i = 0; i < str.length(); i++ ) {
      
      // checks each character of the string
      if( !Character.isLetter( str.charAt( i ) ) ) {
        
        // if the character is not a letter assign false to areLetters
        areLetter = false;
        break;
      }
    }
    return areLetter;
  }
  
  /**
   * nameChecker checks the name of the employee to see if its empty
   * @param name the name of the employee
   * @throws Exception if the name is empty
   */
  private void nameChecker( String name ) throws Exception{
    if( name.length() < 1 ) {
      throw new Exception( "Error: You did not enter a name." );
    }
  }
  
  /**
   * idChecker checks the id of the employee for the correct format
   * @param id the id of the employee
   * @throws Exception if the id is not in the correct format
   */
  private void idChecker( String id ) throws Exception {
    if( id.length() != 6 || !areLetters( id.substring( 0, 2 ) ) || !areNumbers( id.substring( 2 ) )) {
      throw new Exception( "Error: ID should be in format LLNNNN" );
    }
  }
  
  /**
   * hoursChecker checks the number of hours worked by the employee
   * @param hours the number of hours worked by the employee
   * @throws Exception if the number of hours are less than 0 or more than 84
   */
  private void hoursChecker( int hours ) throws Exception {
    if( hours < 0 || hours > MAX_HOURS ) {
      throw new Exception( "Error: Hours are not in the range of 0 to 84" );
    }
  }
  
  /**
   * rateChecker checks the rate entered by the user
   * @param rate the rate of pay of the employee
   * @throws Exception if the rate is less than 0 or more then 25.00
   */
  private void rateChecker( double rate ) throws Exception {
    if( rate < 0 || rate > MAX_RATE ) {
      throw new Exception( "Error: Rate is not in the range of 0 to 25.00" );
    }
  }
  
  /**
   * addEmployee adds an employee to keep count of number of employees
   */
  private static void addEmployee(){
    numEmployees++;
  }
  
  /**
   * calcPay returns the pay of the employee
   * @return the pay of the employee
   */
  public double calcPay(){
    return hours * rate;
  }
  
}
