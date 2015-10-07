package ua.devknowledge.facade;


import ua.devknowledge.model.Film;

import javax.ejb.Local;

@Local
public interface FilmFacade extends BaseFacade<Film> {
}
