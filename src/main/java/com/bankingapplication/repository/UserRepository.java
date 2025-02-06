package com.bankingapplication.repository;

import com.bankingapplication.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;
import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
    
    Optional<User> findByEmail(String email);  // Custom query to find a user by email
    
    List<User> findByNameContainingIgnoreCase(String name);  // Custom method for dynamic name search
}
