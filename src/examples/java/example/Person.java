package example;

/**
 * This is example of a person
 */
public class Person {

  private final String firstName;
  private final String lastName;
  private final String email;

  /**
   * Creates a new person instance
   */
  public Person(String firstName, String lastName, String email) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.email = email;
  }

  /**
   * @return first name of this person
   */
  public String getFirstName() {
    return firstName;
  }

  /**
   * @return last name of this person
   */
  public String getLastName() {
    return lastName;
  }

  /**
   * @return email of this person
   */
  public String getEmail() {
    return email;
  }
}
