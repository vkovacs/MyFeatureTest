package hu.crs.crsfeaturetest.config;

import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.boot.test.context.SpringBootTest;

@CucumberContextConfiguration
@SpringBootTest(classes = ContextConfig.class)
public class CucumberSpringConfiguration {
}