package com.company.lesson3.service;

import com.company.lesson3.entity.User;
import com.company.lesson3.repository.UserRepository;

public class UserService {
    private UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User findUserById(Long id) {
        return userRepository.findUserById(id);
    }

    public User findUserByEmail(String email) {
        return userRepository.findUserByEmail(email);
    }

    public Boolean login(String email, String password) {
        User user = userRepository.findUserByEmail(email);
        if (user == null) {
            return false;
        }
        return user.getPassword().equals(password);
    }
}
