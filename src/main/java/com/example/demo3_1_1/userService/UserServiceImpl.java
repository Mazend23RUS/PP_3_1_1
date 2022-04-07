package com.example.demo3_1_1.userService;

import com.example.demo3_1_1.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.example.demo3_1_1.userDao.UserDao;


import java.util.List;


@Service
public class UserServiceImpl implements UserService {

    private UserDao userDao;

    @Autowired
    public void setUserDAO(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    @Transactional
    public List<User> getAllUsers() {
        return userDao.getAllUsers();
    }

    @Override
    @Transactional
    public void add(User user) {
        userDao.add(user);
    }

    public void updateUser(User user) {
        userDao.updateUser(user);
    }


    @Override
    @Transactional
    public void delete(int id) {
        userDao.delete(id);
    }

    @Override
    @Transactional
    public void edit(User user) {
        userDao.edit(user);

    }

    @Override
    public User getUserById(int id) {
        return userDao.findUserById(id);
    }
}