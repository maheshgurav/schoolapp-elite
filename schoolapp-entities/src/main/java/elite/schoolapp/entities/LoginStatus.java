package elite.schoolapp.entities;

public enum LoginStatus {
  FAILURE(0),
  SUCCESS(1);

  private final Integer status;

  private LoginStatus(Integer status) {
    this.status = status;
  }

  public Integer getStatus() {
    return status;
  }
}
