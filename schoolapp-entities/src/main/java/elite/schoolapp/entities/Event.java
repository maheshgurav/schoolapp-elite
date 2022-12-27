package elite.schoolapp.entities;

public class Event {

  private  String uuid;
  private String name;
  private String description;
  private Long date;
  private EventType typeOfEvent;

  public String getUuid() {
    return uuid;
  }

  public void setUuid( String uuid) {
    this.uuid = uuid;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public Long getDate() {
    return date;
  }

  public void setDate(Long date) {
    this.date = date;
  }

  public EventType getTypeOfEvent() {
    return typeOfEvent;
  }

  public void setTypeOfEvent(EventType typeOfEvent) {
    this.typeOfEvent = typeOfEvent;
  }
}
