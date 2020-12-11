package com.hrdepartment.dao.service;

import com.hrdepartment.dao.entity.Employees;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface EmployeeService extends BaseService<Employees, Integer> {
    List<Employees> findAll();
}
