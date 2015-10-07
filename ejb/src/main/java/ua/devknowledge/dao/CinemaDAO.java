package ua.devknowledge.dao;

import ua.devknowledge.model.Cinema;

import javax.ejb.Stateless;

@Stateless
public class CinemaDAO extends BaseDAOImpl<Cinema> {

    public CinemaDAO() {
        super(Cinema.class);
    }
}
