package pl.learn.theory.javaclass1.solid.open_close_principle.exc.service;

import pl.learn.theory.javaclass1.solid.open_close_principle.exc.domain.User;
import pl.learn.theory.javaclass1.solid.open_close_principle.exc.exception.UserNotFoundCheckedExc;

public interface UserService {

    User getUser() throws UserNotFoundCheckedExc;
}
