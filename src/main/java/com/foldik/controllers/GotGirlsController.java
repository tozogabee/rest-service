package com.foldik.controllers;

import com.foldik.model.GotGirl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class GotGirlsController {

    private List<GotGirl> gotGirls;

    @Autowired
    public GotGirlsController(List<GotGirl> gotGirls) {
        this.gotGirls = gotGirls;
    }

    @RequestMapping("/gotGirls")
    public List<GotGirl> listAllGotGirls() {
        return gotGirls;
    }
}
