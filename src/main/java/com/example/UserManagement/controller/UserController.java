package com.example.UserManagement.controller;

import com.example.UserManagement.data.User;
import com.example.UserManagement.data.UserRepo;
import com.example.UserManagement.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping(name = "/user")
    public List<User>getAllUser(){return userService.getAllUser();}
//@GetMapping(name = "/getUser/{id}")
//    public User getUserById(@PathVariable int id){return userService.getUserById(id);}
@PostMapping(name = "/createUser")
    public User createUser(@RequestBody User user){return userService.createUser(user);}
@PutMapping(name = "/updateUser")
    public User updateUser(@RequestBody User user){return userService.updateUser(user);}
@DeleteMapping(name = "/deleteUser/{id}")
    public void deleteUser(@PathVariable int id){userService.deleteUser(id);}

}
