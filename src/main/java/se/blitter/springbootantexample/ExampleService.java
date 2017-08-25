package se.blitter.springbootantexample;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExampleService {
    @RequestMapping(value = "/", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<String> healthCheck() {
        return new ResponseEntity<String>("{\"status\":\"OK\"}", HttpStatus.OK);
    }
}
