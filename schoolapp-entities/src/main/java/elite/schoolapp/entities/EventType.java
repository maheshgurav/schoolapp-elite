package elite.schoolapp.entities;

public enum EventType {
  Birthday("1"),
  Holiday("2");

  private final String eventType;

  private EventType(String eventType) {
    this.eventType = eventType;
  }

  public String getEventType() {
    return eventType;
  }
}
