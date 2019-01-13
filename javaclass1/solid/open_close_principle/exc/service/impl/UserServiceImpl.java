package pl.learn.theory.javaclass1.solid.open_close_principle.exc.service.impl;

import pl.learn.theory.javaclass1.solid.open_close_principle.exc.domain.User;
import pl.learn.theory.javaclass1.solid.open_close_principle.exc.exception.UserNotFoundCheckedExc;
import pl.learn.theory.javaclass1.solid.open_close_principle.exc.repository.UserDao;
import pl.learn.theory.javaclass1.solid.open_close_principle.exc.service.UserService;

import java.util.Objects;

public class UserServiceImpl implements UserService {

    private UserDao userDao;

    public UserServiceImpl(UserDao userDao){
        this.userDao = Objects.requireNonNull(userDao);
    }

    @Override
    public User getUser() throws UserNotFoundCheckedExc {
        System.out.println("Director's hard work... ");
        return new User(userDao.getUserFromDao());
    }
}
