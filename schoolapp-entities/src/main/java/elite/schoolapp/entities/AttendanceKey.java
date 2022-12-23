package elite.schoolapp.entities;

import java.io.Serializable;

public class AttendanceKey implements Serializable {
  private static final long serialVersionUID = 1L;
  private Long absentOn;
  private String studentUuid;

  public AttendanceKey() {
    super();
  }

  public AttendanceKey(Long absentOn, String studentUuid) {
    super();
    this.absentOn = absentOn;
    this.studentUuid = studentUuid;
  }

  public Long getAbsentOn() {
    return absentOn;
  }

  public void setAbsentOn(Long absentOn) {
    this.absentOn = absentOn;
  }

  public String getStudentUuid() {
    return studentUuid;
  }

  public void setStudentUuid(String studentUuid) {
    this.studentUuid = studentUuid;
  }
}
