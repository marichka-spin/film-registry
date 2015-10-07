package ua.devknowledge.web;


import ua.devknowledge.facade.CinemaFacade;
import ua.devknowledge.model.Cinema;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Stateless
@Path("/cinema")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class CinemaService {

    @EJB
    private CinemaFacade facade;

    @GET
    public List<Cinema> getCinemas() {
        return facade.findAll();
    }

    @GET
    @Path("/{id}")
    public Cinema getCinema(@PathParam("id") Long id) {
        return facade.findOne(id);
    }

    @POST
    public void createCinema(Cinema cinema) {
        facade.save(cinema);
    }

    @PUT
    public Cinema updateCinema(Cinema cinema) {
        return facade.update(cinema);
    }

    @DELETE
    @Path("/{id}")
    public void removeCinema(@PathParam("id") Long id) {
        facade.delete(id);
    }
}
