package hu.crs.crsfeaturetest.config;

import hu.crs.crsfeaturetest.FeatureTestContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class ContextConfig {
    @Bean
    public FeatureTestContext featureTestContext() {
        return new FeatureTestContext();
    }

    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }
}
