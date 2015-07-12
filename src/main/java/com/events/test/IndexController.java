package com.events.test;

import com.events.test.event.domain.Event;
import com.events.test.event.domain.EventRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import java.util.List;

@Controller
public class IndexController {

    @Autowired
    private EventRepository eventRepository;

    @RequestMapping(value = "/")
    public ModelAndView index() {
        ModelAndView mav = new ModelAndView("index/index");

        String msg = "Running IndexController.index() method";

        mav.addObject("msg", msg);
        return mav;
    }

    @RequestMapping(value = "/ololo")
    public ModelAndView ololo() {
        ModelAndView mav = new ModelAndView("index/index");

        List<Event> msg = eventRepository.getAll();

        mav.addObject("msg", msg.get(0).getTopic());

        return mav;
    }
}
