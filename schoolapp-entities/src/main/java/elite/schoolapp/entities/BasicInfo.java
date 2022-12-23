package elite.schoolapp.entities;

import java.io.Serializable;

public class BasicInfo implements Serializable {
  private static final long serialVersionUID = 1L;
  private String uuid;
  protected String name;

  public String getUuid() {
    return uuid;
  }

  public void setUuid(String uuid) {
    this.uuid = uuid;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }
}
