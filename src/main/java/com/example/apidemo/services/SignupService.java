package com.example.apidemo.services;

import com.example.apidemo.entity.Signup;
import com.example.apidemo.repo.SignupRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SignupService {

    private final SignupRepo signupRepo;

    @Autowired
    public SignupService(SignupRepo signupRepo) {
        this.signupRepo = signupRepo;
    }

    public Signup saveSignup(Signup signup) {
        return signupRepo.save(signup);
    }

    public Signup findByEmail(String email) {
        return signupRepo.findByEmail(email);
    }
}