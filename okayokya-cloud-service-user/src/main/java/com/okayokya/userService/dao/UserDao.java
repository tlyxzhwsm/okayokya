package com.okayokya.userService.dao;

import com.okayokya.userService.model.User;
import org.springframework.stereotype.Repository;

@Repository()
public interface UserDao {

    int register(User user);
    User login(User user);
}
