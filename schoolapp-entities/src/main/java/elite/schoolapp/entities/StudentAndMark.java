package elite.schoolapp.entities;

import java.io.Serializable;

public class StudentAndMark implements Serializable {
  private static final long serialVersionUID = 1L;
  private String uuid;
  private String marks;

  public String getUuid() {
    return uuid;
  }

  public void setUuid(String uuid) {
    this.uuid = uuid;
  }

  public String getMarks() {
    return marks;
  }

  public void setMarks(String marks) {
    this.marks = marks;
  }
}
