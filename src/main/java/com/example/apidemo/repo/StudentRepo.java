package com.example.apidemo.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.apidemo.entity.Student;
@Repository
public interface StudentRepo extends JpaRepository<Student , Long> {

}
