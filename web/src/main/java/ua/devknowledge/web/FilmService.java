package ua.devknowledge.web;


import ua.devknowledge.facade.FilmFacade;
import ua.devknowledge.model.Film;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Stateless
@Path("/film")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class FilmService {

    @EJB
    private FilmFacade facade;

    @GET
    public List<Film> getFilms() {
        return facade.findAll();
    }

    @GET
    @Path("/{id}")
    public Film getFilm(@PathParam("id") Long id) {
        return facade.findOne(id);
    }

    @POST
    public void createFilm(Film film) {
        facade.save(film);
    }

    @PUT
    public Film updateFilm(Film film) {
        return facade.update(film);
    }

    @DELETE
    @Path("/{id}")
    public void removeFilm(@PathParam("id") Long id) {
        facade.delete(id);
    }
}
