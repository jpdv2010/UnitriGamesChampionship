package com.UnitriGamesChampionship.unitriGamesChampionship.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by joaop on 06/09/2017.
 */
@Controller
public class HomeController {

    @RequestMapping
    public String home(){
        return "Home";
    }

}
