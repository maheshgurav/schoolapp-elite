package elite.schoolapp.entities;

public class Report extends Organization {

  private String reportName;
  private byte[] actualReport;

  public String getReportName() {
    return reportName;
  }

  public void setReportName(String reportName) {
    this.reportName = reportName;
  }

  public byte[] getActualReport() {
    return actualReport;
  }

  public void setActualReport(byte[] actualReport) {
    this.actualReport = actualReport;
  }
}
