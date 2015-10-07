package ua.devknowledge.web;

import ua.devknowledge.facade.DirectorFacade;
import ua.devknowledge.model.Director;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;


@Stateless
@Path("/director")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class DirectorService {

    @EJB
    private DirectorFacade facade;

    @GET
    public List<Director> getDirectors() {
        return facade.findAll();
    }

    @GET
    @Path("/{id}")
    public Director getDirector(@PathParam("id") Long id) {
        return facade.findOne(id);
    }

    @POST
    public void createDirector(Director director) {
        facade.save(director);
    }

    @PUT
    public Director updateDirector(Director director) {
        return facade.update(director);
    }

    @DELETE
    @Path("/{id}")
    public void removeDirector(@PathParam("id") Long id) {
        facade.delete(id);
    }
}
