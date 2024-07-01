package jm.task.core.jdbc;

import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;


public class Main {
    public static void main(String[] args) {
        UserService userService = new UserServiceImpl();

        userService.createUsersTable();

        userService.saveUser("Андрюша", "Румпельштицкин", (byte) 10);
        userService.saveUser("Катенька", "Дюбилкинс", (byte) 2);
        userService.saveUser("Сэмуэль", "Петушким", (byte) 5);
        userService.saveUser("Муська", "Крутышкины", (byte) 14);

        System.out.println(userService.getAllUsers());

//        userService.cleanUsersTable();
//
//        userService.dropUsersTable();

    }
}
