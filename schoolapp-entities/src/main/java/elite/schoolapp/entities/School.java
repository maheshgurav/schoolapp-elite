package elite.schoolapp.entities;

import java.io.Serializable;

public class School implements Serializable {
  /** */
  private static final long serialVersionUID = 1L;

  private String uuid;
  private String organizationUuid;
  private String name;
  private String address;
  private byte[] imageOrLogo;

  public String getUuid() {
    return uuid;
  }

  public void setUuid(String uuid) {
    this.uuid = uuid;
  }

  public String getOrganizationUuid() {
    return organizationUuid;
  }

  public void setOrganizationUuid(String organizationUuid) {
    this.organizationUuid = organizationUuid;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public byte[] getImageOrLogo() {
    return imageOrLogo;
  }

  public void setImageOrLogo(byte[] imageOrLogo) {
    this.imageOrLogo = imageOrLogo;
  }
}
