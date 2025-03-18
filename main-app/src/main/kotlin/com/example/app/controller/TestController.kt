package com.example.app.controller

import com.example.app.service.ValidateRequest
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api")
class TestController {

    @ValidateRequest
    @GetMapping("/test")
    fun testEndpoint(): String {
        return "Hello, world!"
    }
}
