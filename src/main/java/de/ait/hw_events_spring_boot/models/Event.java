package de.ait.hw_events_spring_boot.models;

import lombok.*;

import java.util.Objects;
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Getter
@Setter
@ToString
public class Event {

private String eventName;
private String eventDescription;



    public String getEventName() {
        return eventName;
    }

    public String getEventDescription() {
        return eventDescription;
    }


}
