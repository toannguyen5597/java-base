package com.hrdepartment.dao.repository;

import com.hrdepartment.dao.entity.Employees;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeRepository extends BaseRepository<Employees, Integer> {
//    List<Employees> findAllByNameAndAnd()
}
