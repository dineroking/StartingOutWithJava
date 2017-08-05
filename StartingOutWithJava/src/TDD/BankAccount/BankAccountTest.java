package TDD.BankAccount;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Ronny Rosabal.
 * Date:      7/27/2017
 * Objective: Class to help me understand how the TDD process works.
 */
public class BankAccountTest {
  
  BankAccount acc;
  
  @Test
  public void testDeposits() {
    
    BankAccount acc = new BankAccount();                // Arrange
    acc.deposit( 50 );                          // Act
    assertEquals( 50, acc.getBalance() );     // Assert
  }
  
  @Test
  public void testWithdrawal() {
    
    assertFalse( acc.withdraw( 10000 ) );         // check that no amounts greater than 1000 are withdrawed
    assertEquals( 100, acc.getBalance() );          // verify that the balance was unchanged
    
    acc.withdraw( 50 );
    assertEquals( 50, acc.getBalance() );
  }
  
  @Test
  public void testWithdrawalsWithPenalty( ) {
  
    acc.withdraw( 110 );
    assertEquals( -15, acc.getBalance() );
  }
  
  // the following line tells JUnit that if during the test an IllegalArgumentException is thrown to still pass the test
  // but any other types of exceptions should fail the test
  @Test ( expected = IllegalArgumentException.class )
  public void testDivisionException() {
    
    int a = 5, b = 0;
    acc.divide( a, b );          // should throw an exception
    
  }
  
  
  
  @Before
  public void setup( ) {
  
    acc = new BankAccount( 100 );
    
  }
  
  @After
  public void teardown() {
  
  }
  
}