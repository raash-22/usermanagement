package com.example.demo.service;

import com.example.demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import com.example.demo.model.UserModel;

import org.springframework.stereotype.Service;
import java.util.List;


@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userrepository;

    @Override
    public UserModel saveUser(UserModel user) {
        return userrepository.save(user);
    }

    @Override
    public List<UserModel> getAllUser() {
        return userrepository.findAll();
    }

    @Override
    public UserModel findByEmail(String email) {
        return userrepository.findEmail(email);
    }

    @Override
    public UserModel findByPassword(String password) {
        return userrepository.findByPassword(password);
    }
}
