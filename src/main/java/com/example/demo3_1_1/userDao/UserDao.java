package com.example.demo3_1_1.userDao;


import com.example.demo3_1_1.model.User;

import java.util.List;

public interface UserDao {
    List<User> getAllUsers();
    void add (User user);
    User findUserById (int id);
    void delete (int id);
    User edit(User user);

    void updateUser(User user);
}
