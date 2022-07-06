package com.moseswilliamsiii.myrestfulservice.services;

import com.moseswilliamsiii.myrestfulservice.model.User;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

@Service
public class UserDaoServiceImpl implements UserDaoService{
    private static List<User> users = new ArrayList<>();

    private static int userCount = 3;

    static {
        users.add(new User(1,"Mike", LocalDate.of(1980, Month.FEBRUARY, 19)));
        users.add(new User(2,"Jeff", LocalDate.of(1988, Month.MARCH, 17)));
        users.add(new User(3,"Tim", LocalDate.of(1990, Month.JULY, 7)));
    }

    @Override
    public List<User> findAll() {
        return users;
    }

    @Override
    public User save(User user) {
        if(user.getId() == null){
            userCount++;
        }
        users.add(user);
        return user;
    }

    @Override
    public User findUser(int id) {
        for(User user : users) {
            if (user.getId() == id) {
                return user;
            }
        }
        return null;
    }


}
