/**
 * Created by Ronny Rosabal.
 * Date:      7/27/2017
 * Objective:
 */
package TDD.BankAccount;

public class BankAccount {
  
  // VARIABLE
  
  private int balance;
  
  // CONSTRUCTORS
  
  public BankAccount() {
    this( 0 );
  }
  
  public BankAccount( int startingBalance ) {
    balance = startingBalance;
  }
  
  // METHODS
  
  public int getBalance( ) {
    return balance;
  }
  
  public void deposit( int amount ) {
    balance += amount;
  }
  
  public void withdraw( int amount ) {
    balance -= amount;
    if( balance < 0 ) {
      balance -= 5;
    }
  }
  
  public double divide( int a, int b ) {
    
    double result;
    try {
      result = a / b;
    } catch( IllegalArgumentException e ) {
      System.out.println( "Can not divide a number by 0." );
      result = 0;
    }
    return result;
  }
  
}
