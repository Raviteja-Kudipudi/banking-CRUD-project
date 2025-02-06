package com.bankingapplication.service;

import com.bankingapplication.entity.User;
import java.util.List;
import java.util.Optional;

public interface UserService {
    User createUser(User user);
    User updateUser(Long id, User user);
    void deleteUser(Long id);
    Optional<User> getUserById(Long id);
    List<User> searchUsersByName(String name);
}
