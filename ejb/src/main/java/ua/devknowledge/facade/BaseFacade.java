package ua.devknowledge.facade;


import java.util.List;

public interface BaseFacade<T> {

    T findOne(Long id);
    List<T> findAll();
    void save(T type);
    void delete(Long id);
    T update(T type);

}
