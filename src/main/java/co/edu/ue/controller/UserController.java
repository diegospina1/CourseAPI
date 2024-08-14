package co.edu.ue.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
@RequestMapping("/users")
public class UserController {

    @GetMapping("/test")
    public String getMethodName() {
        return "Esto es una prueba";
    }
    
}
