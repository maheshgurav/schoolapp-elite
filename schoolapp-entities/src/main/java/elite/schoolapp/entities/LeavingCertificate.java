package elite.schoolapp.entities;

public class LeavingCertificate {

  private String studentUuid;
  private String progress;
  private String conduct;
  private String reasonOfLeaving;
  private String remark;
  private Long dateOfLeaving;
  private String studyingSinceMonthAndYear;

  public String getStudentUuid() {
    return studentUuid;
  }

  public void setStudentUuid(String studentUuid) {
    this.studentUuid = studentUuid;
  }

  public String getProgress() {
    return progress;
  }

  public void setProgress(String progress) {
    this.progress = progress;
  }

  public String getConduct() {
    return conduct;
  }

  public void setConduct(String conduct) {
    this.conduct = conduct;
  }

  public String getReasonOfLeaving() {
    return reasonOfLeaving;
  }

  public void setReasonOfLeaving(String reasonOfLeaving) {
    this.reasonOfLeaving = reasonOfLeaving;
  }

  public String getRemark() {
    return remark;
  }

  public void setRemark(String remark) {
    this.remark = remark;
  }

  public Long getDateOfLeaving() {
    return dateOfLeaving;
  }

  public void setDateOfLeaving(Long dateOfLeaving) {
    this.dateOfLeaving = dateOfLeaving;
  }

  public String getStudyingSinceMonthAndYear() {
    return studyingSinceMonthAndYear;
  }

  public void setStudyingSinceMonthAndYear(String studyingSinceMonthAndYear) {
    this.studyingSinceMonthAndYear = studyingSinceMonthAndYear;
  }
}
