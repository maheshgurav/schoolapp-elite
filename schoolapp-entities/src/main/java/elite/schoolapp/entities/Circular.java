package elite.schoolapp.entities;

public class Circular extends Organization {
  private String name;
  private byte[] actualCircular;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public byte[] getActualCircular() {
    return actualCircular;
  }

  public void setActualCircular(byte[] actualCircular) {
    this.actualCircular = actualCircular;
  }
}
