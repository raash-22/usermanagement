package com.example.demo.controller;

import com.example.demo.model.UserModel;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping("/login")
public class LoginController {

    @Autowired
    private UserService userService;

    @PostMapping("/login")
    public ResponseEntity<UserModel> checkUser(@RequestBody UserModel data){
        UserModel emailExists=userService.findByEmail(data.getEmail());
        String passwordExists=emailExists.getPassword();
        String enteredPassword=data.getPassword();
        if(emailExists.getEmail().isEmpty()){
            return new ResponseEntity<UserModel>(HttpStatus.NOT_FOUND);
        }
        else if(passwordExists.matches(enteredPassword)){
            return new ResponseEntity<UserModel>(HttpStatus.OK);
        }
        else {
            return new ResponseEntity<UserModel>(HttpStatus.NOT_FOUND);
        }


    }
}
