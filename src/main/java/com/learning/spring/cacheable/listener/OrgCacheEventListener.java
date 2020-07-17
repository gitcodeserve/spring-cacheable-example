package com.learning.spring.cacheable.listener;

import com.learning.spring.cacheable.model.Organization;
import lombok.extern.slf4j.Slf4j;
import org.ehcache.event.CacheEvent;
import org.ehcache.event.CacheEventListener;

import java.util.List;

@Slf4j
public class OrgCacheEventListener implements CacheEventListener<String, List<Organization>> {
    @Override
    public void onEvent(CacheEvent<? extends String, ? extends List<Organization>> cacheEvent) {
        log.info("Event '{}' fired for key '{}' with value {}", cacheEvent.getType(), cacheEvent.getKey(), cacheEvent.getNewValue());
    }
}