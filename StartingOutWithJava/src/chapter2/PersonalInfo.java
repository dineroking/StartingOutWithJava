/*
 * Challenge: 3. Personal Information
 */

package chapter2;

public class PersonalInfo {

	public static void main(String[] args) {
		
		Person ronny = new Person("Ronny", "Rosabal", "Male", 34);
		ronny.setmName("Alain"); 							// set the middle name 
		ronny.setAddress("1831 Macondray Dr");				// sets the address
		ronny.setCity("Humble");							// sets the city
		ronny.setState("TX");								// sets the state
		ronny.setZip("77396");								// sets the zip-code
		ronny.setPhone("305-343-8007");						// sets the phone number
		ronny.setMajor("Electrical Engineering"); 			// sets the major
		
		// print string
		
		String print;										// string to be printed
		
		print = ronny.getfName() + " " + ronny.getmName().charAt(0) + ". " + ronny.getlName();
		print += "\n" + ronny.getAddress();
		print += "\n" + ronny.getCity() + ", " + ronny.getState() + " " + ronny.getZip();
		print += "\nphone: " + ronny.getPhone();
		print += "\nmajor: " + ronny.getMajor();
		
		System.out.println(print);
	}

}
