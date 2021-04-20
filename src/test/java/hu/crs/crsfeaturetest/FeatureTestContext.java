package hu.crs.crsfeaturetest;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

@Component
public class FeatureTestContext {
    private ResponseEntity<String> responseEntity;

    public ResponseEntity<String> getResponseEntity() {
        return responseEntity;
    }

    public void setResponseEntity(ResponseEntity<String> responseEntity) {
        this.responseEntity = responseEntity;
    }
}
