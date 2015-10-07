package ua.devknowledge.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import java.util.List;

public abstract class BaseDAOImpl<T> implements BaseDAO<T> {

    @PersistenceContext(unitName = "FilmReg")
    private EntityManager em;

    private Class<T> clazz;

    public BaseDAOImpl() {

    }

    public BaseDAOImpl(Class<T> clazz) {
        this.clazz = clazz;
    }

    @Override
    public void save(T entity) {
        em.persist(entity);
    }

    @Override
    public void delete(T entity) {
        em.remove(entity);
    }

    @Override
    public T update(T entity) {
        return em.merge(entity);
    }

    @Override
    public T findOne(Long id) {
        return em.find(clazz, id);
    }

    @Override
    public List<T> findAll() {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<T> q = cb.createQuery(clazz);
        Root<T> type = q.from(clazz);
        q.select(type);
        TypedQuery<T> query = em.createQuery(q);
        return query.getResultList();
    }
}
