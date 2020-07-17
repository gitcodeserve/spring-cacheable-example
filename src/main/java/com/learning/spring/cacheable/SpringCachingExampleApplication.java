package com.learning.spring.cacheable;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.Cache;
import org.springframework.cache.CacheManager;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.cache.concurrent.ConcurrentMapCache;
import org.springframework.cache.support.SimpleCacheManager;
import org.springframework.context.annotation.Bean;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
//@EnableCaching
public class SpringCachingExampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCachingExampleApplication.class, args);
	}

//	@Bean
//	public CacheManager cacheManager() {
//		SimpleCacheManager cacheManager = new SimpleCacheManager();
//		List<Cache> caches = new ArrayList<Cache>();
//		caches.add(new ConcurrentMapCache("areaOfCircleCache"));
//		cacheManager.setCaches(caches);
//		return cacheManager;
//	}

}
