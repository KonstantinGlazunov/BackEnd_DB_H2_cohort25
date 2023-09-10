package de.ait.hw_events_spring_boot.models;

import java.util.Objects;

public class Event {

private String eventName;
private String eventDescription;

    public Event(String eventName, String eventDescription) {
        this.eventName = eventName;
        this.eventDescription = eventDescription;
    }

    public String getEventName() {
        return eventName;
    }

    public String getEventDescription() {
        return eventDescription;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Event event = (Event) o;
        return Objects.equals(eventName, event.eventName) && Objects.equals(eventDescription, event.eventDescription);
    }

    @Override
    public int hashCode() {
        return Objects.hash(eventName, eventDescription);
    }

    @Override
    public String toString() {
        return "Event{" +
                "eventName='" + eventName + '\'' +
                ", eventDescription='" + eventDescription + '\'' +
                '}';
    }
}
