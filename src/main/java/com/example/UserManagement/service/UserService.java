package com.example.UserManagement.service;

import com.example.UserManagement.data.User;
import com.example.UserManagement.data.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {
    @Autowired
    private UserRepo userRepo;

    public List<User> getAllUser() {
        return userRepo.findAll();
    }

    public User getUserById(int id) {
        Optional<User> UserObj = userRepo.findById(id);
        if (UserObj.isPresent()) {
            return UserObj.get();
        }
        return null;
    }

    public User createUser(User user) {
        return userRepo.save(user);
    }

    public User updateUser(User user) {
        return userRepo.save(user);
    }

    public void deleteUser(int id) {
      userRepo.deleteById(id);
    }
}
