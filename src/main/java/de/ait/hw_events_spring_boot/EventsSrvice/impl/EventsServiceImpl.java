package de.ait.hw_events_spring_boot.EventsSrvice.impl;

import de.ait.hw_events_spring_boot.EventsSrvice.EventsService;
import de.ait.hw_events_spring_boot.models.Event;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import repositories.EventsRepository;

import java.util.List;
@Service
public class EventsServiceImpl implements EventsService {

    private final EventsRepository eventsRepository;

    public EventsServiceImpl(EventsRepository eventsRepository) {
        this.eventsRepository = eventsRepository;
    }

    @Override
    public Event addEvent(String eventName, String eventDescription) {
        Event event = new Event(eventName, eventDescription);
        eventsRepository.save(event);
        return event;
    }

    @Override
    public List<Event> getAllEvents() {
        return eventsRepository.findAll();
    }
}
