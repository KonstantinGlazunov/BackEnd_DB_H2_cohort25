package de.ait.hw_events_spring_boot.dto;


import de.ait.hw_events_spring_boot.models.Event;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;


@Getter
@AllArgsConstructor
@NoArgsConstructor
@Setter
public class EventDto {
    private String eventName;
    private  String eventDescription;


    public static EventDto from(Event event){
        return new EventDto(event.getEventName(), event.getEventDescription());
    }

    public static List<EventDto> from (List<Event> events){
        List<EventDto> eventDtos = new ArrayList<>();

        for (Event event : events) {
            EventDto eventDto = from(event);
            eventDtos.add(eventDto);
        }
        return eventDtos;
    }

}
