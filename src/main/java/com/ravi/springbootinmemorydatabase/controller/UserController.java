package com.ravi.springbootinmemorydatabase.controller;

import com.ravi.springbootinmemorydatabase.model.Users;
import com.ravi.springbootinmemorydatabase.service.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping(value = "/rest/user")
public class UserController {

    @Autowired
    private UserRepository userService;

    @RequestMapping(value = "/all" , method = RequestMethod.GET)
    public List<Users> getAllUsers(){
      return userService.findAll();
    }

    @RequestMapping(value = "/name/{name}" , method = RequestMethod.GET)
    public List<Users> getUsersByName(@PathVariable String name){
        return userService.findByName(name);
    }

    @RequestMapping(value = "load", method = RequestMethod.POST)
    public Users add(@RequestBody final Users user){
//        List<User> userses = new ArrayList<>();
//        userses.add(user);
        return userService.save(user);
    }

}
