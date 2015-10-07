package ua.devknowledge.dao;

import ua.devknowledge.model.Film;

import javax.ejb.Stateless;

@Stateless
public class FilmDAO extends BaseDAOImpl<Film> {

    public FilmDAO() {
        super(Film.class);
    }
}
