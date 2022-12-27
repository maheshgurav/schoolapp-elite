package elite.schoolapp.entities;

public class ScholarShipDetails extends Organization {

  private String studentUuid;
  private String scholarShipUuid;
  private Long formSubmissionDate;
  private Long senctionedDate;

  public String getStudentUuid() {
    return studentUuid;
  }

  public void setStudentUuid(String studentUuid) {
    this.studentUuid = studentUuid;
  }

  public String getScholarShipUuid() {
    return scholarShipUuid;
  }

  public void setScholarShipUuid(String scholarShipUuid) {
    this.scholarShipUuid = scholarShipUuid;
  }

  public Long getFormSubmissionDate() {
    return formSubmissionDate;
  }

  public void setFormSubmissionDate(Long formSubmissionDate) {
    this.formSubmissionDate = formSubmissionDate;
  }

  public Long getSenctionedDate() {
    return senctionedDate;
  }

  public void setSenctionedDate(Long senctionedDate) {
    this.senctionedDate = senctionedDate;
  }
}
