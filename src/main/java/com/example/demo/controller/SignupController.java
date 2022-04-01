package com.example.demo.controller;
import com.example.demo.model.UserModel;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/signup")
public class SignupController {

    @Autowired
    private UserService userService;

    @PostMapping("/signup")
    public String saveUser(@RequestBody UserModel user){
        userService.saveUser(user);
        return "New user is added";
    }

    @GetMapping("/getAll")
    public List<UserModel> list(){
        return userService.getAllUser();
    }







    /*@GetMapping("/get/{email}/{password}")
    public ResponseEntity<User> get(@PathVariable String email,@PathVariable String password){
        try{
            User h=userService.getLog(email,password);
            return new ResponseEntity<User>(h, HttpStatus.OK);
        }
        catch(NoSuchElementException e){
            return new ResponseEntity<User>(HttpStatus.NOT_FOUND);
        }
    }*/



}
