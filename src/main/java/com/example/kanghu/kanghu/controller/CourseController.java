package com.example.kanghu.kanghu.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
import java.util.Arrays;

@RestController
@RequestMapping("/api/courses")
public class CourseController {
    @GetMapping("/list")
    public List<String> list() {
        return Arrays.asList("康复基础", "康护实训", "岗位技能");
    }
}
