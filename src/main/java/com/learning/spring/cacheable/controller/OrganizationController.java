package com.learning.spring.cacheable.controller;

import com.learning.spring.cacheable.model.Organization;
import com.learning.spring.cacheable.sevice.OrganizationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/orgs")
public class OrganizationController {
    @Autowired
    OrganizationService service;

    @GetMapping
    public List<Organization> findAll(){
        return service.findAll();
    }

    @DeleteMapping("/clear")
    public void clearCache() {
        service.clearCache();
    }
}
