package com.example.apidemo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.apidemo.entity.Signup;
import com.example.apidemo.repo.SignupRepo;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
@RequestMapping("/api")
public class LoginController {

    @Autowired
    private SignupRepo signupRepo;

    @PostMapping("/login")
    public ResponseEntity<String> loginUser(@RequestBody Signup loginRequest) {
        System.out.println("Received login request: " + loginRequest.getEmail() + ", " + loginRequest.getPassword());

        Signup user = signupRepo.findByEmail(loginRequest.getEmail());
        if (user != null && user.getPassword().equals(loginRequest.getPassword())) {
            System.out.println("Login successful for user: " + user.getEmail());
            return ResponseEntity.ok("Login successful");
        } else {
            System.out.println("Login failed for user: " + loginRequest.getEmail());
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Invalid email or password");
        }
    }
}
