package com.hrdepartment.controller;

import com.hrdepartment.dao.entity.Employees;
import com.hrdepartment.dao.service.EmployeeService;
import com.hrdepartment.response.BaseResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@RequestMapping("employees")
public class EmployeeControllers extends BaseController {

    private final EmployeeService employeeService;

    public EmployeeControllers(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping()
    public BaseResponse getAll() {
        log.info("(getAll)");

        return super.responseSuccess(employeeService.findAll());
    }

    @PostMapping()
    public BaseResponse save(Employees body) {
        log.info("(save) body {}", body);

        employeeService.save(body);
        return super.responseSuccess(true);
    }
}
