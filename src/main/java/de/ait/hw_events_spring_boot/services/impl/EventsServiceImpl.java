package de.ait.hw_events_spring_boot.services.impl;

import de.ait.hw_events_spring_boot.dto.EventDto;
import de.ait.hw_events_spring_boot.dto.NewEventDto;
import de.ait.hw_events_spring_boot.services.EventsService;
import de.ait.hw_events_spring_boot.models.Event;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import de.ait.hw_events_spring_boot.repositories.EventsRepository;

import java.util.ArrayList;
import java.util.List;

import static de.ait.hw_events_spring_boot.dto.EventDto.from;

@RequiredArgsConstructor
@Service
public class EventsServiceImpl implements EventsService {

    private final EventsRepository eventsRepository;


    @Override
    public EventDto addEvent(NewEventDto newEvent) {
        Event event = new Event(newEvent.getEventName(), newEvent.getEventDescription());
        eventsRepository.save(event);
        return from(event);
    }

    @Override
    public List<EventDto> getAllEvents() {
        return from  (eventsRepository.findAll());



    }
}
