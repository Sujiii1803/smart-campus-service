package com.example.smartcampus.controller;

import com.example.smartcampus.model.Role;
import com.example.smartcampus.repository.RoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/roles")
public class RoleController
{
    @Autowired
    private RoleRepository roleRepository;

    @PostMapping
    public Role createRole(@RequestBody Role role){
        return roleRepository.save(role);
    }

}
