package com.example.demo.repository;

import com.example.demo.model.UserModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository

public interface UserRepository extends JpaRepository<UserModel,Integer> {
    @Query("SELECT u FROM UserModel u WHERE u.email=?1")
    UserModel findEmail(String email);
    @Query("SELECT u FROM UserModel u WHERE u.password=?1")
    UserModel findByPassword(String password);
}
