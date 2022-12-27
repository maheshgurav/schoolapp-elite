package elite.schoolapp.entities;

public class Admission extends BasicStudentInfo {
  private String classForAdmission;
  private String marksOrGradeOfLastClass;
  private String lastAttendedUniversity;

  public String getClassForAdmission() {
    return classForAdmission;
  }

  public void setClassForAdmission(String classForAdmission) {
    this.classForAdmission = classForAdmission;
  }

  public String getMarksOrGradeOfLastClass() {
    return marksOrGradeOfLastClass;
  }

  public void setMarksOrGradeOfLastClass(String marksOrGradeOfLastClass) {
    this.marksOrGradeOfLastClass = marksOrGradeOfLastClass;
  }

  public String getLastAttendedUniversity() {
    return lastAttendedUniversity;
  }

  public void setLastAttendedUniversity(String lastAttendedUniversity) {
    this.lastAttendedUniversity = lastAttendedUniversity;
  }
}
