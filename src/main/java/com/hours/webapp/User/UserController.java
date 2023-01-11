package com.hours.webapp.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class UserController {
    @Autowired
    UserRepository userresp;
    @RequestMapping("/")
    public String helloworld(){
        return "hello world";
    }
    @GetMapping("/getUsers")
    List<User> gettusers(){

        return userresp.findAll();

    }
    @GetMapping("/getUser")
    User getuser(){
        return userresp.findById(1).orElse(null);
    }
    @PostMapping("/createUser")
    User createUser(@RequestBody  User user){
        return userresp.save(user);
    }

}
