package com.java.ActorCollab.controller;

import com.java.ActorCollab.entities.Actor;
import com.java.ActorCollab.entities.ActorList;
import com.java.ActorCollab.services.ActorServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import java.util.List;

@RestController

public class MyController {

    @Autowired
    ActorServices actorServices;

    @GetMapping("/fetchNameAndId")
    public List<ActorList> fetchNameAndId() {
        return actorServices.fetchNameAndId();
    }

    @GetMapping("/fetchActor/{actorId}")
    public Actor fetchAllActor(HttpServletResponse httpServletResponse, @PathVariable String actorId) {
//        httpServletResponse.addHeader("Access-Control-Allow-Origin", "*");
        return actorServices.fetchAllActor(Integer.parseInt(actorId));
    }
}