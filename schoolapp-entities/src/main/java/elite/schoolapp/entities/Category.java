package elite.schoolapp.entities;

public class Category extends BasicInfo {
  private Boolean isDefaultForAttendanceReport;

  public Boolean getIsDefaultForAttendanceReport() {
    return isDefaultForAttendanceReport;
  }

  public void setIsDefaultForAttendanceReport(Boolean isDefaultForAttendanceReport) {
    this.isDefaultForAttendanceReport = isDefaultForAttendanceReport;
  }

  @Override
  public String toString() {
    return name;
  }
}
