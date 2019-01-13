package pl.learn.theory.javaclass1.solid.open_close_principle.exc.repository;

import pl.learn.theory.javaclass1.solid.open_close_principle.exc.exception.UserNotFoundCheckedExc;

public interface UserDao {
    String getUserFromDao()throws UserNotFoundCheckedExc;

}
