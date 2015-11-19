package com.events.test.controller;

import com.events.test.entity.Event;
import com.events.test.service.EventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.transaction.Transactional;
import java.util.List;

@Controller
@Transactional
public class EventController {

    @Autowired
    private EventService eventService;

    @RequestMapping(value = "/events")
    public @ResponseBody List<Event> getEvents() {
        List<Event> events = eventService.getAllEvents();

        return events;
    }
}
