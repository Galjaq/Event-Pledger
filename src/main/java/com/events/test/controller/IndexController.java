package com.events.test.controller;

import com.events.test.event.domain.Event;
import com.events.test.event.domain.EventRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.transaction.Transactional;
import java.util.List;

@Controller
@Transactional
public class IndexController {

    @Autowired
    private EventRepository eventRepository;

    @RequestMapping(value = "/")
    public String index() {
        return "index";
    }

    @RequestMapping(value = "/events")
    public @ResponseBody List<Event> getEvents() {
        List<Event> events = eventRepository.getAll();

        return events;
    }

    @RequestMapping(value = "/admin**", method = RequestMethod.GET)
    public String adminPage(Model model) {

        model.addAttribute("message", "This page is for ROLE_ADMIN only!");

        return "admin";
    }
}
