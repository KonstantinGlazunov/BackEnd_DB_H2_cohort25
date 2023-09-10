package de.ait.hw_events_spring_boot.controllers;

import de.ait.hw_events_spring_boot.EventsSrvice.EventsService;
import de.ait.hw_events_spring_boot.models.Event;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;


@Controller
public class EventsController {
    private final EventsService eventsService;

    public EventsController(EventsService usersService) {
        this.eventsService = usersService;
    }


    @PostMapping("/events")
    public String addEvent(@RequestParam("event_name") String event_name,
                           @RequestParam("event_description") String event_description) {
        eventsService.addEvent(event_name, event_description);
        return "redirect:/success_add_event.html";
    }

    @GetMapping("/events")
    public String getEventsPage(Model model) {
        List<Event> events = eventsService.getAllEvents();
        model.addAttribute("eventsList", events);
        return "events_page";
    }
}
