package elite.schoolapp.entities;

import java.io.Serializable;

public class ExtraCurricularActivitiyDetails implements Serializable {
  private static final long serialVersionUID = 1L;
  private String studentUuid;
  private String activityName;
  private String priceDetails;

  public String getStudentUuid() {
    return studentUuid;
  }

  public void setStudentUuid(String studentUuid) {
    this.studentUuid = studentUuid;
  }

  public String getActivityName() {
    return activityName;
  }

  public void setActivityName(String activityName) {
    this.activityName = activityName;
  }

  public String getPriceDetails() {
    return priceDetails;
  }

  public void setPriceDetails(String priceDetails) {
    this.priceDetails = priceDetails;
  }
}
