package elite.schoolapp.entities;

public class SelectValues {

  public SelectValues() {
    super();
  }

  public SelectValues(String projectionPropertyName) {
    super();
    this.projectionPropertyName = projectionPropertyName;
  }

  private String projectionPropertyName;

  public String getProjectionPropertyName() {
    return projectionPropertyName;
  }

  public void setProjectionPropertyName(String projectionPropertyName) {
    this.projectionPropertyName = projectionPropertyName;
  }
}
