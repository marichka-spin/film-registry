package ua.devknowledge.facade.impl;


import ua.devknowledge.dao.ActorDAO;
import ua.devknowledge.facade.ActorFacade;
import ua.devknowledge.model.Actor;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import java.util.List;

@Stateless
public class ActorFacadeImpl implements ActorFacade {

    @EJB
    private ActorDAO actorDAO;

    @Override
    public Actor findOne(Long id) {
        return actorDAO.findOne(id);
    }

    @Override
    public List<Actor> findAll() {
        return actorDAO.findAll();
    }

    @Override
    public void delete(Long id) {
        Actor actor = actorDAO.findOne(id);
        actorDAO.delete(actor);
    }

    @Override
    public Actor update(Actor actor) {
        return actorDAO.update(actor);
    }

    @Override
    public void save(Actor actor) {
        actorDAO.save(actor);
    }
}
