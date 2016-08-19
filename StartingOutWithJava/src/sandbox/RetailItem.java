package sandbox;

public class RetailItem {
	private String description;		// Item description    
	private int unitsOnHand;		// Number of units on hand    
	private double price;			// Unit price     
	
	/**
    This constructor initializes the item's
    description, units on hand, and price with
    values passed as arguments.
    @param d The item's description.
    @param u The number of units on hand.
    @param p The item's price.
	 */
	 public RetailItem( String d, int u, double p ){
		 description = d;
		 unitsOnHand = u;
		 price = p;
	 } 
}
