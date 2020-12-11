package com.hrdepartment.dao.service;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface BaseService<E, ID> {
    public List<E> getAll();

    public E getById(ID id);

    public E save(E entity);

    public List<E> saveAll(List<E> entities);

    public void softDelete(ID id);

    public void softDeleteAll(List<ID> ids);

    public void deleteById(ID id);

    public void deleteAllByIds(List<ID> ids);

    public void delete(E entity);

    public void deleteAll(List<E> entities);

    public void restoreSoftDelete(ID id);

    public void restoreAllSoftDelete(List<ID> ids);

}
