package elite.schoolapp.entities;

import java.io.Serializable;

public class Tehsil implements Serializable {
  private static final long serialVersionUID = 1L;
  private String uuid;
  private String name;
  private String districtUuid;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getDistrictUuid() {
    return districtUuid;
  }

  public void setDistrictUuid(String districtUuid) {
    this.districtUuid = districtUuid;
  }

  public void setUuid(String uuid) {
    this.uuid = uuid;
  }

  public String getUuid() {
    return uuid;
  }
}
