package com.hrdepartment.controller;

import com.hrdepartment.dao.entity.Employees;
import com.hrdepartment.dao.entity.Roles;
import com.hrdepartment.dao.service.EmployeeService;
import com.hrdepartment.dao.service.RoleService;
import com.hrdepartment.response.BaseResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("roles")
public class RoleControllers extends BaseController {

    private final RoleService roleService;

    public RoleControllers(RoleService roleService) {
        this.roleService = roleService;
    }

    @GetMapping()
    public BaseResponse getAll() {
        log.info("(getAll)");

        return super.responseSuccess(roleService.findAll());
    }

    @PostMapping()
    public BaseResponse save(Roles body) {
        log.info("(save) body {}", body);

        roleService.save(body);
        return super.responseSuccess(true);
    }
}
