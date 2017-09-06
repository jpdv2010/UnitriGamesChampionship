package com.UnitriGamesChampionship.unitriGamesChampionship.controller;

import com.UnitriGamesChampionship.unitriGamesChampionship.model.Competitor;
import com.UnitriGamesChampionship.unitriGamesChampionship.repository.Competitors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by joaop on 06/09/2017.
 */
@Controller
@RequestMapping("/competitor")
public class CompetitorController {
    @Autowired
    private Competitors competitors;

    @RequestMapping("/new")
    public ModelAndView newCompetitor(){
        ModelAndView mv=new ModelAndView("NewCompetitor");
        return mv;
    }

    @RequestMapping(method = RequestMethod.POST)
    public ModelAndView salvar(Competitor competitor){
        competitors.save(competitor);
        ModelAndView mv=new ModelAndView("CreateOrJoinATeam");
        mv.addObject("message","Sucesso!");
        mv.addObject("competitors",competitors.findAll());
        return mv;
    }
}
