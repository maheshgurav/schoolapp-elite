package elite.schoolapp.entities;

public class ExamResult {

  private ExamResultKey examResultKey;
  private String marks;

  public ExamResultKey getExamResultKey() {
    return examResultKey;
  }

  public void setExamResultKey(ExamResultKey examResultKey) {
    this.examResultKey = examResultKey;
  }

  public String getMarks() {
    return marks;
  }

  public void setMarks(String marks) {
    this.marks = marks;
  }
}
