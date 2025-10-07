package com.example.spotstar.Service;

import com.example.spotstar.Model.User;
import com.example.spotstar.Repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SignupService {
    @Autowired
    UserRepo userRepo;
    public List<User> getData() {
        return userRepo.findAll();
    }

    public String addUser(User user) {
        userRepo.save(user);
        return "User data Added successfully";
    }
}
