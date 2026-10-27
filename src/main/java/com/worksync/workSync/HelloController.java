package com.worksync.workSync;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

// Tells Spring this class handles HTTP requests and returns response data.
@RestController 
public class HelloController {
    // Maps HTTP GET requests to /hello to your method.
    @GetMapping("/hello")
    public String hello(){
        return "Hello WorkSync! Your backend is alive";
    }
}
