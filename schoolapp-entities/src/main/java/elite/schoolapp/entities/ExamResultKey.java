package elite.schoolapp.entities;

public class ExamResultKey {

  private String studentUuid;
  private String examUuid;
  private String subjectUuid;
  private String standardAndDivision;

  public String getStudentUuid() {
    return studentUuid;
  }

  public void setStudentUuid(String studentUuid) {
    this.studentUuid = studentUuid;
  }

  public String getExamUuid() {
    return examUuid;
  }

  public void setExamUuid(String examUuid) {
    this.examUuid = examUuid;
  }

  public String getSubjectUuid() {
    return subjectUuid;
  }

  public void setSubjectUuid(String subjectUuid) {
    this.subjectUuid = subjectUuid;
  }

  public String getStandardAndDivision() {
    return standardAndDivision;
  }

  public void setStandardAndDivision(String standardAndDivision) {
    this.standardAndDivision = standardAndDivision;
  }
}
