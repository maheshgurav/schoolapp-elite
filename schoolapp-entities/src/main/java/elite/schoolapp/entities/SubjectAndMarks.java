package elite.schoolapp.entities;

public class SubjectAndMarks {

  private String subject;
  private String marks;
  private String marksRequiredForPassing;

  public String getSubject() {
    return subject;
  }

  public void setSubject(String subject) {
    this.subject = subject;
  }

  public String getMarks() {
    return marks;
  }

  public void setMarks(String marks) {
    this.marks = marks;
  }

  public String getMarksRequiredForPassing() {
    return marksRequiredForPassing;
  }

  public void setMarksRequiredForPassing(String marksRequiredForPassing) {
    this.marksRequiredForPassing = marksRequiredForPassing;
  }
}
