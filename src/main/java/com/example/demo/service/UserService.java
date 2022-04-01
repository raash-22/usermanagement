package com.example.demo.service;
import com.example.demo.model.UserModel;
import java.util.List;

public interface UserService {

    public UserModel saveUser(UserModel user);
    public List<UserModel> getAllUser();
    public UserModel findByEmail(String email);
    public UserModel findByPassword(String password);

}
