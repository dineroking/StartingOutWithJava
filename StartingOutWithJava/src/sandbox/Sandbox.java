package sandbox;

import java.util.StringTokenizer;
import java.text.DecimalFormat;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

public class Sandbox {

	public static void main(String[] args) {
		
		String string1 = "This is a string";
		String string2 = "305-343-8007";
		String string3 = "305.343.8007";
		String string4 = "305 343.8007";
		String string5 = " (305)-343.8007 ";

		String[] splitted1 = string1.split( "(|)| |.|-");
    String[] splitted2 = string2.split( "(|)| |.|-");
    String[] splitted3 = string3.split( "(|)| |.|-");
    String[] splitted4 = string4.split( "(|)| |.|-");
    String[] splitted5 = string5.split( "(|)| |.|-");

    for( String token : splitted1 ){
      System.out.println("*" + token + "*");
    }
		
	}
}
