package elite.schoolapp.entities;

import java.io.Serializable;

public class District implements Serializable {
  private static final long serialVersionUID = 1L;
  private String uuid;
  private String name;
  private String stateUuid;

  public String getUuid() {
    return uuid;
  }

  public void setUuid(String uuid) {
    this.uuid = uuid;
  }

  public String getStateUuid() {
    return stateUuid;
  }

  public void setStateUuid(String stateUuid) {
    this.stateUuid = stateUuid;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }
}
