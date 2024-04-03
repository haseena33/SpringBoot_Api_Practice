
package com.example.apidemo.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.apidemo.entity.Signup;

@Repository
public interface SignupRepo extends JpaRepository<Signup, Long> {
    Signup findByEmail(String email);

}


