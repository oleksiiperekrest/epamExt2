package com.company.lesson3.repository;

import com.company.lesson3.entity.User;

public class UserRepository {

    private User[] users;

    public UserRepository(User[] users) {
        this.users = users;

    }

    public User findUserById(Long id) {
        for (User user : users) {
            if (user.getUserId().equals(id)) {
                return user;
            }
        }
        return null;
    }

    public User findUserByEmail(String email) {
        for (User user : users) {
            if (user.getEmail().equals(email)) {
                return user;
            }
        }
        return null;
    }
}
