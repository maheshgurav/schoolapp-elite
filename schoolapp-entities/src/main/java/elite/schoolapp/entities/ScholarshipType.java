package elite.schoolapp.entities;

public class ScholarshipType extends BasicInfo {
  private Boolean isDefaultForAttendanceReport;

  public Boolean getIsDefaultForAttendanceReport() {
    return isDefaultForAttendanceReport;
  }

  public void setIsDefaultForAttendanceReport(Boolean isDefaultForAttendanceReport) {
    this.isDefaultForAttendanceReport = isDefaultForAttendanceReport;
  }
}
