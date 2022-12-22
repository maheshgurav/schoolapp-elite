package elite.schoolapp.entities;

import java.io.Serializable;

public class Attendance implements Serializable {
  private static final long serialVersionUID = 1L;
  private AttendanceKey attendanceKey;

  public AttendanceKey getAttendanceKey() {
    return attendanceKey;
  }

  public void setAttendanceKey(AttendanceKey attendanceKey) {
    this.attendanceKey = attendanceKey;
  }
}
