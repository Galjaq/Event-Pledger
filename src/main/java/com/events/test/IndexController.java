package com.events.test;

import com.events.test.event.domain.Event;
import com.events.test.event.domain.EventRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import java.util.List;

@Controller
public class IndexController {

    @Autowired
    private EventRepository eventRepository;

    @RequestMapping(value = "/")
    public String index(Model model) {
        List<Event> events = eventRepository.getAll();
        model.addAttribute("events", events);

        return "index/index";
    }
}
