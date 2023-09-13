package de.ait.hw_events_spring_boot.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Schema(name = "New Event", description = "Info for add new Event")
public class NewEventDto {

    @Schema(description = "Event title", example = "Wake up")
    private String eventName;
    @Schema(description = "Event description", example = "Wake up at 7 o clock")
    private  String eventDescription;



}
