package de.ait.hw_events_spring_boot.services;

import de.ait.hw_events_spring_boot.dto.EventDto;
import de.ait.hw_events_spring_boot.dto.NewEventDto;
import de.ait.hw_events_spring_boot.models.Event;

import java.util.List;

public interface EventsService {
    EventDto addEvent(NewEventDto newEventDto);

    List <EventDto> getAllEvents();
}
