/*
 * Ronny Rosabal
 * Programming Fundamentals III
 * COSC 2336 2801
 * 01.22.17
 * Tests the Payroll class
 */
package payroll;

public class PayrollDemo {
  
  public static void main( String[] args ) throws Exception{
    
    // object without errors
    Payroll ronny = new Payroll( "Ronny", "sf5651", 58, 19.5 );
    System.out.print( ronny );
  }
}
