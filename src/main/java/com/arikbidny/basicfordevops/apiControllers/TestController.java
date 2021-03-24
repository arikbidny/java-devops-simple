package com.arikbidny.basicfordevops.apiControllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/test")
public class TestController {

    // Test Conroller
    @GetMapping()
    public String testUrl() {
        return "Hello from /api/test";
    }
}
