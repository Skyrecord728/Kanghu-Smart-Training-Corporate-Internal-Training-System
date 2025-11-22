package com.example.kanghu.kanghu.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.Map;
import java.util.HashMap;

@RestController
@RequestMapping("/api/users")
public class UserController {
    @GetMapping("/hello")
    public Map<String, String> hello() {
        Map<String,String> m = new HashMap<>();
        m.put("message", "User service is up");
        return m;
    }
}
