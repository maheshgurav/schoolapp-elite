package elite.schoolapp.entities;

public class StaffAndTeacherCommon extends GeneralInformation {

  private String qualification;
  private String designation;
  private String panCardNumber;
  private Long joiningDate;
  private String bankAccountDetails;
  private LoginInformation loginInformation;

  public String getQualification() {
    return qualification;
  }

  public void setQualification(String qualification) {
    this.qualification = qualification;
  }

  public String getDesignation() {
    return designation;
  }

  public void setDesignation(String designation) {
    this.designation = designation;
  }

  public String getPanCardNumber() {
    return panCardNumber;
  }

  public void setPanCardNumber(String panCardNumber) {
    this.panCardNumber = panCardNumber;
  }

  public Long getJoiningDate() {
    return joiningDate;
  }

  public void setJoiningDate(Long joiningDate) {
    this.joiningDate = joiningDate;
  }

  public String getBankAccountDetails() {
    return bankAccountDetails;
  }

  public void setBankAccountDetails(String bankAccountDetails) {
    this.bankAccountDetails = bankAccountDetails;
  }

  public LoginInformation getLoginInformation() {
    return loginInformation;
  }

  public void setLoginInformation(LoginInformation loginInformation) {
    this.loginInformation = loginInformation;
  }
}
