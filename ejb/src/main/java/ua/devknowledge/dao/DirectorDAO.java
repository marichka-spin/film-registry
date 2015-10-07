package ua.devknowledge.dao;

import ua.devknowledge.model.Director;

import javax.ejb.Stateless;

@Stateless
public class DirectorDAO extends BaseDAOImpl<Director> {

    public DirectorDAO() {
        super(Director.class);
    }
}
