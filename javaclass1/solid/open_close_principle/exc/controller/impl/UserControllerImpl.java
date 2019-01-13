package pl.learn.theory.javaclass1.solid.open_close_principle.exc.controller.impl;

import pl.learn.theory.javaclass1.solid.open_close_principle.exc.controller.UserController;
import pl.learn.theory.javaclass1.solid.open_close_principle.exc.exception.UserNotFoundCheckedExc;
import pl.learn.theory.javaclass1.solid.open_close_principle.exc.service.UserService;

import java.util.Objects;

public class UserControllerImpl implements UserController {

    private UserService userService;

    public UserControllerImpl(UserService userService) {
        this.userService = Objects.requireNonNull(userService);

    }

    @Override
    public String renderUserPage() {
        System.out.println("Making html with user data");
        String html = "";
        try {
            userService.getUser();
        } catch (UserNotFoundCheckedExc userNotFoundCheckedExc){
            userNotFoundCheckedExc.printStackTrace();
        }
        return html;
    }
}
