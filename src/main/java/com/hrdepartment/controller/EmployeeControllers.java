package com.hrdepartment.controller;

import com.hrdepartment.dao.entity.Employees;
import com.hrdepartment.dao.service.EmployeeService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Slf4j
@RestController
@RequestMapping("employees")
public class EmployeeControllers {

    private final EmployeeService employeeService;

    public EmployeeControllers(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping()
    public Object getAll() {
        log.info("(getAll)");

        return employeeService.findAll();
    }

    @PostMapping()
    public Boolean save(Employees employees) {
        log.info("(save) employees {}", employees);

        employeeService.save(employees);
        return true;
    }
}
