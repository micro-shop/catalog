package cz.microshop.cart.config;

import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CatalogConfiguration {
    @Bean
    @ConditionalOnMissingBean(CatalogConfigurationProperties.class)
    public CatalogConfigurationProperties frameworkMesosConfigProperties() {
        return new CatalogConfigurationProperties();
    }
}