package de.ait.hw_events_spring_boot.repositories;

import de.ait.hw_events_spring_boot.models.Event;


public interface EventsRepository extends CrudRepository<Event> {

    Event findByEventName (String request);
}
