package rw.co.snw.config;

import java.time.Duration;

import org.ehcache.config.builders.*;
import org.ehcache.jsr107.Eh107Configuration;

import io.github.jhipster.config.jcache.BeanClassLoaderAwareJCacheRegionFactory;
import io.github.jhipster.config.JHipsterProperties;

import org.springframework.boot.autoconfigure.cache.JCacheManagerCustomizer;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.*;

@Configuration
@EnableCaching
public class CacheConfiguration {

    private final javax.cache.configuration.Configuration<Object, Object> jcacheConfiguration;

    public CacheConfiguration(JHipsterProperties jHipsterProperties) {
        BeanClassLoaderAwareJCacheRegionFactory.setBeanClassLoader(this.getClass().getClassLoader());
        JHipsterProperties.Cache.Ehcache ehcache =
            jHipsterProperties.getCache().getEhcache();

        jcacheConfiguration = Eh107Configuration.fromEhcacheCacheConfiguration(
            CacheConfigurationBuilder.newCacheConfigurationBuilder(Object.class, Object.class,
                ResourcePoolsBuilder.heap(ehcache.getMaxEntries()))
                .withExpiry(ExpiryPolicyBuilder.timeToLiveExpiration(Duration.ofSeconds(ehcache.getTimeToLiveSeconds())))
                .build());
    }

    @Bean
    public JCacheManagerCustomizer cacheManagerCustomizer() {
        return cm -> {
            cm.createCache(rw.co.snw.repository.UserRepository.USERS_BY_LOGIN_CACHE, jcacheConfiguration);
            cm.createCache(rw.co.snw.repository.UserRepository.USERS_BY_EMAIL_CACHE, jcacheConfiguration);
            cm.createCache(rw.co.snw.domain.User.class.getName(), jcacheConfiguration);
            cm.createCache(rw.co.snw.domain.Authority.class.getName(), jcacheConfiguration);
            cm.createCache(rw.co.snw.domain.User.class.getName() + ".authorities", jcacheConfiguration);
            cm.createCache(rw.co.snw.domain.Tender.class.getName(), jcacheConfiguration);
            cm.createCache(rw.co.snw.domain.Tender.class.getName() + ".lotByTenders", jcacheConfiguration);
            cm.createCache(rw.co.snw.domain.Lot.class.getName(), jcacheConfiguration);
            cm.createCache(rw.co.snw.domain.Contract.class.getName(), jcacheConfiguration);
            cm.createCache(rw.co.snw.domain.Contract.class.getName() + ".lotByContracts", jcacheConfiguration);
            cm.createCache(rw.co.snw.domain.Policy.class.getName(), jcacheConfiguration);
            cm.createCache(rw.co.snw.domain.Client.class.getName(), jcacheConfiguration);
            cm.createCache(rw.co.snw.domain.Client.class.getName() + ".policyByClients", jcacheConfiguration);
            cm.createCache(rw.co.snw.domain.Branch.class.getName(), jcacheConfiguration);
            cm.createCache(rw.co.snw.domain.Branch.class.getName() + ".userByBranches", jcacheConfiguration);
            cm.createCache(rw.co.snw.domain.UserExtra.class.getName(), jcacheConfiguration);
            cm.createCache(rw.co.snw.domain.UserExtra.class.getName() + ".policyByUsers", jcacheConfiguration);
            cm.createCache(rw.co.snw.domain.Company.class.getName(), jcacheConfiguration);
            // jhipster-needle-ehcache-add-entry
        };
    }
}
