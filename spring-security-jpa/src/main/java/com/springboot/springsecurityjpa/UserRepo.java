package com.springboot.springsecurityjpa;

import java.lang.StackWalker.Option;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User,Integer> {
    
    Optional<User>findByUserName(String userName);
}
