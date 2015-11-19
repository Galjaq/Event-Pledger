package com.events.test.dao;

import com.events.test.entity.Event;
import java.util.List;

public interface EventDao {
    public List<Event> getAllEvents();
    public void addEvent(Event event);
    public void deleteEvent(Integer eventId);
}
