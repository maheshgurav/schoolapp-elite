package elite.schoolapp.entities;

public class ClassInfo extends Organization {
  private String standardOrClass;
  private String division;
  private String schoolTypeUuid;
  private String classTeacherUuid;
  private String subjectsAndTeachers;

  public String getStandardOrClass() {
    return standardOrClass;
  }

  public void setStandardOrClass(String standardOrClass) {
    this.standardOrClass = standardOrClass;
  }

  public String getDivision() {
    return division;
  }

  public void setDivision(String division) {
    this.division = division;
  }

  public String getSchoolTypeUuid() {
    return schoolTypeUuid;
  }

  public void setSchoolTypeUuid(String schoolTypeUuid) {
    this.schoolTypeUuid = schoolTypeUuid;
  }

  @Override
  public String toString() {
    return standardOrClass + " - " + division;
  }

  public String getClassTeacherUuid() {
    return classTeacherUuid;
  }

  public void setClassTeacherUuid(String classTeacherUuid) {
    this.classTeacherUuid = classTeacherUuid;
  }

  public String getSubjectsAndTeachers() {
    return subjectsAndTeachers;
  }

  public void setSubjectsAndTeachers(String subjectsAndTeachers) {
    this.subjectsAndTeachers = subjectsAndTeachers;
  }
}
