package sandbox;
import java.text.DecimalFormat;
import javax.swing.JOptionPane;

public class Sandbox {

	public static void main(String[] args) {
		
		final int SUB = 12;
		int[] x = new int[SUB];
		int y = 20;
		for(int i = 0; i < SUB; i++)
		{
		x[i] = y;
		y += 5;
		}
		
		System.out.println( x[8] );
		
	}
}
