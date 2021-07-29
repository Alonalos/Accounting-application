package com.friday.implementation;

import com.friday.dto.RoleDTO;
import com.friday.entity.Role;
import com.friday.entity.User;
import com.friday.repository.RoleRepository;
import com.friday.service.RoleService;
import com.friday.util.MapperUtil;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class RoleServiceImpl implements RoleService {

    private RoleRepository roleRepository;
    private MapperUtil mapperUtil;

    public RoleServiceImpl(RoleRepository roleRepository, MapperUtil mapperUtil) {
        this.roleRepository = roleRepository;
        this.mapperUtil = mapperUtil;
    }

    @Override
    public List<RoleDTO> listAllRoles() {
        List<Role> list=roleRepository.findAll();
        return list.stream().map(obj->{return mapperUtil.convert(obj,new RoleDTO());}).collect(Collectors.toList());
    }

    @Override
    public RoleDTO findById(long id) {
        Role role=roleRepository.findById(id).get();
        return mapperUtil.convert(role,new RoleDTO());
    }

}
