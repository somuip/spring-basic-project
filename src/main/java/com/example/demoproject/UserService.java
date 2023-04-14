package com.example.demoproject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    UserRepository userRepository;

    public String addUser(User user){
        userRepository.save(user);
        return "User added";
    }

    public List<User> getUsers(){
        return userRepository.findAll();
    }

    public User getUser(int id){
        return userRepository.findById(id).get();
    }

    public String deleteUserById(int id){
        userRepository.deleteById(id);
        return "deleted successfully";
    }

    public String deleteAllUsers(){
        userRepository.deleteAll();
        return "all users deleted";
    }

    public String updateUserName(int id, String name){
        User user = userRepository.findById(id).get();
        user.setName(name);
        return "user name updated successfully";
    }
}
