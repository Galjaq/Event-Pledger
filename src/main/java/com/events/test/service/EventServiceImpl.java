package com.events.test.service;

import com.events.test.dao.EventDao;
import com.events.test.entity.Event;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EventServiceImpl implements EventService {

    @Autowired
    private EventDao eventDao;

    @Override
    public List<Event> getAllEvents() {
        return eventDao.getAllEvents();
    }

    @Override
    public void addEvent(Event event) {

    }

    @Override
    public void deleteEvent(Integer eventId) {

    }
}
