/*
 * Challenge: 5. Sales Prediction
 * Date: 08.29.16
 */

package chapter2;

import javax.swing.JOptionPane;
import java.text.DecimalFormat;

public class SalesPrediction {

	public static void main(String[] args) {
		
		double sales = 0.0; 						// total sales of the company
		final double SALES_PERCENT = .62;			// percentage of sales
		double storeSales; 							// total sales of a particular store
		DecimalFormat currency;						// the format for the money
		
		currency = new DecimalFormat("$###,###.00");
		
		sales = Double.parseDouble(JOptionPane.showInputDialog(null, "Enter total sales amount."));
		
		storeSales = sales * SALES_PERCENT;
		
		JOptionPane.showMessageDialog(null, currency.format(storeSales));

	}

}
