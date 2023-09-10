package repositories.impl;

import de.ait.hw_events_spring_boot.models.Event;
import org.springframework.stereotype.Repository;
import repositories.EventsRepository;

import java.util.List;

@Repository
public class EventsRepositoryListImpl implements EventsRepository {

    private final List<Event> events;

    public EventsRepositoryListImpl( List<Event> events) {
        this.events = events;
    }


    @Override
    public Event findByID(Long id) {
        return null;
    }

    @Override
    public List<Event> findAll() {
        return events;
    }

    @Override
    public void save(Event event) {
        events.add(event);
    }

    @Override
    public void deleteById(Long id) {

    }

    @Override
    public void update(Event model) {

    }

    @Override
    public Event findByEventName(String request) {
        return null;
    }
}
