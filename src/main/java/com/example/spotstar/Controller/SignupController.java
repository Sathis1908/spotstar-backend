package com.example.spotstar.Controller;

import com.example.spotstar.Model.User;
import com.example.spotstar.Service.SignupService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "https://skspotstar.netlify.app")
public class SignupController {
    @Autowired
    SignupService signupService;

    @GetMapping("/userlist")
    public List<User> ShowData()
    {
        return signupService.getData();
    }

    @PostMapping("/adduser")
    public String addUser(@RequestBody User user)
    {
        return signupService.addUser(user);
    }

    @PutMapping("/changepassword")
    public String updateUser(@RequestBody User user)
    {
        return signupService.addUser(user);
    }
}
