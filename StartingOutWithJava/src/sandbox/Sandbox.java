package sandbox;

import java.util.StringTokenizer;
import java.text.DecimalFormat;
import javax.swing.JOptionPane;

public class Sandbox {

	public static void main(String[] args) {
		
		/*
		 * this is a comment
		 */
		
		// this is another comment
		
		
		String str = "red$green&blue#orange";
		String [] tokens = str.split("[$&#]");
		for( String token : tokens){
			System.out.println( token );
		}
		
	}
}
