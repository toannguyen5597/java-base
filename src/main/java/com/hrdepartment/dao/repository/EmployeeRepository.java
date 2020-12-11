package com.hrdepartment.dao.repository;

import com.hrdepartment.dao.entity.Employees;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends BaseRepository<Employees, Integer> {

}
