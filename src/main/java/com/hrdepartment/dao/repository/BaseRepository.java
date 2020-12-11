package com.hrdepartment.dao.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.NoRepositoryBean;

import javax.transaction.Transactional;
import java.util.List;

@NoRepositoryBean
public interface BaseRepository<E, ID> extends JpaRepository<E, ID> {

    @Transactional
    @Modifying
    @Query(value = "UPDATE entity entity set deletedAt = now() where entity.id = :id", nativeQuery = true)
    void softDelete(ID id);

    @Transactional
    @Modifying
    @Query(value = "UPDATE entity entity set deletedAt = now() where entity.id in :id", nativeQuery = true)
    void softDeleteAll(List<ID> id);

    @Transactional
    @Modifying
    @Query(value = "DELETE entity entity where entity.id = :id", nativeQuery = true)
    void deleteById(ID id);

    @Transactional
    @Modifying
    @Query(value = "DELETE entity entity where entity.id in :ids", nativeQuery = true)
    void deleteAllById(List<ID> ids);

    @Transactional
    @Modifying
    @Query(value = "UPDATE entity entity set deletedAt = null where entity.id = :id", nativeQuery = true)
    void restoreSoftDelete(ID id);

    @Transactional
    @Modifying
    @Query(value = "UPDATE entity entity set deletedAt = null where entity.id in :ids", nativeQuery = true)
    void restoreAllSoftDelete(List<ID> ids);

    List<E> findAllByDeletedAtIsNull();

    E findByIdAndDeletedAtIsNull(ID id);
}
