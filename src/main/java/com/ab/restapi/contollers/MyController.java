package com.ab.restapi.contollers;

import com.ab.restapi.model.User;
import com.ab.restapi.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/api")
public class MyController {
    @Autowired
    UserService userService;

    @PostMapping("/register")
    public User registeraion(@RequestBody User user){
        userService.userRegister(user);
         return null;
    }
}
