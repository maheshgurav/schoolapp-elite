package elite.schoolapp.entities;

public class SubjectsForExam {

  private  String uuid;
  private String subjectUuid;
  private SubjectEvaluationType subjectEvaluationType;
  private String marksOrGradesRequiredForPassing;
  private String examUuid;

  public String getUuid() {
    return uuid;
  }

  public void setUuid( String uuid) {
    this.uuid = uuid;
  }

  public String getSubjectUuid() {
    return subjectUuid;
  }

  public void setSubjectUuid(String subjectUuid) {
    this.subjectUuid = subjectUuid;
  }

  public SubjectEvaluationType getSubjectEvaluationType() {
    return subjectEvaluationType;
  }

  public void setSubjectEvaluationType(SubjectEvaluationType subjectEvaluationType) {
    this.subjectEvaluationType = subjectEvaluationType;
  }

  public String getMarksOrGradesRequiredForPassing() {
    return marksOrGradesRequiredForPassing;
  }

  public void setMarksOrGradesRequiredForPassing(String marksOrGradesRequiredForPassing) {
    this.marksOrGradesRequiredForPassing = marksOrGradesRequiredForPassing;
  }

  public String getExamUuid() {
    return examUuid;
  }

  public void setExamUuid(String examUuid) {
    this.examUuid = examUuid;
  }
}
