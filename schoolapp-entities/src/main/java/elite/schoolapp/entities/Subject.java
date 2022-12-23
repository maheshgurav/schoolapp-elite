package elite.schoolapp.entities;

import java.io.Serializable;

public class Subject implements Serializable {
  private static final long serialVersionUID = 1L;
  private String uuid;
  private String name;
  private String code;
  private String defaultForClasses;

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

  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public String getDefaultForClasses() {
    return defaultForClasses;
  }

  public void setDefaultForClasses(String defaultForClasses) {
    this.defaultForClasses = defaultForClasses;
  }
}
