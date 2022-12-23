package elite.schoolapp.entities;

import java.io.Serializable;

public class RemovedStudentHistory implements Serializable {
  private static final long serialVersionUID = 1L;
  private String studentUuid;
  private Long dateOfRemoving;
  private String reasonOfRemovingFromCatalog;

  public String getStudentUuid() {
    return studentUuid;
  }

  public void setStudentUuid(String studentUuid) {
    this.studentUuid = studentUuid;
  }

  public Long getDateOfRemoving() {
    return dateOfRemoving;
  }

  public void setDateOfRemoving(Long dateOfRemoving) {
    this.dateOfRemoving = dateOfRemoving;
  }

  public String getReasonOfRemovingFromCatalog() {
    return reasonOfRemovingFromCatalog;
  }

  public void setReasonOfRemovingFromCatalog(String reasonOfRemovingFromCatalog) {
    this.reasonOfRemovingFromCatalog = reasonOfRemovingFromCatalog;
  }
}
