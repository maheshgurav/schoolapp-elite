package elite.schoolapp.entities;

public class StudentSubjectDetails {

  private String studentId;
  private String standard;
  private String division;
  private String subjects;

  public String getStudentId() {
    return studentId;
  }

  public void setStudentId(String studentId) {
    this.studentId = studentId;
  }

  public String getStandard() {
    return standard;
  }

  public void setStandard(String standard) {
    this.standard = standard;
  }

  public String getDivision() {
    return division;
  }

  public void setDivision(String division) {
    this.division = division;
  }

  public String getSubjects() {
    return subjects;
  }

  public void setSubjects(String subjects) {
    this.subjects = subjects;
  }
}
