package pl.learn.theory.javaclass1.solid.open_close_principle.exc.application;

import pl.learn.theory.javaclass1.solid.open_close_principle.exc.controller.UserController;
import pl.learn.theory.javaclass1.solid.open_close_principle.exc.controller.impl.UserControllerImpl;
import pl.learn.theory.javaclass1.solid.open_close_principle.exc.repository.UserDao;
import pl.learn.theory.javaclass1.solid.open_close_principle.exc.repository.impl.DbReader;
import pl.learn.theory.javaclass1.solid.open_close_principle.exc.service.UserService;
import pl.learn.theory.javaclass1.solid.open_close_principle.exc.service.impl.UserServiceImpl;

public class ConsoleApp {

    public static void main(String[] args) {
        // po kolei:
        // reposytorium:
        UserDao dbDao = new DbReader();

        // potrzebujemy service:
        UserService userService = new UserServiceImpl(dbDao);

        // i controller
        UserController userController = new UserControllerImpl(userService);

        userController.renderUserPage();
    }
}
