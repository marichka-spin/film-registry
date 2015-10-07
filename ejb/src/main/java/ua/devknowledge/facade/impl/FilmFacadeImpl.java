package ua.devknowledge.facade.impl;


import ua.devknowledge.dao.FilmDAO;
import ua.devknowledge.facade.FilmFacade;
import ua.devknowledge.model.Film;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import java.util.List;

@Stateless
public class FilmFacadeImpl implements FilmFacade {

    @EJB
    private FilmDAO filmDAO;

    @Override
    public Film findOne(Long id) {
        return filmDAO.findOne(id);
    }

    @Override
    public List<Film> findAll() {
        return filmDAO.findAll();
    }

    @Override
    public void delete(Long id) {
        Film film = filmDAO.findOne(id);
        filmDAO.delete(film);
    }

    @Override
    public Film update(Film film) {
        return filmDAO.update(film);
    }

    @Override
    public void save(Film film) {
        filmDAO.save(film);
    }
}
