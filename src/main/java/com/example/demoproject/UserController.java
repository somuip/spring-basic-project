package com.example.demoproject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    UserService userService;

    @PostMapping("/add-user")
    public String addUser(@RequestBody User user){
        return userService.addUser(user);
    }

    @GetMapping("get-users")
    public List<User> getUsers(){
        return userService.getUsers();
    }

    @GetMapping("get-User")
    public User getUserById(@RequestParam("id")int id){
        return userService.getUser(id);
    }

    @DeleteMapping("/user/{id}")
    public String deleteById(@PathVariable("id") int id){
        return userService.deleteUserById(id);
    }

    @DeleteMapping("delete-all-users")
    public String deleteAllUsers(){
        return userService.deleteAllUsers();
    }

//    @PutMapping("/update-user-name")
}
