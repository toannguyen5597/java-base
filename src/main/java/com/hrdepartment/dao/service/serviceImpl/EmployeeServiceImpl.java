package com.hrdepartment.dao.service.serviceImpl;

import com.hrdepartment.dao.entity.Employees;
import com.hrdepartment.dao.repository.EmployeeRepository;
import com.hrdepartment.dao.service.EmployeeService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
public class EmployeeServiceImpl extends BaseServiceImpl<Employees, Integer> implements EmployeeService {

    private final EmployeeRepository employeeRepository;

    public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
        super(employeeRepository);
        this.employeeRepository = employeeRepository;
    }

    @Override
    public List<Employees> findAll() {
        return employeeRepository.findAll();
    }

}
