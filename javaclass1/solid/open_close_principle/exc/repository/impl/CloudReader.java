package pl.learn.theory.javaclass1.solid.open_close_principle.exc.repository.impl;

import pl.learn.theory.javaclass1.solid.open_close_principle.exc.exception.UserNotFoundCheckedExc;
import pl.learn.theory.javaclass1.solid.open_close_principle.exc.repository.UserDao;

public class CloudReader implements UserDao {
    @Override
    public String getUserFromDao() throws UserNotFoundCheckedExc {
        return "";
    }
}
