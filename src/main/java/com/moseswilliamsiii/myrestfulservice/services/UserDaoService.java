package com.moseswilliamsiii.myrestfulservice.services;

import com.moseswilliamsiii.myrestfulservice.model.User;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public interface UserDaoService {
    //find all users
    List<User> findAll();

    User save(User user);

    User findUser(int id);

}
