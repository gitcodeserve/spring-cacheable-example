package com.learning.spring.cacheable.sevice;

import com.learning.spring.cacheable.model.Organization;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
public class OrganizationService {

    @Cacheable("orgs")
    public List<Organization> findAll(){
        log.info("get all organization details");
        return List.of(new Organization("VMWare", "Palo Alto", "Pat"),
                new Organization("Microsoft", "Seattle", "Satya Nadela"),
        new Organization("Google", "Mauntain View", "Sundar Pichai")
                );
    }

    @CacheEvict(value = "orgs", allEntries = true)
    public void clearCache() {
        log.info("Cleared all cached org details");
    }
}
