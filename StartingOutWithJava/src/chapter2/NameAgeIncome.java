package chapter2;

public class NameAgeIncome {

	public static void main(String[] args) {

		Person ronny = new Person("Ronny", "Rosabal", "Male", 34);  // a new person object
		ronny.setIncome(90000);
		
		String print; 									// the string to print out
		
		print = "My name is " + ronny.getfName() + " " + ronny.getlName() + ", my age is " 
		+ ronny.getAge() + " and\nI hope to earn " + ronny.getIncome() + " per year.";
		
		// print string
		
		System.out.print(print);
	}

}
