package elite.schoolapp.entities;

public class BankAccountDetails {
  private String IFSCCode;
  private String accountNumber;
  private String nameOfBank;

  public String getIFSCCode() {
    return IFSCCode;
  }

  public void setIFSCCode(String iFSCCode) {
    IFSCCode = iFSCCode;
  }

  public String getAccountNumber() {
    return accountNumber;
  }

  public void setAccountNumber(String accountNumber) {
    this.accountNumber = accountNumber;
  }

  public String getNameOfBank() {
    return nameOfBank;
  }

  public void setNameOfBank(String nameOfBank) {
    this.nameOfBank = nameOfBank;
  }
}
