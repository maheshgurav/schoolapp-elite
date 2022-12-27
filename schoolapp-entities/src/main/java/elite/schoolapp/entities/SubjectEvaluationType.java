package elite.schoolapp.entities;

public enum SubjectEvaluationType {
  MARKS("MARKS"),
  GRADE("GRADE");

  private final String evaluationTypeName;

  private SubjectEvaluationType(String evaluationTypeName) {
    this.evaluationTypeName = evaluationTypeName;
  }

  public String getEvaluationTypeName() {
    return evaluationTypeName;
  }
}
