package sandbox;
import java.text.DecimalFormat;
import javax.swing.JOptionPane;

public class Sandbox {

	public static void main(String[] args) {
		
		//this is a comment to see if it is transmitted to the remote repository
		
		String name = JOptionPane.showInputDialog(null, "Enter name: ");
		
		
		double x = 45678.259;
		DecimalFormat formatter =
		new DecimalFormat("$,###,##0.000");
		System.out.println(formatter.format(x));
		
		}

}
