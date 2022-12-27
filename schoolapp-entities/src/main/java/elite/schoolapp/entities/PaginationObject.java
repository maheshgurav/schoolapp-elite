package elite.schoolapp.entities;

import java.util.List;

public class PaginationObject {

  private Long recordCount;
  private List<Object> records;

  public Long getRecordCount() {
    return recordCount;
  }

  public void setRecordCount(Long recordCount) {
    this.recordCount = recordCount;
  }

  public List<Object> getRecords() {
    return records;
  }

  public void setRecords(List<Object> records) {
    this.records = records;
  }
}
