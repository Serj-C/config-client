package com.example.configclient;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class RateController {
    @Value("${rate}")
    String rate;

    @Value("${lanecount}")
    String lanecount;

    @Value("${tollstart}")
    String tollstart;

    @RequestMapping("/rate")
    public String getRate(Model model) {
        model.addAttribute("rateamount", rate);
        model.addAttribute("lanes", lanecount);
        model.addAttribute("tollstart", tollstart);

        return "rateview";
    }
}
