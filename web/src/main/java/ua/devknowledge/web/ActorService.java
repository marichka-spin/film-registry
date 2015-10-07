package ua.devknowledge.web;


import ua.devknowledge.facade.ActorFacade;
import ua.devknowledge.model.Actor;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Stateless
@Path("/actor")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class ActorService {

    @EJB
    private ActorFacade facade;

    @GET
    public List<Actor> getActors() {
        return facade.findAll();
    }

    @GET
    @Path("/{id}")
    public Actor getActor(@PathParam("id") Long id) {
        return facade.findOne(id);
    }

    @POST
    public void createActor(Actor actor) {
        facade.save(actor);
    }

    @PUT
    public Actor updateActor(Actor actor) {
        return facade.update(actor);
    }

    @DELETE
    @Path("/{id}")
    public void removeActor(@PathParam("id") Long id) {
        facade.delete(id);
    }
}
