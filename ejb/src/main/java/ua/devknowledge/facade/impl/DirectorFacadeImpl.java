package ua.devknowledge.facade.impl;

import ua.devknowledge.facade.DirectorFacade;
import ua.devknowledge.dao.DirectorDAO;
import ua.devknowledge.model.Director;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.ejb.TransactionManagement;
import java.util.List;

@Stateless
@TransactionManagement
public class DirectorFacadeImpl implements DirectorFacade {

    @EJB
    private DirectorDAO directorDAO;


    @Override
    public Director findOne(Long id) {
        return directorDAO.findOne(id);
    }

    @Override
    public List<Director> findAll() {
        return directorDAO.findAll();
    }

    @Override
    public void delete(Long id) {
        Director director = directorDAO.findOne(id);
        directorDAO.delete(director);
    }

    @Override
    public Director update(Director director) {
        return directorDAO.update(director);
    }

    @Override
    public void save(Director director) {
        directorDAO.save(director);
    }
}
