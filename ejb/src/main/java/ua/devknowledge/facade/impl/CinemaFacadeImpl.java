package ua.devknowledge.facade.impl;


import ua.devknowledge.dao.CinemaDAO;
import ua.devknowledge.facade.CinemaFacade;
import ua.devknowledge.model.Cinema;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import java.util.List;

@Stateless
public class CinemaFacadeImpl implements CinemaFacade {

    @EJB
    private CinemaDAO cinemaDAO;

    @Override
    public Cinema findOne(Long id) {
        return cinemaDAO.findOne(id);
    }

    @Override
    public List<Cinema> findAll() {
        return cinemaDAO.findAll();
    }

    @Override
    public void delete(Long id) {
        Cinema cinema = cinemaDAO.findOne(id);
        cinemaDAO.delete(cinema);
    }

    @Override
    public Cinema update(Cinema cinema) {
        return cinemaDAO.update(cinema);
    }

    @Override
    public void save(Cinema cinema) {
        cinemaDAO.save(cinema);
    }
}
