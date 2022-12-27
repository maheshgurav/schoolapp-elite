package elite.schoolapp.entities;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class Address {

  @Column(columnDefinition = "varchar(255)")
  private String address;

  @Column(columnDefinition = "varchar(64)")
  private String state;

  @Column(columnDefinition = "varchar(10)")
  private String pinCodeNumber;

  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public String getState() {
    return state;
  }

  public void setState(String state) {
    this.state = state;
  }

  public String getPinCodeNumber() {
    return pinCodeNumber;
  }

  public void setPinCodeNumber(String pinCodeNumber) {
    this.pinCodeNumber = pinCodeNumber;
  }

  @Override
  public String toString() {
    String addressString = "";
    addressString = addressString + ",";
    if (state != null && !state.isEmpty()) addressString = addressString + state + ",";
    if (pinCodeNumber != null && !pinCodeNumber.isEmpty())
      addressString = addressString + pinCodeNumber;
    addressString = addressString.replace(",,", "");
    if (addressString.endsWith(","))
      addressString = addressString.substring(0, addressString.length() - 1);
    return addressString;
  }
}
