package com.events.test.service;

import com.events.test.entity.Event;
import org.springframework.stereotype.Service;

import java.util.List;

public interface EventService {
    public List<Event> getAllEvents();
    public void addEvent(Event event);
    public void deleteEvent(Integer eventId);
}