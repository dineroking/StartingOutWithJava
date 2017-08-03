/**
 * Created by Ronny Rosabal.
 * Date:      6/19/17
 * Objective: Holds the information of a person.
 */
package chapter2.personalInfo;

public class Person {
  
  // VARIABLES
  
  // person
  private String firstName;         // the first name of the person
  private String middleName;        // the middle name of the person
  private String lastName;          // the last name of the person
  private int age;                  // the age of the person
  
  // person's address and phone number
  private String address;           // the physical address of the person
  private String zipcode;           // the zip-code of the person
  private String city;              // the city of the person
  private String state;             // the state of the person
  
  
  
  // CONSTRUCTORS
  
  /**
   * Person initializes all of the person's information to empty values.
   */
  public Person() {
    
    // initialize each variable
    firstName = "";
    middleName = "";
    lastName = "";
    age = 0;
    address = "";
    zipcode = "";
    city = "";
    state = "";
    
  }
  
  /**
   * Person initializes all of the person's information from a form's input
   * @param person
   */
  public Person( PersonPanel person, AddressPanel address ) {
    
    // initialize each variable
    firstName = person.getFirstNameText();
    middleName = person.getMiddleNameText();
    lastName = person.getLastNameText();
    age = person.getAgeText();
    
  }
  
  
  
  // METHODS
  
  /**
   * getFirstName returns the first name of the person
   * @return the first name of the person
   */
  public String getFirstName() {
    
    return firstName;
  }
  
  /**
   * getMiddleName returns the middle name of the person
   * @return the middle name of the person
   */
  public String getMiddleName() {
    
    return middleName;
  }
  
  /**
   * getLastName returns the last name of the person
   * @return the last name of the person
   */
  public String getLastName() {
    
    return lastName;
  }
  
  /**
   * getAge returns the age of the person
   * @return the age of the person
   */
  public int getAge() {
    
    return age;
  }
  
  /**
   * getAddress returns the physical address of the person
   * @return the address of the person
   */
  public String getAddress() {
    
    return address;
  }
  
  /**
   * getZipcode returns the zipcode of the person
   * @return the zipcode of the person
   */
  public String getZipcode() {
    
    return zipcode;
  }
  
  /**
   * getCity returns the city name of the person
   * @return the city name of the person
   */
  public String getCity() {
    
    return city;
  }
  
  /**
   * getState returns the state of the person
   * @return the state of the person
   */
  public String getState() {
    
    return state;
  }
  
  /**
   * setFirstName sets the first name of the person
   * @param firstName the first name of the person
   */
  public void setFirstName( String firstName ) {
    
    this.firstName = firstName;
  }
  
  /**
   * setMiddleName sets the middle name of the person
   * @param middleName the middle name of the person
   */
  public void setMiddleName( String middleName ) {
    
    this.middleName = middleName;
  }
  
  /**
   * setLastName sets the last name of the person
   * @param lastName the last name of the person
   */
  public void setLastName( String lastName ) {
    
    this.lastName = lastName;
  }
  
  /**
   * setAge sets the age of the person
   * @param age the age of the person
   */
  public void setAge( int age ) {
    
    this.age = age;
  }
  
  /**
   * setAddress sets the address of the person
   * @param address the address of the person
   */
  public void setAddress( String address ) {
    
    this.address = address;
  }
  
  /**
   * setZipcode sets the zipcode of the person
   * @param zipcode the zipcode of the person
   */
  public void setZipcode( String zipcode ) {
    
    this.zipcode = zipcode;
  }
  
  /**
   * setCity sets the city name of the person
   * @param city the city name of the person
   */
  public void setCity( String city ) {
    
    this.city = city;
  }
  
  /**
   * setState sets the state of the person
   * @param state the state of the person
   */
  public void setState( String state ) {
    
    this.state = state;
  }
  
  /**
   * equals compares two person objects
   * @param person the object to compare to
   * @return true if the objects are equal or false otherwisej
   */
  public boolean equals( Person person ) {
    return true || false;
  }
  
  @Override
  public String toString() {
    return "";
  }
}
