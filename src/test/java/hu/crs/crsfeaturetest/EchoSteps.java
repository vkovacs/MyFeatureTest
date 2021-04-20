package hu.crs.crsfeaturetest;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.jupiter.api.Assertions;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.client.RestTemplate;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources")
public class EchoSteps {

    @Autowired
    private RestTemplate restTemplate;
    @Autowired
    private FeatureTestContext context;

    @When("^the client calls (.*)$")
    public void theClientCallsEcho(String url) {
        context.setResponseEntity(restTemplate.getForEntity(url, String.class));
    }

    @Then("^the client receives status code of (\\d+)$")
    public void theClientReceivesStatusCodeOf(int statusCode) {
        Assertions.assertEquals(statusCode, context.getResponseEntity().getStatusCode().value());
    }

    @And("^result is (.*)$")
    public void theClientReceivesHelloWorld(String payload) {
        Assertions.assertEquals(payload, context.getResponseEntity().getBody());
    }
}
