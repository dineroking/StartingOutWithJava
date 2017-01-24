/**
 * Created by Ronny Rosabal.
 * Date:      1/22/17
 * Objective:
 */
package payroll;

public class Payroll {
  
  // VARIABLES
  
  private String name;
  private String id;
  private int hours;
  private double rate;
  
  
  
  // CONSTRUCTORS
  
  public Payroll(){
    this( "", "", 0, 0.0 );
  }
  
  public Payroll( String name, String id, int hours, double rate ){
    this.name = name;
    this.id = id;
    this.hours = hours;
    this.rate = rate;
  }
  
  
  
  // ACCESSORS
  
  public String getName() {
    return name;
  }
  
  public String getId() {
    return id;
  }
  
  public int getHours() {
    return hours;
  }
  
  public double getRate() {
    return rate;
  }
  
  
  
  // MUTATORS
  
  public void setName( String name ) {
    this.name = name;
  }
  
  public void setId( String id ) {
    this.id = id;
  }
  
  public void setHours( int hours ) {
    this.hours = hours;
  }
  
  public void setRate( double rate ) {
    this.rate = rate;
  }
  
  
  
  // METHODS
  
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
  
  @Override
  public String toString() {
    String message = "";
    return message;
  }
  
}
