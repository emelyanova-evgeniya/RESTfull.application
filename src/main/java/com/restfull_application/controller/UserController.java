package com.restfull_application.controller;

import com.restfull_application.model.User;
import com.restfull_application.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class UserController {

    private UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/create_user")
    @ResponseStatus(HttpStatus.CREATED)
    public User createUser(@RequestBody User user) {
        return userService.createUser(user);
    }

    @GetMapping("/all_users")
    @ResponseStatus(HttpStatus.OK)
    public List<User> getAllUsers() {
        return userService.getAllUsers();
    }

    @GetMapping("/get_user/{id}")
    @ResponseStatus(HttpStatus.OK)
    public User getUserById(@PathVariable("id") long userId) {
        return userService.getUserById(userId);
    }

    @PutMapping("/update_user/{id}")
    @ResponseStatus(HttpStatus.OK)
    public User updateUser(@PathVariable("id") long userId, @RequestBody User user) {
        return userService.updateUser(userId, user);
    }

    @DeleteMapping("/delete_user/{id}")
    @ResponseStatus(HttpStatus.OK)
    public String deleteEmployee(@PathVariable("id") long userId) {
        userService.deleteUser(userId);
        return("Employee deleted successfully");
    }
}
