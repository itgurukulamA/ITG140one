package com.example.demo.test;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepositiory extends JpaRepository<Question, Integer> {

}
