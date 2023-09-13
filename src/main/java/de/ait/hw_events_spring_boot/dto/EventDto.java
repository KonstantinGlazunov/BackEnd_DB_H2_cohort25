package de.ait.hw_events_spring_boot.dto;


import de.ait.hw_events_spring_boot.models.Event;
import io.swagger.v3.oas.annotations.media.Schema;
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
@Schema(name="Event", description = "Event info")
public class EventDto {
    @Schema(description = "Event title", example = "Wake up")
    private String eventName;
    @Schema(description = "Event description", example = "Wake up at 7 o clock")
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
