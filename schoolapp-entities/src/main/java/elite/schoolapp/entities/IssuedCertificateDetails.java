package elite.schoolapp.entities;

import java.io.Serializable;
import java.sql.Timestamp;

public class IssuedCertificateDetails implements Serializable {
  private static final long serialVersionUID = 1L;
  private String studentUuid;
  private String certificateUuid;
  private Timestamp dateOfIssue;

  public String getStudentUuid() {
    return studentUuid;
  }

  public void setStudentUuid(String studentUuid) {
    this.studentUuid = studentUuid;
  }

  public String getCertificateUuid() {
    return certificateUuid;
  }

  public void setCertificateUuid(String certificateUuid) {
    this.certificateUuid = certificateUuid;
  }

  public Timestamp getDateOfIssue() {
    return dateOfIssue;
  }

  public void setDateOfIssue(Timestamp dateOfIssue) {
    this.dateOfIssue = dateOfIssue;
  }
}
