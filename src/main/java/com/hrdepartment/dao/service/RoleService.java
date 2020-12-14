package com.hrdepartment.dao.service;

import com.hrdepartment.dao.entity.Roles;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface RoleService extends BaseService<Roles, Integer> {
    List<Roles> findAll();
}
