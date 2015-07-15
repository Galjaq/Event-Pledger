package com.events.test;

import com.events.test.event.domain.Event;
import com.events.test.event.domain.EventRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import javax.transaction.Transactional;
import java.util.List;

@Controller
@Transactional
public class IndexController {

    @Autowired
    private EventRepository eventRepository;

    @RequestMapping(value = "/")
    public @ResponseBody List<Event> index() {
        List<Event> events = eventRepository.getAll();

        return events;
    }
}
