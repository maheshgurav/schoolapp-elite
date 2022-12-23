package elite.schoolapp.entities;

import java.io.Serializable;
import java.sql.Timestamp;

public class LoginHistory extends Organization implements Serializable {
  private static final long serialVersionUID = 1L;
  private String userUuid;
  private Timestamp lastLogin;
  private Integer failedLoginAttemptCount;
  private LoginStatus loginStatus;

  public String getUserUuid() {
    return userUuid;
  }

  public void setUserUuid(String userUuid) {
    this.userUuid = userUuid;
  }

  public Integer getFailedLoginAttemptCount() {
    return failedLoginAttemptCount;
  }

  public void setFailedLoginAttemptCount(Integer failedLoginAttemptCount) {
    this.failedLoginAttemptCount = failedLoginAttemptCount;
  }

  public LoginStatus getLoginStatus() {
    return loginStatus;
  }

  public void setLoginStatus(LoginStatus loginStatus) {
    this.loginStatus = loginStatus;
  }

  public Timestamp getLastLogin() {
    return lastLogin;
  }

  public void setLastLogin(Timestamp lastLogin) {
    this.lastLogin = lastLogin;
  }
}
