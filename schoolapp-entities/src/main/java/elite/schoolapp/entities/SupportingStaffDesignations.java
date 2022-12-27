package elite.schoolapp.entities;

public class SupportingStaffDesignations {

  private String name;
  private Boolean hasAssociatedLoginInformation;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Boolean getHasAssociatedLoginInformation() {
    return hasAssociatedLoginInformation;
  }

  public void setHasAssociatedLoginInformation(Boolean hasAssociatedLoginInformation) {
    this.hasAssociatedLoginInformation = hasAssociatedLoginInformation;
  }
}
