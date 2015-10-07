package ua.devknowledge.dao;


import ua.devknowledge.model.Actor;

import javax.ejb.Stateless;

@Stateless
public class ActorDAO extends BaseDAOImpl<Actor> {

    public ActorDAO() {
        super(Actor.class);
    }
}
