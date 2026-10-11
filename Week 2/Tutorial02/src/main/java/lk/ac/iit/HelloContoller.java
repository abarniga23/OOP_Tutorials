package lk.ac.iit;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloContoller {
    @GetMapping("/hello")
    public String hello(){
        return "Hello from Spring Boot!";
    }

    @GetMapping("/status")
    public String status() {
        return "API is running - Tutorial 1!";
    }

    @GetMapping("/info")
    public String info(){
        return "Welcome to Spring Boot! Let's explore More.";
    }

    @GetMapping("/goodbye")
    public String goodBye() {
        return "Goodbye from Spring Boot!";
    }
}
