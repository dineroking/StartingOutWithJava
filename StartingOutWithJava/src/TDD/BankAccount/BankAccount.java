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
  
  public boolean withdraw( int amount ) {
    
    if( amount > 1000 ) {
      return false;
    }
    
    balance -= amount;
    if( balance < 0 ) {
      balance -= 5;
    }
    return true;
  }
  
  public double divide( int a, int b ) {
    
    double result;
    
    if( b == 0 ) {
      throw new IllegalArgumentException( "Zero cannot be used as a denominator." );
    } else {
      result = a / b;
    }
    
    return result;
  }
  
}
