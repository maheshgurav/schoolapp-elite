package elite.schoolapp.entities;

import java.io.Serializable;

public class Certificate implements Serializable {
  private static final long serialVersionUID = 1L;

  private String name;
  private Float feePerCertificate;
  private String uuid;

  public void setUuid(String uuid) {
    this.uuid = uuid;
  }

  public String getUuid() {
    return uuid;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Float getFeePerCertificate() {
    return feePerCertificate;
  }

  public void setFeePerCertificate(Float feePerCertificate) {
    this.feePerCertificate = feePerCertificate;
  }
}
