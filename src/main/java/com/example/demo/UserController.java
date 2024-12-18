package com.example.demo;

import org.springframework.web.bind.annotation.*;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api/users")
public class UserController {

    // POST Endpoint สำหรับรับข้อมูลผู้ใช้
    @PostMapping("/create")
    public Map<String, Object> createUser(@RequestBody UserRequest userRequest) {
        Map<String, Object> response = new HashMap<>();
        response.put("message", "User created successfully!");
        response.put("name", userRequest.getName());
        response.put("email", userRequest.getEmail());
        return response;
    }
}
