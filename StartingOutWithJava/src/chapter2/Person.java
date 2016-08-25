package chapter2;

public class Person {
	
	// FIELDS
	
	private double income;						// annual income of the person
	private String address,						// address of the person
				   city,						// city of the person
				   state,						// state of the person
				   zip,							// zip code of the person
				   phone,						// phone of the person
				   major,						// college major of the person
				   fName,						// first name of the person
				   lName,						// last name of the person
				   gender;						// gender of the person
	private int age;							// the age of the person
	
	// CONSTRUCTORS
	//TODO: decide if this is needed inside of the constructor
	public Person( String firstName, String lastName, String gender, int age ){
		this.fName = firstName;						
		this.lName = lastName;						
		this.gender = gender;						
		this.age = age;
		income = 0.0;
		address = "";
		city = "";
		state = "";
		zip = "";
		phone = "";
		major = "";
	}

	// MUTATORS
	
	/**
	 * Sets the income of the person
	 * @param income - annual income of the person
	 */
	public void setIncome(double income) {
		this.income = income;
	}

	/**
	 * Sets the address of the person
	 * @param address - physical address of the person
	 */
	public void setAddress(String address) {
		this.address = address;
	}

	/**
	 * Sets the city where the person lives
	 * @param city - city of the person
	 */
	public void setCity(String city) {
		this.city = city;
	}

	/**
	 * Sets the state where the person lives
	 * @param state - state of the person
	 */
	public void setState(String state) {
		this.state = state;
	}

	/**
	 * Sets the zip code of where the person lives
	 * @param zip - the zip code of the person
	 */
	public void setZip(String zip) {
		this.zip = zip;
	}

	/**
	 * Sets the phone number of the person
	 * @param phone - phone number of the person
	 */
	public void setPhone(String phone) {
		this.phone = phone;
	}

	/**
	 * Sets the major that the person is studying
	 * @param major - major of the person
	 */
	public void setMajor(String major) {
		this.major = major;
	}

	/**
	 * Sets the first name of the person
	 * @param fName - first name of the person
	 */
	public void setfName(String fName) {
		this.fName = fName;
	}

	/**
	 * Sets the last name of the person
	 * @param lName - last name of the person
	 */
	public void setlName(String lName) {
		this.lName = lName;
	}

	/**
	 * Sets the gender of the person
	 * @param gender - gender of the person
	 */
	public void setGender(String gender) {
		this.gender = gender;
	}

	/**
	 * Sets the age of the person
	 * @param age - age of the person
	 */
	public void setAge(int age) {
		this.age = age;
	}

	// ACCESSORS
	
	/**
	 * Gets the income of the person
	 * @return the income of the person
	 */
	public double getIncome() {
		return income;
	}

	/**
	 * Gets the address of the person
	 * @return the address of the person
	 */
	public String getAddress() {
		return address;
	}

	/**
	 * Gets the city of the person
	 * @return the city of the person
	 */
	public String getCity() {
		return city;
	}

	/**
	 * Gets the state of the person
	 * @return the state of the person
	 */
	public String getState() {
		return state;
	}

	/**
	 * Gets the zip code of the person
	 * @return zip code of the person
	 */
	public String getZip() {
		return zip;
	}

	/**
	 * Gets the phone of the person
	 * @return the phone number of the person
	 */
	public String getPhone() {
		return phone;
	}

	/**
	 * Gets the major of the person
	 * @return major of the person
	 */
	public String getMajor() {
		return major;
	}

	/**
	 * Gets the first name of the person
	 * @return name of the person
	 */
	public String getfName() {
		return fName;
	}

	/**
	 * Gets the last name of the person
	 * @return last name of the person
	 */
	public String getlName() {
		return lName;
	}

	/**
	 * Gets the gender of the person
	 * @return gender of the person
	 */
	public String getGender() {
		return gender;
	}

	/**
	 * Gets the age of the person
	 * @return age of the person
	 */
	public int getAge() {
		return age;
	}

}
