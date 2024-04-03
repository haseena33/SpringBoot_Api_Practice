package com.example.apidemo.controller;

import com.example.apidemo.entity.Signup;
import com.example.apidemo.services.SignupService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
@RequestMapping("/api/signup")
public class SignupController {

    private final SignupService signupService;

    @Autowired
    public SignupController(SignupService signupService) {
        this.signupService = signupService;
    }

    @PostMapping
    public ResponseEntity<Signup> saveSignup(@RequestBody Signup signup) {
        Signup savedSignup = signupService.saveSignup(signup);
        return new ResponseEntity<>(savedSignup, HttpStatus.CREATED);
    }
}
