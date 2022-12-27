package elite.schoolapp.entities;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class Name {

  @Column(columnDefinition = "varchar(64)")
  private String firstName;

  @Column(columnDefinition = "varchar(64)")
  private String lastName;

  @Column(columnDefinition = "varchar(64)")
  private String middleName;

  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public String getMiddleName() {
    return middleName;
  }

  public void setMiddleName(String middleName) {
    this.middleName = middleName;
  }

  @Override
  public String toString() {
    return firstName + " " + middleName + " " + lastName;
  }

  public String toStringSurnameFirst() {
    return lastName + " " + firstName + " " + middleName;
  }
}
