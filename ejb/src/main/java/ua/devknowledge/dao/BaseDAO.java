package ua.devknowledge.dao;

import java.util.List;

public interface BaseDAO<T> {

    void save(T entity);
    void delete(T entity);
    T update(T entity);
    T findOne(Long id);
    List<T> findAll();
}
