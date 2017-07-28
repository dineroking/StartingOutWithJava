package TDD.BankAccount;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Ronny Rosabal.
 * Date:      7/27/2017
 * Objective: Class to help me understand how the TDD process works.
 */
public class BankAccountTest {
  
  @Test
  public void testDeposits() {
    
    BankAccount acc = new BankAccount();
    acc.deposit( 50 );
    assertEquals( 50, acc.getBalance() );
  }
  
  @Test
  public void testWithdrawals() {
    
    BankAccount acc = new BankAccount( 75 );
    acc.withdraw( 50 );
    assertEquals( 25, acc.getBalance() );
  }
  
  @Test
  public void testWithdrawalsWithPenalty( ) {
  
    BankAccount acc = new BankAccount( 10 );
    acc.withdraw( 20 );
    assertEquals( -15, acc.getBalance() );
  }
}