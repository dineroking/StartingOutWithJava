package midterm;

import javax.swing.JOptionPane;
import java.text.DecimalFormat;

public class CurrencyConverter {

	public static void main(String[] args) {
		
		// establish conversion rates 
		final double US_TO_EURO = .75;
		final double US_TO_YEN = 99.3526;
		double usDollars, euro, yen;
		String output;
		
		DecimalFormat usFormat = new DecimalFormat("$#,##0.00");
		DecimalFormat euroFormat = new DecimalFormat("\u20AC#,##0.00");
		DecimalFormat yenFormat = new DecimalFormat("\u00A5#,##0.00");
		
		usDollars = Double.parseDouble(JOptionPane.showInputDialog(null, "Enter US amount to convert: "));
		euro = usDollars * US_TO_EURO;
		yen = usDollars * US_TO_YEN;
		
		output = usFormat.format(usDollars) + " = " + euroFormat.format(euro) + ", or " + yenFormat.format(yen);

		JOptionPane.showMessageDialog(null, output);
		
	}

}
