package com.foldik.controllers;

import com.foldik.model.GotGirl;
import com.foldik.model.GotGirlList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.websocket.server.PathParam;
import java.util.List;

@RestController
public class GotGirlsController {

    private List<GotGirl> gotGirls;

    @Autowired
    public GotGirlsController(List<GotGirl> gotGirls) {
        this.gotGirls = gotGirls;
    }

    @RequestMapping(value = "/gotGirls", produces = {"application/json", "application/xml"})
    public GotGirlList listAllGotGirls() {
        return new GotGirlList(gotGirls);
    }

    @RequestMapping("/gotGirl/{id}")
    public GotGirl listAllGotGirls(@PathVariable("id") Integer id) {
        for (GotGirl gotGirl : gotGirls) {
            if (gotGirl.getId() == id) {
                return gotGirl;
            }
        }
        throw new IllegalArgumentException("Got girl not found with id: " + id);
    }
}
