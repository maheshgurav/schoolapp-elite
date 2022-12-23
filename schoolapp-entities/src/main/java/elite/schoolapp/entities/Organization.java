package elite.schoolapp.entities;

import java.io.Serializable;

public class Organization implements Serializable {

  private static final long serialVersionUID = 1L;
  private String uuid;
  private String schoolUuid;
  private String organizationUuid;

  public String getUuid() {
    return uuid;
  }

  public void setUuid(String uuid) {
    this.uuid = uuid;
  }

  public String getSchoolUuid() {
    return schoolUuid;
  }

  public void setSchoolUuid(String schoolUuid) {
    this.schoolUuid = schoolUuid;
  }

  public String getOrganizationUuid() {
    return organizationUuid;
  }

  public void setOrganizationUuid(String organizationUuid) {
    this.organizationUuid = organizationUuid;
  }
}
