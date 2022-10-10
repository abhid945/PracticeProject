package com.java.ActorCollab.services;

import com.java.ActorCollab.entities.Actor;
import com.java.ActorCollab.entities.ActorList;

import java.util.List;

public interface ActorServices  {
    public List<ActorList> fetchNameAndId();
    public Actor fetchAllActor(int actorId);


}