package de.ait.hw_events_spring_boot.controllers;
import de.ait.hw_events_spring_boot.dto.EventDto;
import de.ait.hw_events_spring_boot.dto.NewEventDto;
import de.ait.hw_events_spring_boot.models.Event;

import de.ait.hw_events_spring_boot.services.EventsService;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;


@Controller
@RequiredArgsConstructor
public class EventsController {
    private final EventsService eventsService;


    @PostMapping("/events")
    @ResponseBody
    public EventDto addEvent(@RequestBody NewEventDto newEvent) {
        return  eventsService.addEvent(newEvent);

    }

    @GetMapping("/events")
    @ResponseBody
    public List<EventDto> getAllEvents() {
        return eventsService.getAllEvents();
    }
}
