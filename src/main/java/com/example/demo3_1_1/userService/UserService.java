package com.example.demo3_1_1.userService;

import com.example.demo3_1_1.model.User;

import java.util.List;

public interface UserService {
    List<User> getAllUsers();
    void add (User user);
    void delete (int id);
    void edit(User user);
    User getUserById(int id);
    void updateUser(User user);

}
