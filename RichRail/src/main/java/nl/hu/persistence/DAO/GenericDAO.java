package nl.hu.persistence.DAO;

import java.util.List;

public interface GenericDAO<T> {
    T findById(String id);
    void update(T entity);
    void delete(T entity);
    List<T> getAll();
    void insert(T entity);
}