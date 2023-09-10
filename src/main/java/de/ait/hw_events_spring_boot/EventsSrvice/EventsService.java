package de.ait.hw_events_spring_boot.EventsSrvice;

import de.ait.hw_events_spring_boot.models.Event;

import java.util.List;

public interface EventsService {
    Event addEvent(String eventName, String eventDescription);

    List <Event> getAllEvents();
}
