package com.events.test;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class IndexController {
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

        String msg = "Running IndexController.ololo() method";

        mav.addObject("msg", msg);
        return mav;
    }
}
