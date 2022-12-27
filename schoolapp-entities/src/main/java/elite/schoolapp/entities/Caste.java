package elite.schoolapp.entities;

public class Caste {

  private String categoryUuid;
  private String religion;
  private String subcaste;
  private Boolean isMinority;
  private  String uuid;
  private Boolean isDefaultForAttendanceReport;

  public Caste() {}

  public Caste(String categoryUuid, String religion, String subcaste, Boolean isMinority) {
    this.categoryUuid = categoryUuid;
    this.religion = religion;
    this.subcaste = religion;
    this.isMinority = isMinority;
  }

  public void setUuid( String uuid) {
    this.uuid = uuid;
  }

  public String getUuid() {
    return uuid;
  }

  public String getCategoryUuid() {
    return categoryUuid;
  }

  public void setCategoryUuid(String categoryUuid) {
    this.categoryUuid = categoryUuid;
  }

  public String getReligion() {
    return religion;
  }

  public void setReligion(String religion) {
    this.religion = religion;
  }

  public String getSubcaste() {
    return subcaste;
  }

  public void setSubcaste(String subcaste) {
    this.subcaste = subcaste;
  }

  public Boolean getIsMinority() {
    return isMinority;
  }

  public void setIsMinority(Boolean isMinority) {
    this.isMinority = isMinority;
  }

  public Boolean getIsDefaultForAttendanceReport() {
    return isDefaultForAttendanceReport;
  }

  public void setIsDefaultForAttendanceReport(Boolean isDefaultForAttendanceReport) {
    this.isDefaultForAttendanceReport = isDefaultForAttendanceReport;
  }

  @Override
  public String toString() {
    if (religion != null && !religion.isEmpty() && subcaste != null && !subcaste.isEmpty())
      return religion + " - " + subcaste;
    if (religion == null && subcaste != null && !subcaste.isEmpty()) return subcaste;
    if (religion != null && (subcaste == null || subcaste.isEmpty())) return religion;
    return subcaste;
  }
}
