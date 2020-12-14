package com.hrdepartment.dao.service.serviceImpl;

import com.hrdepartment.dao.entity.Roles;
import com.hrdepartment.dao.repository.RoleRepository;
import com.hrdepartment.dao.service.RoleService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
public class RoleServiceImpl extends BaseServiceImpl<Roles, Integer> implements RoleService {

    private final RoleRepository roleRepository;

    public RoleServiceImpl(RoleRepository roleRepository) {
        super(roleRepository);
        this.roleRepository = roleRepository;
    }

    @Override
    public List<Roles> findAll() {
        return roleRepository.findAll();
    }
}
