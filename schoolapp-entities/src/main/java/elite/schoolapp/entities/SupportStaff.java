package elite.schoolapp.entities;

public class SupportStaff extends StaffAndTeacherCommon {

  private String qualification;
  private String designation;

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
}
