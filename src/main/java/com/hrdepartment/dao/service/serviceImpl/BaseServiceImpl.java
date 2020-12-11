package com.hrdepartment.dao.service.serviceImpl;

import com.hrdepartment.dao.repository.BaseRepository;
import com.hrdepartment.dao.service.BaseService;
import lombok.extern.slf4j.Slf4j;

import java.util.List;

@Slf4j
public class BaseServiceImpl<E, ID> implements BaseService<E, ID> {
    private final BaseRepository<E, ID> baseRepository;

    public BaseServiceImpl(BaseRepository baseRepository) {
        this.baseRepository = baseRepository;
    }

    @Override
    public List<E> getAll() {
        return baseRepository.findAllByDeletedAtIsNull();
    }

    @Override
    public E getById(ID id) {
        return baseRepository.findByIdAndDeletedAtIsNull(id);
    }

    @Override
    public E save(E entity) {
        return baseRepository.save(entity);
    }

    @Override
    public List<E> saveAll(List<E> entities) {
        return baseRepository.saveAll(entities);
    }

    @Override
    public void softDelete(ID id) {
        baseRepository.softDelete(id);
    }

    @Override
    public void softDeleteAll(List<ID> ids) {
        baseRepository.softDeleteAll(ids);
    }

    @Override
    public void deleteById(ID id) {
        baseRepository.deleteById(id);
    }

    @Override
    public void deleteAllByIds(List<ID> ids) {
        baseRepository.deleteAllById(ids);
    }

    @Override
    public void delete(E entity) {
        baseRepository.delete(entity);
    }

    @Override
    public void deleteAll(List<E> entities) {
        baseRepository.deleteAll(entities);
    }

    @Override
    public void restoreSoftDelete(ID id) {
        baseRepository.restoreSoftDelete(id);
    }

    @Override
    public void restoreAllSoftDelete(List<ID> ids) {
        baseRepository.restoreAllSoftDelete(ids);
    }

}
