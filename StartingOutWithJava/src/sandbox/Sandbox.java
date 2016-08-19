package sandbox;
import java.text.DecimalFormat;
import javax.swing.JOptionPane;

public class Sandbox {

	public static void main(String[] args) {
		
		int x = 10, y = 20;
		while (y < 100)
		{
		x += y;
		y += 20;
		}
		
		System.out.println( x );
		
	}
}
