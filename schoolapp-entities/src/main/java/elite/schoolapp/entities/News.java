package elite.schoolapp.entities;

public class News extends Organization {
  /** */
  private String topic;

  private String description;

  public String getTopic() {
    return topic;
  }

  public void setTopic(String topic) {
    this.topic = topic;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }
}
